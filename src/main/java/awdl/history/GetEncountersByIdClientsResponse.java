
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
 *         &lt;element name="GetEncountersByIdClientsResult" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}EncounterInfo" minOccurs="0"/>
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
    "getEncountersByIdClientsResult"
})
@XmlRootElement(name = "GetEncountersByIdClientsResponse")
public class GetEncountersByIdClientsResponse {

    @XmlElementRef(name = "GetEncountersByIdClientsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<EncounterInfo> getEncountersByIdClientsResult;

    /**
     * Gets the value of the getEncountersByIdClientsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EncounterInfo }{@code >}
     *     
     */
    public JAXBElement<EncounterInfo> getGetEncountersByIdClientsResult() {
        return getEncountersByIdClientsResult;
    }

    /**
     * Sets the value of the getEncountersByIdClientsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EncounterInfo }{@code >}
     *     
     */
    public void setGetEncountersByIdClientsResult(JAXBElement<EncounterInfo> value) {
        this.getEncountersByIdClientsResult = value;
    }

}
