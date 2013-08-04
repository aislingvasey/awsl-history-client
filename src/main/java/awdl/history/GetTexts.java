
package awdl.history;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
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
 *         &lt;element name="IdTexts" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfint" minOccurs="0"/>
 *         &lt;element name="IdTextCategory" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdLanguage" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}LanguageValue" minOccurs="0"/>
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
    "idTexts",
    "idTextCategory",
    "idLanguage"
})
@XmlRootElement(name = "GetTexts")
public class GetTexts {

    @XmlElementRef(name = "IdTexts", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfint> idTexts;
    @XmlElementRef(name = "IdTextCategory", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idTextCategory;
    @XmlList
    @XmlElement(name = "IdLanguage")
    protected List<String> idLanguage;

    /**
     * Gets the value of the idTexts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfint> getIdTexts() {
        return idTexts;
    }

    /**
     * Sets the value of the idTexts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}
     *     
     */
    public void setIdTexts(JAXBElement<ArrayOfint> value) {
        this.idTexts = value;
    }

    /**
     * Gets the value of the idTextCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdTextCategory() {
        return idTextCategory;
    }

    /**
     * Sets the value of the idTextCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdTextCategory(JAXBElement<Integer> value) {
        this.idTextCategory = value;
    }

    /**
     * Gets the value of the idLanguage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idLanguage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdLanguage() {
        if (idLanguage == null) {
            idLanguage = new ArrayList<String>();
        }
        return this.idLanguage;
    }

}
