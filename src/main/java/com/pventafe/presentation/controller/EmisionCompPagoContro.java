package com.pventafe.presentation.controller;

import com.pventafe.model.EmisionComprobantePago;
import com.pventafe.model.EmisionComprobantePagoResponse;
import com.pventafe.presentation.exception.BadRequestException;
import com.pventafe.service.interfaces.IEmisionCompPagoServi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/emisioncp")
public class EmisionCompPagoContro {
    @Autowired
    private IEmisionCompPagoServi iEmisionCpServi;
    @PostMapping
    public ResponseEntity<EmisionComprobantePagoResponse> emisionComprobantePago(@RequestBody EmisionComprobantePago emisionComprobantePago) {
        if (emisionComprobantePago.getArpfoe().getNoCia().length() != 2) {
            throw new BadRequestException("El parámetro de compañia debe tener 2 caracteres");
        }
        if (emisionComprobantePago.getArpfoe().getNoCliente() == null ||
                emisionComprobantePago.getArpfoe().getNoCliente().isEmpty() ) {
            throw new BadRequestException("El parámetro de codigo de cliente no debe ser nulo o vacío");
        }
        if (emisionComprobantePago.getArpfoe().getTValorVenta() <= 0) {
            throw new BadRequestException("El parametro de valor venta total debe de ser mayor a cero.");
        }
        if (emisionComprobantePago.getArpfoe().getArpfolList().isEmpty()) {
            throw new BadRequestException("No tiene items de venta.");
        }
        // Obtener URL de servicio
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{noCia}")
                .buildAndExpand(emisionComprobantePago.getArpfoe().getNoCia()).toUri();
        return ResponseEntity.created(location).body(iEmisionCpServi.emisionCompPago(emisionComprobantePago));

    }
}
