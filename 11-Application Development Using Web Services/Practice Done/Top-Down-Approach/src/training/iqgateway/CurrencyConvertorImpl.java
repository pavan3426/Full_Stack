package training.iqgateway;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import training.iqgateway.types.ObjectFactory;

@WebService(name = "CurrencyConvertor", targetNamespace = "http://iqgateway.training/", serviceName = "CurrencyConvertorService", portName = "CurrencyConvertorPort", wsdlLocation = "/WEB-INF/wsdl/CurrencyConvertorService.wsdl")
@XmlSeeAlso( { ObjectFactory.class })
public class CurrencyConvertorImpl {
    public CurrencyConvertorImpl() {
    }

    @ResponseWrapper(localName = "dollarToRSResponse", targetNamespace = "http://iqgateway.training/", className = "training.iqgateway.types.DollarToRSResponse")
    @RequestWrapper(localName = "dollarToRS", targetNamespace = "http://iqgateway.training/", className = "training.iqgateway.types.DollarToRS")
    @WebMethod
    public double dollarToRS(@WebParam(name = "arg0")
        double arg0) {
        return 69.12 * arg0;
    }

    @ResponseWrapper(localName = "poundsToRsResponse", targetNamespace = "http://iqgateway.training/", className = "training.iqgateway.types.PoundsToRsResponse")
    @RequestWrapper(localName = "poundsToRs", targetNamespace = "http://iqgateway.training/", className = "training.iqgateway.types.PoundsToRs")
    @WebMethod
    public double poundsToRs(@WebParam(name = "arg0")
        double arg0) {
        return 71.34 * arg0;
    }

    @ResponseWrapper(localName = "yensToRsResponse", targetNamespace = "http://iqgateway.training/", className = "training.iqgateway.types.YensToRsResponse")
    @RequestWrapper(localName = "yensToRs", targetNamespace = "http://iqgateway.training/", className = "training.iqgateway.types.YensToRs")
    @WebMethod
    public double yensToRs(@WebParam(name = "arg0")
        double arg0) {
        return 0.5 * arg0;
    }
}
