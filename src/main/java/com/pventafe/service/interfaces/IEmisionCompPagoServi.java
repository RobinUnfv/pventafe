package com.pventafe.service.interfaces;

import com.pventafe.model.EmisionComprobantePago;
import com.pventafe.model.EmisionComprobantePagoResponse;

public interface IEmisionCompPagoServi {

    public EmisionComprobantePagoResponse emisionCompPago(EmisionComprobantePago emisioncp);
    public String emisionCpXmlInput(EmisionComprobantePago emisioncp);
    public EmisionComprobantePagoResponse emisionCpXmlOut(String xmlOut);
}
