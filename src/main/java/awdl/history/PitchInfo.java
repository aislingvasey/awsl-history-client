
package awdl.history;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PitchInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PitchInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}BaseStructInfoOfPitchInfo3pw8U1P1">
 *       &lt;sequence>
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdCity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdPitch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdPitchName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsAmisco" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PitchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PitchInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "cityName",
    "codeName",
    "idCity",
    "idPitch",
    "idPitchName",
    "isAmisco",
    "pitchName"
})
public class PitchInfo
    extends BaseStructInfoOfPitchInfo3Pw8U1P1
{

    @XmlElementRef(name = "CityName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cityName;
    @XmlElementRef(name = "CodeName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeName;
    @XmlElement(name = "IdCity")
    protected Integer idCity;
    @XmlElement(name = "IdPitch")
    protected Integer idPitch;
    @XmlElement(name = "IdPitchName")
    protected Integer idPitchName;
    @XmlElement(name = "IsAmisco")
    protected Boolean isAmisco;
    @XmlElementRef(name = "PitchName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pitchName;

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCityName(JAXBElement<String> value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the codeName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCodeName() {
        return codeName;
    }

    /**
     * Sets the value of the codeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCodeName(JAXBElement<String> value) {
        this.codeName = value;
    }

    /**
     * Gets the value of the idCity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCity() {
        return idCity;
    }

    /**
     * Sets the value of the idCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCity(Integer value) {
        this.idCity = value;
    }

    /**
     * Gets the value of the idPitch property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPitch() {
        return idPitch;
    }

    /**
     * Sets the value of the idPitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPitch(Integer value) {
        this.idPitch = value;
    }

    /**
     * Gets the value of the idPitchName property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdPitchName() {
        return idPitchName;
    }

    /**
     * Sets the value of the idPitchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdPitchName(Integer value) {
        this.idPitchName = value;
    }

    /**
     * Gets the value of the isAmisco property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAmisco() {
        return isAmisco;
    }

    /**
     * Sets the value of the isAmisco property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAmisco(Boolean value) {
        this.isAmisco = value;
    }

    /**
     * Gets the value of the pitchName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPitchName() {
        return pitchName;
    }

    /**
     * Sets the value of the pitchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPitchName(JAXBElement<String> value) {
        this.pitchName = value;
    }

}
