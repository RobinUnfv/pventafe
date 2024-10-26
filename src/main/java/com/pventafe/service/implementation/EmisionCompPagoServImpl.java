package com.pventafe.service.implementation;

import com.pventafe.model.*;
import com.pventafe.persistence.repository.interfaces.IComprobantePagoRepo;
import com.pventafe.service.interfaces.IEmisionCompPagoServi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.text.NumberFormat;
import java.util.Locale;


@Service
@Transactional
public class EmisionCompPagoServImpl implements IEmisionCompPagoServi {

    @Autowired
    private IComprobantePagoRepo iComprobantePagoRepo;
    private final String kOk = "OK";
    private final String kError = "ERROR";
    @Override
    public EmisionComprobantePagoResponse emisionCompPago(EmisionComprobantePago emisioncp) {
        return emisionCpXmlOut(iComprobantePagoRepo.emisionXml(emisionCpXmlInput(emisioncp)));
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
        sb.append("   <division>003</division>");
        sb.append("   <noVendedor>");sb.append(emisioncp.getArpfoe().getNoVendedor());sb.append("</noVendedor>");
        sb.append("   <codTped>");sb.append(emisioncp.getArpfoe().getCodTped());sb.append("</codTped>");
        sb.append("   <codFpago>");sb.append(emisioncp.getArpfoe().getCodFpago());sb.append("</codFpago>");
        sb.append("   <fRecepcion>");sb.append(emisioncp.getArpfoe().getFechaRegistro());sb.append("</fRecepcion>");
        sb.append("   <fechaRegistro>");sb.append(emisioncp.getArpfoe().getFechaRegistro());sb.append("</fechaRegistro>");
        sb.append("   <fAprobacion>");sb.append(emisioncp.getArpfoe().getFechaRegistro());sb.append("</fAprobacion>");
        sb.append("   <fechaEntrega>");sb.append(emisioncp.getArpfoe().getFechaEntrega());sb.append("</fechaEntrega>");
        sb.append("   <fechaEntregaReal>");sb.append(emisioncp.getArpfoe().getFechaEntregaReal());sb.append("</fechaEntregaReal>");
        sb.append("   <fechaVence>");sb.append(emisioncp.getArpfoe().getFechaVence());sb.append("</fechaVence>");
        sb.append("   <tipoPrecio>");sb.append(emisioncp.getArpfoe().getTipoPrecio());sb.append("</tipoPrecio>");
        sb.append("   <moneda>");sb.append(emisioncp.getArpfoe().getMoneda());sb.append("</moneda>");
        sb.append("   <subTotal>");sb.append(formatoNumero(emisioncp.getArpfoe().getSubTotal()));sb.append("</subTotal>");
        sb.append("   <tImpuesto>");sb.append(formatoNumero(emisioncp.getArpfoe().getTImpuesto()));sb.append("</tImpuesto>");
        sb.append("   <tPrecio>");sb.append(formatoNumero(emisioncp.getArpfoe().getTPrecio()));sb.append("</tPrecio>");
        sb.append("   <impuesto>");sb.append(formatoNumero(emisioncp.getArpfoe().getImpuesto()));sb.append("</impuesto>");
        sb.append("   <estado>");sb.append(emisioncp.getArpfoe().getEstado());sb.append("</estado>");
        sb.append("   <bodega>");sb.append(emisioncp.getArpfoe().getBodega());sb.append("</bodega>");
        sb.append("   <cuser>");sb.append(emisioncp.getArpfoe().getCuser());sb.append("</cuser>");
        sb.append("   <igv>");sb.append(formatoNumero(emisioncp.getArpfoe().getIgv()));sb.append("</igv>");
        sb.append("   <indGuiado>");sb.append(emisioncp.getArpfoe().getIndGuiado());sb.append("</indGuiado>");
        sb.append("   <direccionComercial>");sb.append(emisioncp.getArpfoe().getDireccionComercial());sb.append("</direccionComercial>");
        sb.append("   <motivoTraslado>");sb.append(emisioncp.getArpfoe().getMotivoTraslado());sb.append("</motivoTraslado>");
        sb.append("   <nombreCliente>");sb.append(emisioncp.getArpfoe().getNombreCliente());sb.append("</nombreCliente>");
        sb.append("   <ruc>");sb.append(emisioncp.getArpfoe().getRuc());sb.append("</ruc>");
        sb.append("   <tDescuento>");sb.append(formatoNumero(emisioncp.getArpfoe().getTDescuento()));sb.append("</tDescuento>");
        sb.append("   <tipoDocRef>");sb.append(emisioncp.getArpfoe().getTipoDocRef());sb.append("</tipoDocRef>");
        sb.append("   <codClasPed>");sb.append(emisioncp.getArpfoe().getCodClasPed());sb.append("</codClasPed>");
        sb.append("   <tipoFpago>");sb.append(emisioncp.getArpfoe().getTipoFpago());sb.append("</tipoFpago>");
        sb.append("   <tDsctoGlobal>");sb.append(formatoNumero(emisioncp.getArpfoe().getTDsctoGlobal()));sb.append("</tDsctoGlobal>");
        sb.append("   <tValorVenta>");sb.append(formatoNumero(emisioncp.getArpfoe().getTValorVenta()));sb.append("</tValorVenta>");
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
        sb.append("   <totalBruto>");sb.append(formatoNumero(emisioncp.getArpfoe().getTotalBruto()));sb.append("</totalBruto>");
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
        sb.append("   <redondeo>");sb.append(formatoNumero(emisioncp.getArpfoe().getRedondeo()));sb.append("</redondeo>");
        sb.append("   <indCodBarra>");sb.append(emisioncp.getArpfoe().getIndCodBarra());sb.append("</indCodBarra>");
        sb.append("   <indFactTexto>");sb.append(emisioncp.getArpfoe().getIndFactTexto());sb.append("</indFactTexto>");
        sb.append("   <indGuiaTexto>");sb.append(emisioncp.getArpfoe().getIndGuiaTexto());sb.append("</indGuiaTexto>");
        sb.append("   <facturaTexto>");sb.append(emisioncp.getArpfoe().getIndFactTexto());sb.append("</facturaTexto>");
        sb.append("   <impuestoFlete>");sb.append(formatoNumero(emisioncp.getArpfoe().getImpuestoFlete()));sb.append("</impuestoFlete>");
        sb.append("   <onLine>");sb.append(emisioncp.getArpfoe().getOnLine());sb.append("</onLine>");
        sb.append("   <contNeto>");sb.append(emisioncp.getArpfoe().getContNeto());sb.append("</contNeto>");
        sb.append("   <indProforma1>");sb.append(emisioncp.getArpfoe().getIndProforma1());sb.append("</indProforma1>");
        sb.append("   <aCta>");sb.append(formatoNumero(emisioncp.getArpfoe().getACta()));sb.append("</aCta>");
        sb.append("   <entrega>");sb.append(emisioncp.getArpfoe().getEntrega());sb.append("</entrega>");
        sb.append("   <horaEntrega>");sb.append(emisioncp.getArpfoe().getHoraEntrega());sb.append("</horaEntrega>");
        sb.append("   <indPideLote>");sb.append(emisioncp.getArpfoe().getIndPideLote());sb.append("</indPideLote>");
        sb.append("   <motConting>");sb.append(emisioncp.getArpfoe().getMotConting());sb.append("</motConting>");
        sb.append("   <operExoneradas>");sb.append(formatoNumero(emisioncp.getArpfoe().getOperExoneradas()));sb.append("</operExoneradas>");
        sb.append("   <operGratuitas>");sb.append(formatoNumero(emisioncp.getArpfoe().getOperGratuitas()));sb.append("</operGratuitas>");
        sb.append("   <operGravadas>");sb.append(formatoNumero(emisioncp.getArpfoe().getOperGravadas()));sb.append("</operGravadas>");
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
            sb.append("       <cantComp>");sb.append(formatoNumero(arpfol.getCantComp()));sb.append("</cantComp>");
            sb.append("       <cantSolicitada>");sb.append(formatoNumero(arpfol.getCantSolicitada()));sb.append("</cantSolicitada>");
            sb.append("       <cantEntreg>");sb.append(formatoNumero(arpfol.getCantEntreg()));sb.append("</cantEntreg>");
            sb.append("       <cantAsignada>");sb.append(formatoNumero(arpfol.getCantAsignada()));sb.append("</cantAsignada>");
            sb.append("       <cantReasignada>");sb.append(formatoNumero(arpfol.getCantReasignada()));sb.append("</cantReasignada>");
            sb.append("       <fechaRegistro>");sb.append(arpfol.getFechaRegistro());sb.append("</fechaRegistro>");
            sb.append("       <precio>");sb.append(formatoNumero(arpfol.getPrecio()));sb.append("</precio>");
            sb.append("       <totLinea>");sb.append(formatoNumero(arpfol.getTotLinea()));sb.append("</totLinea>");
            sb.append("       <estado>");sb.append(arpfol.getEstado());sb.append("</estado>");
            sb.append("       <dsctoCliente>");sb.append(formatoNumero(arpfol.getDsctoCliente()));sb.append("</dsctoCliente>");
            sb.append("       <dPromo>");sb.append(formatoNumero(arpfol.getDPromo()));sb.append("</dPromo>");
            sb.append("       <igv>");sb.append(formatoNumero(arpfol.getIgv()));sb.append("</igv>");
            sb.append("       <noLinea>");sb.append(arpfol.getNoLinea());sb.append("</noLinea>");
            sb.append("       <pDscto3>");sb.append(formatoNumero(arpfol.getPDscto3()));sb.append("</pDscto3>");
            sb.append("       <mDscto2>");sb.append(formatoNumero(arpfol.getMDscto2()));sb.append("</mDscto2>");
            sb.append("       <mDscto3>");sb.append(formatoNumero(arpfol.getMDscto3()));sb.append("</mDscto3>");
            sb.append("       <impIgv>");sb.append(formatoNumero(arpfol.getImpIgv()));sb.append("</impIgv>");
            sb.append("       <precioSigv>");sb.append(formatoNumero(arpfol.getPrecioSigv()));sb.append("</precioSigv>");
            sb.append("       <totalLin>");sb.append(formatoNumero(arpfol.getTotalLin()));sb.append("</totalLin>");
            sb.append("       <descripcion>");sb.append(arpfol.getDescripcion());sb.append("</descripcion>");
            sb.append("       <parte>");sb.append(arpfol.getParte());sb.append("</parte>");
            sb.append("       <tipoBs>");sb.append(arpfol.getTipoBs());sb.append("</tipoBs>");
            sb.append("       <indPideLote>");sb.append(arpfol.getIndPideLote());sb.append("</indPideLote>");
            sb.append("       <operExoneradas>");sb.append(formatoNumero(arpfol.getOperExoneradas()));sb.append("</operExoneradas>");
            sb.append("       <operGratuitas>");sb.append(formatoNumero(arpfol.getOperGratuitas()));sb.append("</operGratuitas>");
            sb.append("       <operGravadas>");sb.append(formatoNumero(arpfol.getOperGravadas()));sb.append("</operGravadas>");
            sb.append("       <operInafectas>");sb.append(formatoNumero(arpfol.getOperInafectas()));sb.append("</operInafectas>");
            sb.append("       <tipoAfectacion>");sb.append(arpfol.getTipoAfectacion());sb.append("</tipoAfectacion>");
            sb.append("       <precIgv>");sb.append(formatoNumero(arpfol.getPrecIgv()));sb.append("</precIgv>");
            sb.append("       <medida>");sb.append(arpfol.getMedida());sb.append("</medida>");
            sb.append("    </arpfol>");
        }
        sb.append("   </arpfolList>");
        sb.append(" </arpfoe>");
        sb.append(" <arfafe>");
        sb.append("   <tipoDoc>");sb.append(emisioncp.getArfafe().getTipoDoc());sb.append("</tipoDoc>");
        sb.append("   <tipoCliente>");sb.append(emisioncp.getArfafe().getTipoCliente());sb.append("</tipoCliente>");
        sb.append("   <tipoCambio>");sb.append(formatoNumero(emisioncp.getArfafe().getTipoCambio()));sb.append("</tipoCambio>");
        sb.append("   <indDoc>");sb.append(emisioncp.getArfafe().getIndDoc());sb.append("</indDoc>");
        sb.append("   <mDsctoGlobal>");sb.append(formatoNumero(emisioncp.getArfafe().getMDsctoGlobal()));sb.append("</mDsctoGlobal>");
        sb.append(" </arfafe>");
        sb.append("</emisionComprobantePago>");

