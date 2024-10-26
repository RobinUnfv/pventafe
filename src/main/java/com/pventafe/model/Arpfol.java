package com.pventafe.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Arpfol {
    private String noCia;
    private String noOrden;
    private String grupo;
    private String noCliente;
    private String noArti;
    private String tipoArti;
    private String artiNuevo;
    private String bodega;
    private double cantComp;
    private double cantSolicitada;
    private double cantEntreg;
    private double cantAsignada;
    private double cantReasignada;
    private String fechaRegistro;
    private double precio;
    private double totLinea;
    private String estado;
    private double dsctoCliente;
    private double dPromo;
    private double igv;
    private int noLinea;
    private double pDscto3;
    private double mDscto2;
    private double mDscto3;
    private double impIgv;
    private double precioSigv;
    private double totalLin;
    private String descripcion;
    private String parte;
    private String tipoBs;
    private String indPideLote;
    private double operExoneradas;
    private double operGratuitas;
    private double operGravadas;
    private double operInafectas;
    private String tipoAfectacion;
    private double precIgv;
    private String medida;
}
