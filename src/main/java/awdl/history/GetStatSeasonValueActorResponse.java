
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
 *         &lt;element name="GetStatSeasonValueActorResult" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}ArrayOfStatSeasonValueInfo" minOccurs="0"/>
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
    "getStatSeasonValueActorResult"
})
@XmlRootElement(name = "GetStatSeasonValueActorResponse")
public class GetStatSeasonValueActorResponse {

    @XmlElementRef(name = "GetStatSeasonValueActorResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfStatSeasonValueInfo> getStatSeasonValueActorResult;

    /**
     * Gets the value of the getStatSeasonValueActorResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatSeasonValueInfo }{@code >}
     *     
     */
    public JAXBElement<ArrayOfStatSeasonValueInfo> getGetStatSeasonValueActorResult() {
        return getStatSeasonValueActorResult;
    }

    /**
     * Sets the value of the getStatSeasonValueActorResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfStatSeasonValueInfo }{@code >}
     *     
     */
    public void setGetStatSeasonValueActorResult(JAXBElement<ArrayOfStatSeasonValueInfo> value) {
        this.getStatSeasonValueActorResult = value;
    }

}
