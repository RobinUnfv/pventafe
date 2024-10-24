package com.pventafe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmisionComprobantePagoResponse {
    private String fecha;
    private String resultado;
}
