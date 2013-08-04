
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
 *         &lt;element name="GetSeasonTeamsLogosResult" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}ArrayOfPhotoInfo" minOccurs="0"/>
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
    "getSeasonTeamsLogosResult"
})
@XmlRootElement(name = "GetSeasonTeamsLogosResponse")
public class GetSeasonTeamsLogosResponse {

    @XmlElementRef(name = "GetSeasonTeamsLogosResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPhotoInfo> getSeasonTeamsLogosResult;

    /**
     * Gets the value of the getSeasonTeamsLogosResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPhotoInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPhotoInfo> getGetSeasonTeamsLogosResult() {
        return getSeasonTeamsLogosResult;
    }

    /**
     * Sets the value of the getSeasonTeamsLogosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPhotoInfo }{@code >}
     *     
     */
    public void setGetSeasonTeamsLogosResult(JAXBElement<ArrayOfPhotoInfo> value) {
        this.getSeasonTeamsLogosResult = value;
    }

}
