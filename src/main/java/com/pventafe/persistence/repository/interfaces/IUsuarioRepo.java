package com.pventafe.persistence.repository.interfaces;

import com.pventafe.model.UsuarioMod;

import java.util.List;

public interface IUsuarioRepo {
    List<UsuarioMod> findUsuarioUserAndPassword(String user, String password);
}
