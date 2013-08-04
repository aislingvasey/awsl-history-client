
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
 *         &lt;element name="IdTeams" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="IdStats" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="IdEncounters" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
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
    "idTeams",
    "idStats",
    "idEncounters"
})
@XmlRootElement(name = "GetStatValueTeam")
public class GetStatValueTeam {

    @XmlElementRef(name = "IdTeams", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> idTeams;
    @XmlElementRef(name = "IdStats", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> idStats;
    @XmlElementRef(name = "IdEncounters", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> idEncounters;

    /**
     * Gets the value of the idTeams property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getIdTeams() {
        return idTeams;
    }

    /**
     * Sets the value of the idTeams property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setIdTeams(JAXBElement<ArrayOfint> value) {
        this.idTeams = value;
    }

    /**
     * Gets the value of the idStats property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getIdStats() {
        return idStats;
    }

    /**
     * Sets the value of the idStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setIdStats(JAXBElement<ArrayOfint> value) {
        this.idStats = value;
    }

    /**
     * Gets the value of the idEncounters property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getIdEncounters() {
        return idEncounters;
    }

    /**
     * Sets the value of the idEncounters property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setIdEncounters(JAXBElement<ArrayOfint> value) {
        this.idEncounters = value;
    }

}
