package com.pventafe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioMod {

    private String usuario;
    private String nombre;
    private String centro;
    private String centroCosto;
    private String transPtoVenta;
    private String codEmp;
    private String tipUsua;
    private String email;
    private String noCia;
    private String noClienteOnline;
    private String razonSocial;

}