        return sb.toString();
    }

    @Override
    public EmisionComprobantePagoResponse emisionCpXmlOut(String xmlOut) {
        EmisionComprobantePagoResponse response = new EmisionComprobantePagoResponse();
        ResEmisionCp resEmisionCp = new ResEmisionCp();
        List<MensajeValidacion> mensajeValidacionList = new ArrayList<>();
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new ByteArrayInputStream(xmlOut.getBytes()));

            document.getDocumentElement().normalize();

            NodeList nList = document.getElementsByTagName("emisionComprobantePagoResponse");
            Node nNode = nList.item(0);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                response.setFecha(eElement.getElementsByTagName("fecha").item(0).getTextContent());
                response.setResultado(eElement.getElementsByTagName("resultado").item(0).getTextContent());
                if (kOk.equalsIgnoreCase(response.getResultado())) {
                    response.setNoCia(eElement.getElementsByTagName("noCia").item(0).getTextContent());
                    response.setNoCliente(eElement.getElementsByTagName("noCliente").item(0).getTextContent());
                    response.setNoOrden(eElement.getElementsByTagName("noOrden").item(0).getTextContent());
                    response.setNoGuia(eElement.getElementsByTagName("noGuia").item(0).getTextContent());
                    response.setNoFactu(eElement.getElementsByTagName("noFactu").item(0).getTextContent());
                }
                if (kError.equalsIgnoreCase(response.getResultado())) {
                    NodeList mensajeList = eElement.getElementsByTagName("mensajeValidacion");
                    for (int i = 0; i < mensajeList.getLength(); i++) {
                         Node mensajeNode = mensajeList.item(i);
                         if (mensajeNode.getNodeType() == Node.ELEMENT_NODE) {
                             Element mensajeElement = (Element) mensajeNode;
                             MensajeValidacion mensajeValidacion = new MensajeValidacion();
                             mensajeValidacion.setNomProceso(mensajeElement.getElementsByTagName("nomProceso").item(0).getTextContent());
                             mensajeValidacion.setCodError(Integer.parseInt(mensajeElement.getElementsByTagName("codError").item(0).getTextContent()));
                             mensajeValidacion.setMsjError(mensajeElement.getElementsByTagName("msjError").item(0).getTextContent());
                             mensajeValidacion.setFecProceso(mensajeElement.getElementsByTagName("fecProceso").item(0).getTextContent());
                             mensajeValidacionList.add(mensajeValidacion);
                         }
                    }
                    resEmisionCp.setMensajeValidacionList(mensajeValidacionList);
                    response.setResEmisionCp(resEmisionCp);
                }
            }

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return response;
    }

    private String formatoNumero(double numero) {
        // Configurar el formato para el locale español (España)
        NumberFormat numberFormat = NumberFormat.getNumberInstance(new Locale("es", "ES"));
        return numberFormat.format(numero);
    }
}
