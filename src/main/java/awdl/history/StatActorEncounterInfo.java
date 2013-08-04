
package awdl.history;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatActorEncounterInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatActorEncounterInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}BaseStructInfoOfStatActorEncounterInfo3pw8U1P1">
 *       &lt;sequence>
 *         &lt;element name="EncounterComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IdActor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdEncounter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Period1Complete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Period2Complete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Period3Complete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Period4Complete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrecentPlayed" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="TimePlayed" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatActorEncounterInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "encounterComplete",
    "idActor",
    "idEncounter",
    "period1Complete",
    "period2Complete",
    "period3Complete",
    "period4Complete",
    "precentPlayed",
    "timePlayed"
})
public class StatActorEncounterInfo
    extends BaseStructInfoOfStatActorEncounterInfo3Pw8U1P1
{

    @XmlElement(name = "EncounterComplete")
    protected Boolean encounterComplete;
    @XmlElement(name = "IdActor")
    protected Integer idActor;
    @XmlElement(name = "IdEncounter")
    protected Integer idEncounter;
    @XmlElement(name = "Period1Complete")
    protected Boolean period1Complete;
    @XmlElement(name = "Period2Complete")
    protected Boolean period2Complete;
    @XmlElementRef(name = "Period3Complete", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> period3Complete;
    @XmlElementRef(name = "Period4Complete", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> period4Complete;
    @XmlElementRef(name = "PrecentPlayed", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> precentPlayed;
    @XmlElementRef(name = "TimePlayed", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> timePlayed;

    /**
     * Gets the value of the encounterComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEncounterComplete() {
        return encounterComplete;
    }

    /**
     * Sets the value of the encounterComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncounterComplete(Boolean value) {
        this.encounterComplete = value;
    }

    /**
     * Gets the value of the idActor property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdActor() {
        return idActor;
    }

    /**
     * Sets the value of the idActor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdActor(Integer value) {
        this.idActor = value;
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
     * Gets the value of the period1Complete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPeriod1Complete() {
        return period1Complete;
    }

    /**
     * Sets the value of the period1Complete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPeriod1Complete(Boolean value) {
        this.period1Complete = value;
    }

    /**
     * Gets the value of the period2Complete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPeriod2Complete() {
        return period2Complete;
    }

    /**
     * Sets the value of the period2Complete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPeriod2Complete(Boolean value) {
        this.period2Complete = value;
    }

    /**
     * Gets the value of the period3Complete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPeriod3Complete() {
        return period3Complete;
    }

    /**
     * Sets the value of the period3Complete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPeriod3Complete(JAXBElement<Boolean> value) {
        this.period3Complete = value;
    }

    /**
     * Gets the value of the period4Complete property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPeriod4Complete() {
        return period4Complete;
    }

    /**
     * Sets the value of the period4Complete property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPeriod4Complete(JAXBElement<Boolean> value) {
        this.period4Complete = value;
    }

    /**
     * Gets the value of the precentPlayed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public JAXBElement<Double> getPrecentPlayed() {
        return precentPlayed;
    }

    /**
     * Sets the value of the precentPlayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Double }{@code >}
     *     
     */
    public void setPrecentPlayed(JAXBElement<Double> value) {
        this.precentPlayed = value;
    }

    /**
     * Gets the value of the timePlayed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTimePlayed() {
        return timePlayed;
    }

    /**
     * Sets the value of the timePlayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTimePlayed(JAXBElement<Integer> value) {
        this.timePlayed = value;
    }

}
