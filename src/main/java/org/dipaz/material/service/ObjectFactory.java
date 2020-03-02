
package org.dipaz.material.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.dipaz.material.service package. 
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

    private final static QName _CrearMaterial_QNAME = new QName("http://service.material.dipaz.org/", "crearMaterial");
    private final static QName _CrearMaterialResponse_QNAME = new QName("http://service.material.dipaz.org/", "crearMaterialResponse");
    private final static QName _ObtnerTodasResponse_QNAME = new QName("http://service.material.dipaz.org/", "obtnerTodasResponse");
    private final static QName _ObtnerTodas_QNAME = new QName("http://service.material.dipaz.org/", "obtnerTodas");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.dipaz.material.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearMaterial }
     * 
     */
    public CrearMaterial createCrearMaterial() {
        return new CrearMaterial();
    }

    /**
     * Create an instance of {@link CrearMaterialResponse }
     * 
     */
    public CrearMaterialResponse createCrearMaterialResponse() {
        return new CrearMaterialResponse();
    }

    /**
     * Create an instance of {@link ObtnerTodasResponse }
     * 
     */
    public ObtnerTodasResponse createObtnerTodasResponse() {
        return new ObtnerTodasResponse();
    }

    /**
     * Create an instance of {@link ObtnerTodas }
     * 
     */
    public ObtnerTodas createObtnerTodas() {
        return new ObtnerTodas();
    }

    /**
     * Create an instance of {@link Material }
     * 
     */
    public Material createMaterial() {
        return new Material();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearMaterial }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.material.dipaz.org/", name = "crearMaterial")
    public JAXBElement<CrearMaterial> createCrearMaterial(CrearMaterial value) {
        return new JAXBElement<CrearMaterial>(_CrearMaterial_QNAME, CrearMaterial.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearMaterialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.material.dipaz.org/", name = "crearMaterialResponse")
    public JAXBElement<CrearMaterialResponse> createCrearMaterialResponse(CrearMaterialResponse value) {
        return new JAXBElement<CrearMaterialResponse>(_CrearMaterialResponse_QNAME, CrearMaterialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtnerTodasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.material.dipaz.org/", name = "obtnerTodasResponse")
    public JAXBElement<ObtnerTodasResponse> createObtnerTodasResponse(ObtnerTodasResponse value) {
        return new JAXBElement<ObtnerTodasResponse>(_ObtnerTodasResponse_QNAME, ObtnerTodasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtnerTodas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.material.dipaz.org/", name = "obtnerTodas")
    public JAXBElement<ObtnerTodas> createObtnerTodas(ObtnerTodas value) {
        return new JAXBElement<ObtnerTodas>(_ObtnerTodas_QNAME, ObtnerTodas.class, null, value);
    }

}
