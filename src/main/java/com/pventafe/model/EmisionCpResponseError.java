package com.pventafe.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class EmisionCpResponseError extends EmisionComprobantePagoResponse {
    private ResEmisionCp resEmisionCp;
}
