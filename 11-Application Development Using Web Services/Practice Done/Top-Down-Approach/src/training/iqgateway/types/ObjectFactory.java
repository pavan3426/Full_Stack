
package training.iqgateway.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the training.iqgateway.types package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _YensToRs_QNAME = new QName("http://iqgateway.training/", "yensToRs");
    private final static QName _YensToRsResponse_QNAME = new QName("http://iqgateway.training/", "yensToRsResponse");
    private final static QName _PoundsToRs_QNAME = new QName("http://iqgateway.training/", "poundsToRs");
    private final static QName _DollarToRS_QNAME = new QName("http://iqgateway.training/", "dollarToRS");
    private final static QName _DollarToRSResponse_QNAME = new QName("http://iqgateway.training/", "dollarToRSResponse");
    private final static QName _PoundsToRsResponse_QNAME = new QName("http://iqgateway.training/", "poundsToRsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: training.iqgateway.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link YensToRs }
     * 
     */
    public YensToRs createYensToRs() {
        return new YensToRs();
    }

    /**
     * Create an instance of {@link YensToRsResponse }
     * 
     */
    public YensToRsResponse createYensToRsResponse() {
        return new YensToRsResponse();
    }

    /**
     * Create an instance of {@link DollarToRSResponse }
     * 
     */
    public DollarToRSResponse createDollarToRSResponse() {
        return new DollarToRSResponse();
    }

    /**
     * Create an instance of {@link DollarToRS }
     * 
     */
    public DollarToRS createDollarToRS() {
        return new DollarToRS();
    }

    /**
     * Create an instance of {@link PoundsToRs }
     * 
     */
    public PoundsToRs createPoundsToRs() {
        return new PoundsToRs();
    }

    /**
     * Create an instance of {@link PoundsToRsResponse }
     * 
     */
    public PoundsToRsResponse createPoundsToRsResponse() {
        return new PoundsToRsResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YensToRs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgateway.training/", name = "yensToRs")
    public JAXBElement<YensToRs> createYensToRs(YensToRs value) {
        return new JAXBElement<YensToRs>(_YensToRs_QNAME, YensToRs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YensToRsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgateway.training/", name = "yensToRsResponse")
    public JAXBElement<YensToRsResponse> createYensToRsResponse(YensToRsResponse value) {
        return new JAXBElement<YensToRsResponse>(_YensToRsResponse_QNAME, YensToRsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PoundsToRs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgateway.training/", name = "poundsToRs")
    public JAXBElement<PoundsToRs> createPoundsToRs(PoundsToRs value) {
        return new JAXBElement<PoundsToRs>(_PoundsToRs_QNAME, PoundsToRs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DollarToRS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgateway.training/", name = "dollarToRS")
    public JAXBElement<DollarToRS> createDollarToRS(DollarToRS value) {
        return new JAXBElement<DollarToRS>(_DollarToRS_QNAME, DollarToRS.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DollarToRSResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgateway.training/", name = "dollarToRSResponse")
    public JAXBElement<DollarToRSResponse> createDollarToRSResponse(DollarToRSResponse value) {
        return new JAXBElement<DollarToRSResponse>(_DollarToRSResponse_QNAME, DollarToRSResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PoundsToRsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://iqgateway.training/", name = "poundsToRsResponse")
    public JAXBElement<PoundsToRsResponse> createPoundsToRsResponse(PoundsToRsResponse value) {
        return new JAXBElement<PoundsToRsResponse>(_PoundsToRsResponse_QNAME, PoundsToRsResponse.class, null, value);
    }

}
