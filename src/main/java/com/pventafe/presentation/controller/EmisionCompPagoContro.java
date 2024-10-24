package com.pventafe.presentation.controller;

import com.pventafe.model.EmisionComprobantePago;
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
    @PostMapping
    public ResponseEntity<?> emisionComprobantePago(@RequestBody EmisionComprobantePago emisionComprobantePago) {
        // Obtener URL de servicio
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{cia}")
                .buildAndExpand(emisionComprobantePago.getArpfoe().getNoCia()).toUri();
        return null;
    }
}
