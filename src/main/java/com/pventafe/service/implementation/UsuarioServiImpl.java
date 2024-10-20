package com.pventafe.service.implementation;

import com.pventafe.model.UsuarioMod;
import com.pventafe.persistence.repository.interfaces.IUsuarioRepo;
import com.pventafe.service.interfaces.IUsuarioServi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiImpl implements IUsuarioServi {

    @Autowired
    private IUsuarioRepo usuarioRepo;
    @Override
    public List<UsuarioMod> getUsuarioUserAndPassword(String user, String password) {
            return usuarioRepo.findUsuarioUserAndPassword(user,password);
    }
}
