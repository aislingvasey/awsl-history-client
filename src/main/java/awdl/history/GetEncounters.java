
package awdl.history;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdRencontres" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="IdSaison" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Day" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idRencontres",
    "idSaison",
    "day"
})
@XmlRootElement(name = "GetEncounters")
public class GetEncounters {

    @XmlElementRef(name = "IdRencontres", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> idRencontres;
    @XmlElementRef(name = "IdSaison", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idSaison;
    @XmlElementRef(name = "Day", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> day;

    /**
     * Gets the value of the idRencontres property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getIdRencontres() {
        return idRencontres;
    }

    /**
     * Sets the value of the idRencontres property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setIdRencontres(JAXBElement<ArrayOfint> value) {
        this.idRencontres = value;
    }

    /**
     * Gets the value of the idSaison property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdSaison() {
        return idSaison;
    }

    /**
     * Sets the value of the idSaison property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdSaison(JAXBElement<Integer> value) {
        this.idSaison = value;
    }

    /**
     * Gets the value of the day property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getDay() {
        return day;
    }

    /**
     * Sets the value of the day property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setDay(JAXBElement<Integer> value) {
        this.day = value;
    }

}
