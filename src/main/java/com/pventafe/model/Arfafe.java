package com.pventafe.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Arfafe {
    @JsonProperty("tipoDoc")
    private String tipoDoc;

    @JsonProperty("tipoCliente")
    private String tipoCliente;

    @JsonProperty("tipoCambio")
    private double tipoCambio;

    @JsonProperty("indDoc")
    private String indDoc;

    @JsonProperty("mDsctoGlobal")
    private double mDsctoGlobal;

}
