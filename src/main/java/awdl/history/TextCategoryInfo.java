
package awdl.history;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TextCategoryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextCategoryInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}BaseStructInfoOfTextCategoryInfo3pw8U1P1">
 *       &lt;sequence>
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdTextCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextCategoryInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "category",
    "idTextCategory"
})
public class TextCategoryInfo
    extends BaseStructInfoOfTextCategoryInfo3Pw8U1P1
{

    @XmlElementRef(name = "Category", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> category;
    @XmlElement(name = "IdTextCategory")
    protected Integer idTextCategory;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategory(JAXBElement<String> value) {
        this.category = value;
    }

    /**
     * Gets the value of the idTextCategory property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTextCategory() {
        return idTextCategory;
    }

    /**
     * Sets the value of the idTextCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTextCategory(Integer value) {
        this.idTextCategory = value;
    }

}
