package com.pventafe.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Arpfoe {
    @JsonProperty("noCia")
    private String noCia;

    @JsonProperty("noOrden")
    private String noOrden;

    @JsonProperty("grupo")
    private String grupo;

    @JsonProperty("noCliente")
    private String noCliente;

    @JsonProperty("division")
    private String division;

    @JsonProperty("noVendedor")
    private String noVendedor;

    @JsonProperty("codTped")
    private String codTped;

    @JsonProperty("codFpago")
    private String codFpago;

    @JsonProperty("fRecepcion")
    private String fRecepcion;

    @JsonProperty("fechaRegistro")
    private String fechaRegistro;

    @JsonProperty("fAprobacion")
    private String fAprobacion;

    @JsonProperty("fechaEntrega")
    private String fechaEntrega;

    @JsonProperty("fechaEntregaReal")
    private String fechaEntregaReal;

    @JsonProperty("fechaVence")
    private String fechaVence;

    @JsonProperty("tipoPrecio")
    private String tipoPrecio;

    @JsonProperty("moneda")
    private String moneda;

    @JsonProperty("subTotal")
    private double subTotal;

    @JsonProperty("tImpuesto")
    private double tImpuesto;

    @JsonProperty("tPrecio")
    private double tPrecio;

    @JsonProperty("impuesto")
    private double impuesto;

    @JsonProperty("estado")
    private String estado;

    @JsonProperty("bodega")
    private String bodega;

    @JsonProperty("cuser")
    private String cuser;

    @JsonProperty("igv")
    private double igv;

    @JsonProperty("indGuiado")
    private String indGuiado;

    @JsonProperty("direccionComercial")
    private String direccionComercial;

    @JsonProperty("motivoTraslado")
    private String motivoTraslado;

    @JsonProperty("nombreCliente")
    private String nombreCliente;

    @JsonProperty("ruc")
    private String ruc;

    @JsonProperty("tDescuento")
    private double tDescuento;

    @JsonProperty("tipoDocRef")
    private String tipoDocRef;

    @JsonProperty("codClasPed")
    private String codClasPed;

    @JsonProperty("tipoFpago")
    private String tipoFpago;

    @JsonProperty("tDsctoGlobal")
    private double tDsctoGlobal;

    @JsonProperty("tValorVenta")
    private double tValorVenta;

    @JsonProperty("codTienda")
    private String codTienda;

    @JsonProperty("nombTienda")
    private String nombTienda;

    @JsonProperty("direcTienda")
    private String direcTienda;

    @JsonProperty("almaOrigen")
    private String almaOrigen;

    @JsonProperty("almaDestino")
    private String almaDestino;

    @JsonProperty("tipoArti")
    private String tipoArti;

    @JsonProperty("tipoDocCli")
    private String tipoDocCli;

    @JsonProperty("numDocCli")
    private String numDocCli;

    @JsonProperty("codDirEntrega")
    private String codDirEntrega;

    @JsonProperty("codDirSalida")
    private String codDirSalida;

    @JsonProperty("noClienteSalida")
    private String noClienteSalida;

    @JsonProperty("estadoAsignacion")
    private String estadoAsignacion;

    @JsonProperty("listaPrecAnt")
    private String listaPrecAnt;

    @JsonProperty("usuarioAprod")
    private String usuarioAprod;

    @JsonProperty("indVtaAnticipada")
    private String indVtaAnticipada;

    @JsonProperty("totalBruto")
    private double totalBruto;

    @JsonProperty("codTPed1")
    private String codTPed1;

    @JsonProperty("codTpedb")
    private String codTpedb;

    @JsonProperty("codTpedn")
    private String codTpedn;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("indPvent")
    private String indPvent;

    @JsonProperty("centro")
    private String centro;

    @JsonProperty("indFactura1")
    private String indFactura1;

    @JsonProperty("indBoleta1")
    private String indBoleta1;

    @JsonProperty("codCaja")
    private String codCaja;

    @JsonProperty("cajera")
    private String cajera;

    @JsonProperty("convenio")
    private String convenio;

    @JsonProperty("centroCosto")
    private String centroCosto;

    @JsonProperty("indNotaCred")
    private String indNotaCred;

    @JsonProperty("indExportacion")
    private String indExportacion;

    @JsonProperty("consumo")
    private String consumo;

    @JsonProperty("indFerias")
    private String indFerias;

    @JsonProperty("indProvincia")
    private String indProvincia;

    @JsonProperty("redondeo")
    private double redondeo;

    @JsonProperty("indCodBarra")
    private String indCodBarra;

    @JsonProperty("indFactTexto")
    private String indFactTexto;

    @JsonProperty("indGuiaTexto")
    private String indGuiaTexto;

    @JsonProperty("facturaTexto")
    private String facturaTexto;

    @JsonProperty("impuestoFlete")
    private double impuestoFlete;

    @JsonProperty("onLine")
    private String onLine;

    @JsonProperty("contNeto")
    private String contNeto;

    @JsonProperty("indProforma1")
    private String indProforma1;

    @JsonProperty("aCta")
    private double aCta;

    @JsonProperty("entrega")
    private String entrega;

    @JsonProperty("horaEntrega")
    private String horaEntrega;

    @JsonProperty("indPideLote")
    private String indPideLote;

    @JsonProperty("motConting")
    private String motConting;

    @JsonProperty("operExoneradas")
    private double operExoneradas;

    @JsonProperty("operGratuitas")
    private double operGratuitas;

    @JsonProperty("operGravadas")
    private double operGravadas;

    @JsonProperty("tipoOperacion")
    private String tipoOperacion;

    @JsonProperty("guiaTemp")
    private String guiaTemp;

    List<Arpfol> arpfolList;
}
