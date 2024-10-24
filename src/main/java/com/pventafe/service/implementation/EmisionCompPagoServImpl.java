package com.pventafe.service.implementation;

import com.pventafe.model.Arpfol;
import com.pventafe.model.EmisionComprobantePago;
import com.pventafe.model.EmisionComprobantePagoResponse;
import com.pventafe.persistence.repository.interfaces.IComprobantePagoRepo;
import com.pventafe.service.interfaces.IEmisionCompPagoServi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmisionCompPagoServImpl implements IEmisionCompPagoServi {

    @Autowired
    private IComprobantePagoRepo iComprobantePagoRepo;
    @Override
    public EmisionComprobantePagoResponse emisionCompPago(EmisionComprobantePago emisioncp) {
        return null;
    }

    @Override
    public String emisionCpXmlInput(EmisionComprobantePago emisioncp) {
        StringBuilder sb = new StringBuilder();
        sb.append("<emisionComprobantePago>");
        sb.append(" <arpfoe>");
        sb.append("   <noCia>");sb.append(emisioncp.getArpfoe().getNoCia());sb.append("</noCia>");
        sb.append("   <noOrden></noOrden>");
        sb.append("   <grupo>00</grupo>");
        sb.append("   <noCliente>");sb.append(emisioncp.getArpfoe().getNoCliente());sb.append("</noCliente>");
        sb.append("   <grupo>003</grupo>");
        sb.append("   <noVendedor>");sb.append(emisioncp.getArpfoe().getNoVendedor());sb.append("</noVendedor>");
        sb.append("   <codTped>");sb.append(emisioncp.getArpfoe().getCodTped());sb.append("</codTped>");
        sb.append("   <codFpago>");sb.append(emisioncp.getArpfoe().getCodFpago());sb.append("</codFpago>");
        sb.append("   <fRecepcion>");sb.append(emisioncp.getArpfoe().getFRecepcion());sb.append("</fRecepcion>");
        sb.append("   <fechaRegistro>");sb.append(emisioncp.getArpfoe().getFechaRegistro());sb.append("</fechaRegistro>");
        sb.append("   <fAprobacion>");sb.append(emisioncp.getArpfoe().getFAprobacion());sb.append("</fAprobacion>");
        sb.append("   <fechaEntrega>");sb.append(emisioncp.getArpfoe().getFechaEntrega());sb.append("</fechaEntrega>");
        sb.append("   <fechaEntregaReal>");sb.append(emisioncp.getArpfoe().getFechaEntregaReal());sb.append("</fechaEntregaReal>");
        sb.append("   <fechaVence>");sb.append(emisioncp.getArpfoe().getFechaVence());sb.append("</fechaVence>");
        sb.append("   <tipoPrecio>");sb.append(emisioncp.getArpfoe().getTipoPrecio());sb.append("</tipoPrecio>");
        sb.append("   <moneda>");sb.append(emisioncp.getArpfoe().getMoneda());sb.append("</moneda>");
        sb.append("   <subTotal>");sb.append(emisioncp.getArpfoe().getSubTotal());sb.append("</subTotal>");
        sb.append("   <tImpuesto>");sb.append(emisioncp.getArpfoe().getTImpuesto());sb.append("</tImpuesto>");
        sb.append("   <tPrecio>");sb.append(emisioncp.getArpfoe().getTPrecio());sb.append("</tPrecio>");
        sb.append("   <impuesto>");sb.append(emisioncp.getArpfoe().getImpuesto());sb.append("</impuesto>");
        sb.append("   <estado>");sb.append(emisioncp.getArpfoe().getEstado());sb.append("</estado>");
        sb.append("   <bodega>");sb.append(emisioncp.getArpfoe().getBodega());sb.append("</bodega>");
        sb.append("   <cuser>");sb.append(emisioncp.getArpfoe().getCuser());sb.append("</cuser>");
        sb.append("   <igv>");sb.append(emisioncp.getArpfoe().getIgv());sb.append("</igv>");
        sb.append("   <indGuiado>");sb.append(emisioncp.getArpfoe().getIndGuiado());sb.append("</indGuiado>");
        sb.append("   <direccionComercial>");sb.append(emisioncp.getArpfoe().getDireccionComercial());sb.append("</direccionComercial>");
        sb.append("   <motivoTraslado>");sb.append(emisioncp.getArpfoe().getMotivoTraslado());sb.append("</motivoTraslado>");
        sb.append("   <nombreCliente>");sb.append(emisioncp.getArpfoe().getNombreCliente());sb.append("</nombreCliente>");
        sb.append("   <ruc>");sb.append(emisioncp.getArpfoe().getRuc());sb.append("</ruc>");
        sb.append("   <tDescuento>");sb.append(emisioncp.getArpfoe().getTDescuento());sb.append("</tDescuento>");
        sb.append("   <tipoDocRef>");sb.append(emisioncp.getArpfoe().getTipoDocRef());sb.append("</tipoDocRef>");
        sb.append("   <codClasPed>");sb.append(emisioncp.getArpfoe().getCodClasPed());sb.append("</codClasPed>");
        sb.append("   <tipoFpago>");sb.append(emisioncp.getArpfoe().getTipoFpago());sb.append("</tipoFpago>");
        sb.append("   <tDsctoGlobal>");sb.append(emisioncp.getArpfoe().getTDsctoGlobal());sb.append("</tDsctoGlobal>");
        sb.append("   <tValorVenta>");sb.append(emisioncp.getArpfoe().getTValorVenta());sb.append("</tValorVenta>");
        sb.append("   <codTienda>");sb.append(emisioncp.getArpfoe().getCodTienda());sb.append("</codTienda>");
        sb.append("   <nombTienda>");sb.append(emisioncp.getArpfoe().getNombTienda());sb.append("</nombTienda>");
        sb.append("   <direcTienda>");sb.append(emisioncp.getArpfoe().getDirecTienda());sb.append("</direcTienda>");
        sb.append("   <almaOrigen>");sb.append(emisioncp.getArpfoe().getAlmaOrigen());sb.append("</almaOrigen>");
        sb.append("   <almaDestino>");sb.append(emisioncp.getArpfoe().getAlmaDestino());sb.append("</almaDestino>");
        sb.append("   <tipoArti>");sb.append(emisioncp.getArpfoe().getTipoArti());sb.append("</tipoArti>");
        sb.append("   <tipoDocCli>");sb.append(emisioncp.getArpfoe().getTipoDocCli());sb.append("</tipoDocCli>");
        sb.append("   <numDocCli>");sb.append(emisioncp.getArpfoe().getNumDocCli());sb.append("</numDocCli>");
        sb.append("   <codDirEntrega>");sb.append(emisioncp.getArpfoe().getCodDirEntrega());sb.append("</codDirEntrega>");
        sb.append("   <codDirSalida>");sb.append(emisioncp.getArpfoe().getCodDirSalida());sb.append("</codDirSalida>");
        sb.append("   <noClienteSalida>");sb.append(emisioncp.getArpfoe().getNoClienteSalida());sb.append("</noClienteSalida>");
        sb.append("   <estadoAsignacion>");sb.append(emisioncp.getArpfoe().getEstadoAsignacion());sb.append("</estadoAsignacion>");
        sb.append("   <listaPrecAnt>");sb.append(emisioncp.getArpfoe().getListaPrecAnt());sb.append("</listaPrecAnt>");
        sb.append("   <usuarioAprod>");sb.append(emisioncp.getArpfoe().getUsuarioAprod());sb.append("</usuarioAprod>");
        sb.append("   <indVtaAnticipada>");sb.append(emisioncp.getArpfoe().getIndVtaAnticipada());sb.append("</indVtaAnticipada>");
        sb.append("   <totalBruto>");sb.append(emisioncp.getArpfoe().getTotalBruto());sb.append("</totalBruto>");
        sb.append("   <codTPed1>");sb.append(emisioncp.getArpfoe().getCodTPed1());sb.append("</codTPed1>");
        sb.append("   <codTpedb>");sb.append(emisioncp.getArpfoe().getCodTpedb());sb.append("</codTpedb>");
        sb.append("   <codTpedn>");sb.append(emisioncp.getArpfoe().getCodTpedn());sb.append("</codTpedn>");
        sb.append("   <tipo>");sb.append(emisioncp.getArpfoe().getTipo());sb.append("</tipo>");
        sb.append("   <indPvent>");sb.append(emisioncp.getArpfoe().getIndPvent());sb.append("</indPvent>");
        sb.append("   <centro>");sb.append(emisioncp.getArpfoe().getCentro());sb.append("</centro>");
        sb.append("   <indFactura1>");sb.append(emisioncp.getArpfoe().getIndFactura1());sb.append("</indFactura1>");
        sb.append("   <indBoleta1>");sb.append(emisioncp.getArpfoe().getIndBoleta1());sb.append("</indBoleta1>");
        sb.append("   <codCaja>");sb.append(emisioncp.getArpfoe().getCodCaja());sb.append("</codCaja>");
        sb.append("   <cajera>");sb.append(emisioncp.getArpfoe().getCajera());sb.append("</cajera>");
        sb.append("   <convenio>");sb.append(emisioncp.getArpfoe().getConvenio());sb.append("</convenio>");
        sb.append("   <centroCosto>");sb.append(emisioncp.getArpfoe().getCentroCosto());sb.append("</centroCosto>");
        sb.append("   <indNotaCred>");sb.append(emisioncp.getArpfoe().getIndNotaCred());sb.append("</indNotaCred>");
        sb.append("   <indExportacion>");sb.append(emisioncp.getArpfoe().getIndExportacion());sb.append("</indExportacion>");
        sb.append("   <consumo>");sb.append(emisioncp.getArpfoe().getConsumo());sb.append("</consumo>");
        sb.append("   <indFerias>");sb.append(emisioncp.getArpfoe().getIndFerias());sb.append("</indFerias>");
        sb.append("   <indProvincia>");sb.append(emisioncp.getArpfoe().getIndProvincia());sb.append("</indProvincia>");
        sb.append("   <redondeo>");sb.append(emisioncp.getArpfoe().getRedondeo());sb.append("</redondeo>");
        sb.append("   <indCodBarra>");sb.append(emisioncp.getArpfoe().getIndCodBarra());sb.append("</indCodBarra>");
        sb.append("   <indFactTexto>");sb.append(emisioncp.getArpfoe().getIndFactTexto());sb.append("</indFactTexto>");
        sb.append("   <indGuiaTexto>");sb.append(emisioncp.getArpfoe().getIndGuiaTexto());sb.append("</indGuiaTexto>");
        sb.append("   <facturaTexto>");sb.append(emisioncp.getArpfoe().getIndFactTexto());sb.append("</facturaTexto>");
        sb.append("   <impuestoFlete>");sb.append(emisioncp.getArpfoe().getImpuestoFlete());sb.append("</impuestoFlete>");
        sb.append("   <onLine>");sb.append(emisioncp.getArpfoe().getOnLine());sb.append("</onLine>");
        sb.append("   <contNeto>");sb.append(emisioncp.getArpfoe().getContNeto());sb.append("</contNeto>");
        sb.append("   <indProforma1>");sb.append(emisioncp.getArpfoe().getIndProforma1());sb.append("</indProforma1>");
        sb.append("   <aCta>");sb.append(emisioncp.getArpfoe().getACta());sb.append("</aCta>");
        sb.append("   <entrega>");sb.append(emisioncp.getArpfoe().getEntrega());sb.append("</entrega>");
        sb.append("   <horaEntrega>");sb.append(emisioncp.getArpfoe().getHoraEntrega());sb.append("</horaEntrega>");
        sb.append("   <indPideLote>");sb.append(emisioncp.getArpfoe().getIndPideLote());sb.append("</indPideLote>");
        sb.append("   <motConting>");sb.append(emisioncp.getArpfoe().getMotConting());sb.append("</motConting>");
        sb.append("   <operExoneradas>");sb.append(emisioncp.getArpfoe().getOperExoneradas());sb.append("</operExoneradas>");
        sb.append("   <operGratuitas>");sb.append(emisioncp.getArpfoe().getOperGratuitas());sb.append("</operGratuitas>");
        sb.append("   <operGravadas>");sb.append(emisioncp.getArpfoe().getOperGravadas());sb.append("</operGravadas>");
        sb.append("   <tipoOperacion>");sb.append(emisioncp.getArpfoe().getTipoOperacion());sb.append("</tipoOperacion>");
        sb.append("   <guiaTemp>");sb.append(emisioncp.getArpfoe().getGuiaTemp());sb.append("</guiaTemp>");
        sb.append("   <arpfolList>");
        for(Arpfol arpfol: emisioncp.getArpfoe().getArpfolList()) {
            sb.append("    <arpfol>");
            sb.append("       <noCia>");sb.append(arpfol.getNoCia());sb.append("</noCia>");
            sb.append("       <noOrden></noOrden>");
            sb.append("       <grupo>00</grupo>");
            sb.append("       <noCliente>");sb.append(arpfol.getNoCliente());sb.append("</noCliente>");
            sb.append("       <noArti>");sb.append(arpfol.getNoArti());sb.append("</noArti>");
            sb.append("       <tipoArti>");sb.append(arpfol.getTipoArti());sb.append("</tipoArti>");
            sb.append("       <artiNuevo>");sb.append(arpfol.getArtiNuevo());sb.append("</artiNuevo>");
            sb.append("       <bodega>");sb.append(arpfol.getBodega());sb.append("</bodega>");
            sb.append("       <cantComp>");sb.append(arpfol.getCantComp());sb.append("</cantComp>");
            sb.append("       <cantSolicitada>");sb.append(arpfol.getCantSolicitada());sb.append("</cantSolicitada>");
            sb.append("       <cantEntreg>");sb.append(arpfol.getCantEntreg());sb.append("</cantEntreg>");
            sb.append("       <cantAsignada>");sb.append(arpfol.getCantAsignada());sb.append("</cantAsignada>");
            sb.append("       <cantReasignada>");sb.append(arpfol.getCantReasignada());sb.append("</cantReasignada>");
            sb.append("       <fechaRegistro>");sb.append(arpfol.getFechaRegistro());sb.append("</fechaRegistro>");
            sb.append("       <precio>");sb.append(arpfol.getPrecio());sb.append("</precio>");
            sb.append("       <totLinea>");sb.append(arpfol.getTotLinea());sb.append("</totLinea>");
            sb.append("       <estado>");sb.append(arpfol.getEstado());sb.append("</estado>");
            sb.append("       <dsctoCliente>");sb.append(arpfol.getDsctoCliente());sb.append("</dsctoCliente>");
            sb.append("       <dPromo>");sb.append(arpfol.getDPromo());sb.append("</dPromo>");
            sb.append("       <igv>");sb.append(arpfol.getIgv());sb.append("</igv>");
            sb.append("       <noLinea>");sb.append(arpfol.getNoLinea());sb.append("</noLinea>");
            sb.append("       <pDscto3>");sb.append(arpfol.getPDscto3());sb.append("</pDscto3>");
            sb.append("       <mDscto2>");sb.append(arpfol.getMDscto2());sb.append("</mDscto2>");
            sb.append("       <mDscto3>");sb.append(arpfol.getMDscto3());sb.append("</mDscto3>");
            sb.append("       <impIgv>");sb.append(arpfol.getImpIgv());sb.append("</impIgv>");
            sb.append("       <precioSigv>");sb.append(arpfol.getPrecioSigv());sb.append("</precioSigv>");
            sb.append("       <totalLin>");sb.append(arpfol.getTotalLin());sb.append("</totalLin>");
            sb.append("       <descripcion>");sb.append(arpfol.getDescripcion());sb.append("</descripcion>");
            sb.append("       <parte>");sb.append(arpfol.getParte());sb.append("</parte>");
            sb.append("       <tipoBs>");sb.append(arpfol.getTipoBs());sb.append("</tipoBs>");
            sb.append("       <indPideLote>");sb.append(arpfol.getIndPideLote());sb.append("</indPideLote>");
            sb.append("       <operExoneradas>");sb.append(arpfol.getOperExoneradas());sb.append("</operExoneradas>");
            sb.append("       <operGratuitas>");sb.append(arpfol.getOperGratuitas());sb.append("</operGratuitas>");
            sb.append("       <operGravadas>");sb.append(arpfol.getOperGravadas());sb.append("</operGravadas>");
            sb.append("       <operInafectas>");sb.append(arpfol.getOperInafectas());sb.append("</operInafectas>");
            sb.append("       <tipoAfectacion>");sb.append(arpfol.getTipoAfectacion());sb.append("</tipoAfectacion>");
            sb.append("       <precIgv>");sb.append(arpfol.getPrecIgv());sb.append("</precIgv>");
            sb.append("       <medida>");sb.append(arpfol.getMedida());sb.append("</medida>");
            sb.append("    </arpfol>");
        }
        sb.append("   </arpfolList>");
        sb.append(" </arpfoe>");
        sb.append(" <arfafe>");
        sb.append("   <tipoDoc>");sb.append(emisioncp.getArfafe().getTipoDoc());sb.append("</tipoDoc>");
        sb.append("   <tipoCliente>");sb.append(emisioncp.getArfafe().getTipoCliente());sb.append("</tipoCliente>");
        sb.append("   <tipoCambio>");sb.append(emisioncp.getArfafe().getTipoCambio());sb.append("</tipoCambio>");
        sb.append("   <indDoc>");sb.append(emisioncp.getArfafe().getIndDoc());sb.append("</indDoc>");
        sb.append("   <mDsctoGlobal>");sb.append(emisioncp.getArfafe().getMDsctoGlobal());sb.append("</mDsctoGlobal>");
        sb.append(" </arfafe>");
        sb.append("</emisionComprobantePago>");

        return sb.toString();
    }

    @Override
    public EmisionComprobantePagoResponse emisionCpXmlOut(String xmlOut) {
        return null;
    }


}
