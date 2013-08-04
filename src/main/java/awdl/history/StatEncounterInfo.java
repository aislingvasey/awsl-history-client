
package awdl.history;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatEncounterInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatEncounterInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}BaseStructInfoOfStatEncounterInfo3pw8U1P1">
 *       &lt;sequence>
 *         &lt;element name="IdEncounter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NbActions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NbStats" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatEncounterInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "idEncounter",
    "nbActions",
    "nbStats"
})
public class StatEncounterInfo
    extends BaseStructInfoOfStatEncounterInfo3Pw8U1P1
{

    @XmlElement(name = "IdEncounter")
    protected Integer idEncounter;
    @XmlElementRef(name = "NbActions", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> nbActions;
    @XmlElement(name = "NbStats")
    protected Integer nbStats;

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
     * Gets the value of the nbActions property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNbActions() {
        return nbActions;
    }

    /**
     * Sets the value of the nbActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNbActions(JAXBElement<Integer> value) {
        this.nbActions = value;
    }

    /**
     * Gets the value of the nbStats property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbStats() {
        return nbStats;
    }

    /**
     * Sets the value of the nbStats property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbStats(Integer value) {
        this.nbStats = value;
    }

}
