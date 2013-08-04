
package awdl.history;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompetitionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompetitionInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}BaseStructInfoOfCompetitionInfo3pw8U1P1">
 *       &lt;sequence>
 *         &lt;element name="CompetitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdCompetition" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdOrganizer" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdSex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompetitionInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "competitionName",
    "idCompetition",
    "idOrganizer",
    "idSex",
    "idStatus",
    "idType"
})
public class CompetitionInfo
    extends BaseStructInfoOfCompetitionInfo3Pw8U1P1
{

    @XmlElementRef(name = "CompetitionName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> competitionName;
    @XmlElement(name = "IdCompetition")
    protected Integer idCompetition;
    @XmlElementRef(name = "IdOrganizer", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idOrganizer;
    @XmlElement(name = "IdSex")
    protected Integer idSex;
    @XmlElement(name = "IdStatus")
    protected Integer idStatus;
    @XmlElement(name = "IdType")
    protected Integer idType;

    /**
     * Gets the value of the competitionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompetitionName() {
        return competitionName;
    }

    /**
     * Sets the value of the competitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompetitionName(JAXBElement<String> value) {
        this.competitionName = value;
    }

    /**
     * Gets the value of the idCompetition property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCompetition() {
        return idCompetition;
    }

    /**
     * Sets the value of the idCompetition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCompetition(Integer value) {
        this.idCompetition = value;
    }

    /**
     * Gets the value of the idOrganizer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdOrganizer() {
        return idOrganizer;
    }

    /**
     * Sets the value of the idOrganizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdOrganizer(JAXBElement<Integer> value) {
        this.idOrganizer = value;
    }

    /**
     * Gets the value of the idSex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdSex() {
        return idSex;
    }

    /**
     * Sets the value of the idSex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdSex(Integer value) {
        this.idSex = value;
    }

    /**
     * Gets the value of the idStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdStatus() {
        return idStatus;
    }

    /**
     * Sets the value of the idStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdStatus(Integer value) {
        this.idStatus = value;
    }

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdType(Integer value) {
        this.idType = value;
    }

}
