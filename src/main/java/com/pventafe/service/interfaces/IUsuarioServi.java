package com.pventafe.service.interfaces;

import com.pventafe.model.UsuarioMod;

import java.util.List;

public interface IUsuarioServi {
    List<UsuarioMod> getUsuarioUserAndPassword(String user, String password);
}
