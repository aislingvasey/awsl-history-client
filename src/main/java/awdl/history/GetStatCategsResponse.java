
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
 *         &lt;element name="GetStatCategsResult" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}ArrayOfStatCategInfo" minOccurs="0"/>
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
    "getStatCategsResult"
})
@XmlRootElement(name = "GetStatCategsResponse")
public class GetStatCategsResponse {

    @XmlElementRef(name = "GetStatCategsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStatCategInfo> getStatCategsResult;

    /**
     * Gets the value of the getStatCategsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatCategInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStatCategInfo> getGetStatCategsResult() {
        return getStatCategsResult;
    }

    /**
     * Sets the value of the getStatCategsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatCategInfo }{@code >}
     *     
     */
    public void setGetStatCategsResult(JAXBElement<ArrayOfStatCategInfo> value) {
        this.getStatCategsResult = value;
    }

}
