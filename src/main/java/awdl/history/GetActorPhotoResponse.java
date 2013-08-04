
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
 *         &lt;element name="GetActorPhotoResult" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}ArrayOfPhotoInfo" minOccurs="0"/>
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
    "getActorPhotoResult"
})
@XmlRootElement(name = "GetActorPhotoResponse")
public class GetActorPhotoResponse {

    @XmlElementRef(name = "GetActorPhotoResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfPhotoInfo> getActorPhotoResult;

    /**
     * Gets the value of the getActorPhotoResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPhotoInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfPhotoInfo> getGetActorPhotoResult() {
        return getActorPhotoResult;
    }

    /**
     * Sets the value of the getActorPhotoResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfPhotoInfo }{@code >}
     *     
     */
    public void setGetActorPhotoResult(JAXBElement<ArrayOfPhotoInfo> value) {
        this.getActorPhotoResult = value;
    }

}
