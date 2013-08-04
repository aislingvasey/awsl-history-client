
package awdl.history;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfessionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfessionInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}BaseStructInfoOfProfessionInfo3pw8U1P1">
 *       &lt;sequence>
 *         &lt;element name="IdProfession" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Profession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfessionInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "idProfession",
    "profession"
})
public class ProfessionInfo
    extends BaseStructInfoOfProfessionInfo3Pw8U1P1
{

    @XmlElement(name = "IdProfession")
    protected Integer idProfession;
    @XmlElementRef(name = "Profession", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profession;

    /**
     * Gets the value of the idProfession property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdProfession() {
        return idProfession;
    }

    /**
     * Sets the value of the idProfession property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdProfession(Integer value) {
        this.idProfession = value;
    }

    /**
     * Gets the value of the profession property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfession() {
        return profession;
    }

    /**
     * Sets the value of the profession property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfession(JAXBElement<String> value) {
        this.profession = value;
    }

}
