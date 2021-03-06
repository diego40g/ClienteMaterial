
package org.dipaz.material.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "MaterialServiceImplService", targetNamespace = "http://service.material.dipaz.org/", wsdlLocation = "http://materiadp.herokuapp.com/MaterialService?wsdl")
public class MaterialServiceImplService
    extends Service
{

    private final static URL MATERIALSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException MATERIALSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName MATERIALSERVICEIMPLSERVICE_QNAME = new QName("http://service.material.dipaz.org/", "MaterialServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://materiadp.herokuapp.com/MaterialService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MATERIALSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        MATERIALSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public MaterialServiceImplService() {
        super(__getWsdlLocation(), MATERIALSERVICEIMPLSERVICE_QNAME);
    }

    public MaterialServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), MATERIALSERVICEIMPLSERVICE_QNAME, features);
    }

    public MaterialServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, MATERIALSERVICEIMPLSERVICE_QNAME);
    }

    public MaterialServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MATERIALSERVICEIMPLSERVICE_QNAME, features);
    }

    public MaterialServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public MaterialServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MaterialService
     */
    @WebEndpoint(name = "MaterialServiceImplPort")
    public MaterialService getMaterialServiceImplPort() {
        return super.getPort(new QName("http://service.material.dipaz.org/", "MaterialServiceImplPort"), MaterialService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MaterialService
     */
    @WebEndpoint(name = "MaterialServiceImplPort")
    public MaterialService getMaterialServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.material.dipaz.org/", "MaterialServiceImplPort"), MaterialService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MATERIALSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw MATERIALSERVICEIMPLSERVICE_EXCEPTION;
        }
        return MATERIALSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
