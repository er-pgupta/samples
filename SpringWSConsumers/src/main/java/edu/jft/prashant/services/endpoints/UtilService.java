
package edu.jft.prashant.services.endpoints;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "UtilService", targetNamespace = "http://endpoints.services.prashant.jft.edu/", wsdlLocation = "http://localhost:7777/services/UtilService?wsdl")
public class UtilService
    extends Service
{

    private final static URL UTILSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(UtilService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = UtilService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:7777/services/UtilService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:7777/services/UtilService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        UTILSERVICE_WSDL_LOCATION = url;
    }

    public UtilService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UtilService() {
        super(UTILSERVICE_WSDL_LOCATION, new QName("http://endpoints.services.prashant.jft.edu/", "UtilService"));
    }

    /**
     * 
     * @return
     *     returns UtilServiceEndpoint
     */
    @WebEndpoint(name = "UtilServiceEndpointPort")
    public UtilServiceEndpoint getUtilServiceEndpointPort() {
        return super.getPort(new QName("http://endpoints.services.prashant.jft.edu/", "UtilServiceEndpointPort"), UtilServiceEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UtilServiceEndpoint
     */
    @WebEndpoint(name = "UtilServiceEndpointPort")
    public UtilServiceEndpoint getUtilServiceEndpointPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://endpoints.services.prashant.jft.edu/", "UtilServiceEndpointPort"), UtilServiceEndpoint.class, features);
    }

}
