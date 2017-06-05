
package webservice.gen.rechnerws;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;

@WebServiceClient(name = "MyWebServiceService", targetNamespace = "http://webservice/", wsdlLocation = "http://77.80.26.114:8080/services?wsdl")
public class MyWebServiceService
    extends Service
{

    private final static URL MYWEBSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException MYWEBSERVICESERVICE_EXCEPTION;
    private final static QName MYWEBSERVICESERVICE_QNAME = new QName("http://webservice/", "MyWebServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/services?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MYWEBSERVICESERVICE_WSDL_LOCATION = url;
        MYWEBSERVICESERVICE_EXCEPTION = e;
    }

    public MyWebServiceService() {
        super(__getWsdlLocation(), MYWEBSERVICESERVICE_QNAME);
    }

    public MyWebServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MYWEBSERVICESERVICE_QNAME, features);
    }

    public MyWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, MYWEBSERVICESERVICE_QNAME);
    }

    public MyWebServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MYWEBSERVICESERVICE_QNAME, features);
    }

    public MyWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MyWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RechnerWebServices
     */
    @WebEndpoint(name = "RechnerWebServicesPort")
    public RechnerWebServices getRechnerWebServicesPort() {
        return super.getPort(new QName("http://webservice/", "RechnerWebServicesPort"), RechnerWebServices.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RechnerWebServices
     */
    @WebEndpoint(name = "RechnerWebServicesPort")
    public RechnerWebServices getRechnerWebServicesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice/", "RechnerWebServicesPort"), RechnerWebServices.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MYWEBSERVICESERVICE_EXCEPTION!= null) {
            throw MYWEBSERVICESERVICE_EXCEPTION;
        }
        return MYWEBSERVICESERVICE_WSDL_LOCATION;
    }

}
