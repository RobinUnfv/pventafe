package com.pventafe.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmisionCpResponseOk extends EmisionComprobantePagoResponse {
    private String cia;
    private String noCliente;
    private String noOrden;
    private String noGuia;
    private String noFactu;
}
