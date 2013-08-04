
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
 *         &lt;element name="GetTextsResult" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}ArrayOfTextInfo" minOccurs="0"/>
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
    "getTextsResult"
})
@XmlRootElement(name = "GetTextsResponse")
public class GetTextsResponse {

    @XmlElementRef(name = "GetTextsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfTextInfo> getTextsResult;

    /**
     * Gets the value of the getTextsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTextInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfTextInfo> getGetTextsResult() {
        return getTextsResult;
    }

    /**
     * Sets the value of the getTextsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfTextInfo }{@code >}
     *     
     */
    public void setGetTextsResult(JAXBElement<ArrayOfTextInfo> value) {
        this.getTextsResult = value;
    }

}
