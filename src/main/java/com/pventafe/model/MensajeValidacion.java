package com.pventafe.model;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MensajeValidacion {
    private String nomProceso;
    private int codError;
    private String msjError;
    private String fecProceso;
}
