package com.pventafe.presentation.controller;

import com.pventafe.model.EmisionComprobantePago;
import com.pventafe.model.EmisionComprobantePagoResponse;
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
        System.out.println(emisionComprobantePago.getArpfoe().toString());
        // Obtener URL de servicio
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{noCia}")
                .buildAndExpand(emisionComprobantePago.getArpfoe().getNoCia()).toUri();
        return ResponseEntity.created(location).body(iEmisionCpServi.emisionCompPago(emisionComprobantePago));

    }
}
