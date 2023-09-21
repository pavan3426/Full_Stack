package training.iqgateway;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
// !DO NOT EDIT THIS FILE!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 130224.1947.04102)

@WebService(wsdlLocation="http://localhost:7101/WebServicesApp_Lesson08-BottomUpApproach-context-root/CurrencyConvertorPort/#%7Bhttp%3A%2F%2Fiqgateway.training%2F%7DCurrencyConvertorService?wsdl",
  targetNamespace="http://iqgateway.training/", name="CurrencyConvertor")
@XmlSeeAlso(
  { training.iqgateway.types.ObjectFactory.class })
public interface CurrencyConvertor
{
  @WebMethod
  @Action(input="", output="")
  @ResponseWrapper(localName="dollarToRSResponse", targetNamespace="http://iqgateway.training/",
    className="training.iqgateway.types.DollarToRSResponse")
  @RequestWrapper(localName="dollarToRS", targetNamespace="http://iqgateway.training/",
    className="training.iqgateway.types.DollarToRS")
  @WebResult(targetNamespace="")
  public double dollarToRS(@WebParam(targetNamespace="", name="arg0")
    double arg0);

  @WebMethod
  @Action(input="", output="")
  @ResponseWrapper(localName="poundsToRsResponse", targetNamespace="http://iqgateway.training/",
    className="training.iqgateway.types.PoundsToRsResponse")
  @RequestWrapper(localName="poundsToRs", targetNamespace="http://iqgateway.training/",
    className="training.iqgateway.types.PoundsToRs")
  @WebResult(targetNamespace="")
  public double poundsToRs(@WebParam(targetNamespace="", name="arg0")
    double arg0);

  @WebMethod
  @Action(input="", output="")
  @ResponseWrapper(localName="yensToRsResponse", targetNamespace="http://iqgateway.training/",
    className="training.iqgateway.types.YensToRsResponse")
  @RequestWrapper(localName="yensToRs", targetNamespace="http://iqgateway.training/",
    className="training.iqgateway.types.YensToRs")
  @WebResult(targetNamespace="")
  public double yensToRs(@WebParam(targetNamespace="", name="arg0")
    double arg0);
}
