
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
 *         &lt;element name="GetEncountersByCompetNameResult" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}ArrayOfEncounterInfo" minOccurs="0"/>
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
    "getEncountersByCompetNameResult"
})
@XmlRootElement(name = "GetEncountersByCompetNameResponse")
public class GetEncountersByCompetNameResponse {

    @XmlElementRef(name = "GetEncountersByCompetNameResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEncounterInfo> getEncountersByCompetNameResult;

    /**
     * Gets the value of the getEncountersByCompetNameResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEncounterInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEncounterInfo> getGetEncountersByCompetNameResult() {
        return getEncountersByCompetNameResult;
    }

    /**
     * Sets the value of the getEncountersByCompetNameResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEncounterInfo }{@code >}
     *     
     */
    public void setGetEncountersByCompetNameResult(JAXBElement<ArrayOfEncounterInfo> value) {
        this.getEncountersByCompetNameResult = value;
    }

}
