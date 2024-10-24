package com.pventafe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmisionComprobantePagoResponse {
    private String cia;
    private String noCliente;
    private String noOrden;
    private String noGuia;
    private String noFactu;
    private Date fecha;
    private String resultado;
}
