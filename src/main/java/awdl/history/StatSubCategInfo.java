
package awdl.history;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatSubCategInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatSubCategInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}BaseStructInfoOfStatSubCategInfo3pw8U1P1">
 *       &lt;sequence>
 *         &lt;element name="IdLanguage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdStatCateg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdStatSubCateg" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StatSubCategName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatSubCategInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "idLanguage",
    "idStatCateg",
    "idStatSubCateg",
    "statSubCategName"
})
public class StatSubCategInfo
    extends BaseStructInfoOfStatSubCategInfo3Pw8U1P1
{

    @XmlElement(name = "IdLanguage")
    protected Integer idLanguage;
    @XmlElement(name = "IdStatCateg")
    protected Integer idStatCateg;
    @XmlElement(name = "IdStatSubCateg")
    protected Integer idStatSubCateg;
    @XmlElementRef(name = "StatSubCategName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statSubCategName;

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

    /**
     * Gets the value of the idStatCateg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdStatCateg() {
        return idStatCateg;
    }

    /**
     * Sets the value of the idStatCateg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdStatCateg(Integer value) {
        this.idStatCateg = value;
    }

    /**
     * Gets the value of the idStatSubCateg property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdStatSubCateg() {
        return idStatSubCateg;
    }

    /**
     * Sets the value of the idStatSubCateg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdStatSubCateg(Integer value) {
        this.idStatSubCateg = value;
    }

    /**
     * Gets the value of the statSubCategName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatSubCategName() {
        return statSubCategName;
    }

    /**
     * Sets the value of the statSubCategName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatSubCategName(JAXBElement<String> value) {
        this.statSubCategName = value;
    }

}
