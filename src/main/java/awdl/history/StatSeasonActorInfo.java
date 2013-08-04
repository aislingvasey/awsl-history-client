
package awdl.history;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatSeasonActorInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatSeasonActorInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}BaseStructInfoOfStatSeasonActorInfo3pw8U1P1">
 *       &lt;sequence>
 *         &lt;element name="IdActor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdSeason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NbCompleteMatchs" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NbMatchAmiscoPro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NbMatchVideoPro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatSeasonActorInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "idActor",
    "idSeason",
    "nbCompleteMatchs",
    "nbMatchAmiscoPro",
    "nbMatchVideoPro"
})
public class StatSeasonActorInfo
    extends BaseStructInfoOfStatSeasonActorInfo3Pw8U1P1
{

    @XmlElement(name = "IdActor")
    protected Integer idActor;
    @XmlElement(name = "IdSeason")
    protected Integer idSeason;
    @XmlElement(name = "NbCompleteMatchs")
    protected Integer nbCompleteMatchs;
    @XmlElement(name = "NbMatchAmiscoPro")
    protected Integer nbMatchAmiscoPro;
    @XmlElement(name = "NbMatchVideoPro")
    protected Integer nbMatchVideoPro;

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
     * Gets the value of the nbCompleteMatchs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbCompleteMatchs() {
        return nbCompleteMatchs;
    }

    /**
     * Sets the value of the nbCompleteMatchs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbCompleteMatchs(Integer value) {
        this.nbCompleteMatchs = value;
    }

    /**
     * Gets the value of the nbMatchAmiscoPro property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbMatchAmiscoPro() {
        return nbMatchAmiscoPro;
    }

    /**
     * Sets the value of the nbMatchAmiscoPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbMatchAmiscoPro(Integer value) {
        this.nbMatchAmiscoPro = value;
    }

    /**
     * Gets the value of the nbMatchVideoPro property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbMatchVideoPro() {
        return nbMatchVideoPro;
    }

    /**
     * Sets the value of the nbMatchVideoPro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbMatchVideoPro(Integer value) {
        this.nbMatchVideoPro = value;
    }

}
