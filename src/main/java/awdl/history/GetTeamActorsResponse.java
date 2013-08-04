
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
 *         &lt;element name="GetTeamActorsResult" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}ArrayOfPlayerInfo" minOccurs="0"/>
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
    "getTeamActorsResult"
})
@XmlRootElement(name = "GetTeamActorsResponse")
public class GetTeamActorsResponse {

    @XmlElementRef(name = "GetTeamActorsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPlayerInfo> getTeamActorsResult;

    /**
     * Gets the value of the getTeamActorsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPlayerInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPlayerInfo> getGetTeamActorsResult() {
        return getTeamActorsResult;
    }

    /**
     * Sets the value of the getTeamActorsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPlayerInfo }{@code >}
     *     
     */
    public void setGetTeamActorsResult(JAXBElement<ArrayOfPlayerInfo> value) {
        this.getTeamActorsResult = value;
    }

}
