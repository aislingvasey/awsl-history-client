
package awdl.history;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatSeasonValueInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatSeasonValueInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}BaseStructInfoOfStatSeasonValueInfo3pw8U1P1">
 *       &lt;sequence>
 *         &lt;element name="IdEntity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdSeason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdStatDef" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdTypeStatSeasonValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NbEncountersUsed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatSeasonValueInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "idEntity",
    "idSeason",
    "idStatDef",
    "idTypeStatSeasonValue",
    "nbEncountersUsed",
    "value"
})
public class StatSeasonValueInfo
    extends BaseStructInfoOfStatSeasonValueInfo3Pw8U1P1
{

    @XmlElement(name = "IdEntity")
    protected Integer idEntity;
    @XmlElement(name = "IdSeason")
    protected Integer idSeason;
    @XmlElement(name = "IdStatDef")
    protected Integer idStatDef;
    @XmlElement(name = "IdTypeStatSeasonValue")
    protected Integer idTypeStatSeasonValue;
    @XmlElement(name = "NbEncountersUsed")
    protected Double nbEncountersUsed;
    @XmlElementRef(name = "Value", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> value;

    /**
     * Gets the value of the idEntity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEntity() {
        return idEntity;
    }

    /**
     * Sets the value of the idEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEntity(Integer value) {
        this.idEntity = value;
    }

    /**
     * Gets the value of the idSeason property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSeason() {
        return idSeason;
    }

    /**
     * Sets the value of the idSeason property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSeason(Integer value) {
        this.idSeason = value;
    }

    /**
     * Gets the value of the idStatDef property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdStatDef() {
        return idStatDef;
    }

    /**
     * Sets the value of the idStatDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdStatDef(Integer value) {
        this.idStatDef = value;
    }

    /**
     * Gets the value of the idTypeStatSeasonValue property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTypeStatSeasonValue() {
        return idTypeStatSeasonValue;
    }

    /**
     * Sets the value of the idTypeStatSeasonValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTypeStatSeasonValue(Integer value) {
        this.idTypeStatSeasonValue = value;
    }

    /**
     * Gets the value of the nbEncountersUsed property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getNbEncountersUsed() {
        return nbEncountersUsed;
    }

    /**
     * Sets the value of the nbEncountersUsed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setNbEncountersUsed(Double value) {
        this.nbEncountersUsed = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setValue(JAXBElement<Double> value) {
        this.value = value;
    }

}
