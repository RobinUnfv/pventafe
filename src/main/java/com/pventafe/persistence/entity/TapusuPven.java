package com.pventafe.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TapusuPven {
    private String noCia;
    private String usuario;
    private String nombre;
    private String tipusua;
    private String centro;
    private String puesto;
    private String estado;
    private String codEmp;
    private String indPermisos;
    private String centroCosto;
    private String clave;
    private String email;
}
