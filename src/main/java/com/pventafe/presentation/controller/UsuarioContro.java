package com.pventafe.presentation.controller;

import com.pventafe.model.UsuarioMod;
import com.pventafe.service.interfaces.IUsuarioServi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioContro {
    @Autowired
    private IUsuarioServi usuarioServi;

    @GetMapping("/usuario")
    public List<UsuarioMod> getUsuarios(@RequestParam String user, @RequestParam String password) {
        return usuarioServi.getUsuarioUserAndPassword(user,password);
    }

}
