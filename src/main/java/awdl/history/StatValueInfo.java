
package awdl.history;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatValueInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatValueInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}BaseStructInfoOfStatValueInfo3pw8U1P1">
 *       &lt;sequence>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdEncounter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdEntity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdPeriod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdStatDef" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="ZoneX1" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *         &lt;element name="ZoneX2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ZoneY1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ZoneY2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ZoneZ1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ZoneZ2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatValueInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "endTime",
    "idEncounter",
    "idEntity",
    "idPeriod",
    "idStatDef",
    "startTime",
    "value",
    "zoneX1",
    "zoneX2",
    "zoneY1",
    "zoneY2",
    "zoneZ1",
    "zoneZ2"
})
public class StatValueInfo
    extends BaseStructInfoOfStatValueInfo3Pw8U1P1
{

    @XmlElementRef(name = "EndTime", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> endTime;
    @XmlElement(name = "IdEncounter")
    protected Integer idEncounter;
    @XmlElement(name = "IdEntity")
    protected Integer idEntity;
    @XmlElementRef(name = "IdPeriod", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idPeriod;
    @XmlElement(name = "IdStatDef")
    protected Integer idStatDef;
    @XmlElementRef(name = "StartTime", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> startTime;
    @XmlElementRef(name = "Value", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> value;
    @XmlElementRef(name = "ZoneX1", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Short> zoneX1;
    @XmlElementRef(name = "ZoneX2", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> zoneX2;
    @XmlElementRef(name = "ZoneY1", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> zoneY1;
    @XmlElementRef(name = "ZoneY2", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> zoneY2;
    @XmlElementRef(name = "ZoneZ1", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> zoneZ1;
    @XmlElementRef(name = "ZoneZ2", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> zoneZ2;

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<Integer> value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the idEncounter property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdEncounter() {
        return idEncounter;
    }

    /**
     * Sets the value of the idEncounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdEncounter(Integer value) {
        this.idEncounter = value;
    }

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
     * Gets the value of the idPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdPeriod() {
        return idPeriod;
    }

    /**
     * Sets the value of the idPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdPeriod(JAXBElement<Integer> value) {
        this.idPeriod = value;
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
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<Integer> value) {
        this.startTime = value;
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

    /**
     * Gets the value of the zoneX1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public JAXBElement<Short> getZoneX1() {
        return zoneX1;
    }

    /**
     * Sets the value of the zoneX1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Short }{@code >}
     *     
     */
    public void setZoneX1(JAXBElement<Short> value) {
        this.zoneX1 = value;
    }

    /**
     * Gets the value of the zoneX2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getZoneX2() {
        return zoneX2;
    }

    /**
     * Sets the value of the zoneX2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setZoneX2(JAXBElement<Integer> value) {
        this.zoneX2 = value;
    }

    /**
     * Gets the value of the zoneY1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getZoneY1() {
        return zoneY1;
    }

    /**
     * Sets the value of the zoneY1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setZoneY1(JAXBElement<Integer> value) {
        this.zoneY1 = value;
    }

    /**
     * Gets the value of the zoneY2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getZoneY2() {
        return zoneY2;
    }

    /**
     * Sets the value of the zoneY2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setZoneY2(JAXBElement<Integer> value) {
        this.zoneY2 = value;
    }

    /**
     * Gets the value of the zoneZ1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getZoneZ1() {
        return zoneZ1;
    }

    /**
     * Sets the value of the zoneZ1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setZoneZ1(JAXBElement<Integer> value) {
        this.zoneZ1 = value;
    }

    /**
     * Gets the value of the zoneZ2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getZoneZ2() {
        return zoneZ2;
    }

    /**
     * Sets the value of the zoneZ2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setZoneZ2(JAXBElement<Integer> value) {
        this.zoneZ2 = value;
    }

}
