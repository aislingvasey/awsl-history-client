
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
 *         &lt;element name="GetEncountersResult" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}ArrayOfEncounterInfo" minOccurs="0"/>
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
    "getEncountersResult"
})
@XmlRootElement(name = "GetEncountersResponse")
public class GetEncountersResponse {

    @XmlElementRef(name = "GetEncountersResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEncounterInfo> getEncountersResult;

    /**
     * Gets the value of the getEncountersResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEncounterInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfEncounterInfo> getGetEncountersResult() {
        return getEncountersResult;
    }

    /**
     * Sets the value of the getEncountersResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfEncounterInfo }{@code >}
     *     
     */
    public void setGetEncountersResult(JAXBElement<ArrayOfEncounterInfo> value) {
        this.getEncountersResult = value;
    }

}
