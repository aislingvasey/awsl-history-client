
package awdl.history;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatCategInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatCategInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}BaseStructInfoOfStatCategInfo3pw8U1P1">
 *       &lt;sequence>
 *         &lt;element name="CategName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdCateg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdLanguage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatCategInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "categName",
    "idCateg",
    "idLanguage"
})
public class StatCategInfo
    extends BaseStructInfoOfStatCategInfo3Pw8U1P1
{

    @XmlElementRef(name = "CategName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> categName;
    @XmlElement(name = "IdCateg")
    protected Integer idCateg;
    @XmlElement(name = "IdLanguage")
    protected Integer idLanguage;

    /**
     * Gets the value of the categName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategName() {
        return categName;
    }

    /**
     * Sets the value of the categName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategName(JAXBElement<String> value) {
        this.categName = value;
    }

    /**
     * Gets the value of the idCateg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCateg() {
        return idCateg;
    }

    /**
     * Sets the value of the idCateg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCateg(Integer value) {
        this.idCateg = value;
    }

    /**
     * Gets the value of the idLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdLanguage() {
        return idLanguage;
    }

    /**
     * Sets the value of the idLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdLanguage(Integer value) {
        this.idLanguage = value;
    }

}
