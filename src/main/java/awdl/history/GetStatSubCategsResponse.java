
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
 *         &lt;element name="GetStatSubCategsResult" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}ArrayOfStatSubCategInfo" minOccurs="0"/>
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
    "getStatSubCategsResult"
})
@XmlRootElement(name = "GetStatSubCategsResponse")
public class GetStatSubCategsResponse {

    @XmlElementRef(name = "GetStatSubCategsResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStatSubCategInfo> getStatSubCategsResult;

    /**
     * Gets the value of the getStatSubCategsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatSubCategInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStatSubCategInfo> getGetStatSubCategsResult() {
        return getStatSubCategsResult;
    }

    /**
     * Sets the value of the getStatSubCategsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatSubCategInfo }{@code >}
     *     
     */
    public void setGetStatSubCategsResult(JAXBElement<ArrayOfStatSubCategInfo> value) {
        this.getStatSubCategsResult = value;
    }

}
