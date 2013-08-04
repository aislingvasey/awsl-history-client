
package awdl.history;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomTeam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomTeam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AbbrevClubName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClubMediaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClubName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClubStadiumName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClubWebSiteUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Code5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdClub" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdCountry" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdCurrentCompet" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdName" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdNameClub" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdStadium" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdTeam" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StrIdCompets" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamMediaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomTeam", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "abbrevClubName",
    "clubMediaName",
    "clubName",
    "clubStadiumName",
    "clubWebSiteUrl",
    "code5",
    "idClub",
    "idCountry",
    "idCurrentCompet",
    "idName",
    "idNameClub",
    "idStadium",
    "idTeam",
    "name",
    "strIdCompets",
    "teamMediaName"
})
public class CustomTeam {

    @XmlElementRef(name = "AbbrevClubName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> abbrevClubName;
    @XmlElementRef(name = "ClubMediaName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clubMediaName;
    @XmlElementRef(name = "ClubName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clubName;
    @XmlElementRef(name = "ClubStadiumName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clubStadiumName;
    @XmlElementRef(name = "ClubWebSiteUrl", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clubWebSiteUrl;
    @XmlElementRef(name = "Code5", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> code5;
    @XmlElement(name = "IdClub")
    protected Integer idClub;
    @XmlElement(name = "IdCountry")
    protected Integer idCountry;
    @XmlElement(name = "IdCurrentCompet")
    protected Integer idCurrentCompet;
    @XmlElement(name = "IdName")
    protected Integer idName;
    @XmlElement(name = "IdNameClub")
    protected Integer idNameClub;
    @XmlElementRef(name = "IdStadium", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idStadium;
    @XmlElement(name = "IdTeam")
    protected Integer idTeam;
    @XmlElementRef(name = "Name", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "StrIdCompets", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strIdCompets;
    @XmlElementRef(name = "TeamMediaName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> teamMediaName;

    /**
     * Gets the value of the abbrevClubName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAbbrevClubName() {
        return abbrevClubName;
    }

    /**
     * Sets the value of the abbrevClubName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAbbrevClubName(JAXBElement<String> value) {
        this.abbrevClubName = value;
    }

    /**
     * Gets the value of the clubMediaName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClubMediaName() {
        return clubMediaName;
    }

    /**
     * Sets the value of the clubMediaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClubMediaName(JAXBElement<String> value) {
        this.clubMediaName = value;
    }

    /**
     * Gets the value of the clubName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClubName() {
        return clubName;
    }

    /**
     * Sets the value of the clubName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClubName(JAXBElement<String> value) {
        this.clubName = value;
    }

    /**
     * Gets the value of the clubStadiumName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClubStadiumName() {
        return clubStadiumName;
    }

    /**
     * Sets the value of the clubStadiumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClubStadiumName(JAXBElement<String> value) {
        this.clubStadiumName = value;
    }

    /**
     * Gets the value of the clubWebSiteUrl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClubWebSiteUrl() {
        return clubWebSiteUrl;
    }

    /**
     * Sets the value of the clubWebSiteUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClubWebSiteUrl(JAXBElement<String> value) {
        this.clubWebSiteUrl = value;
    }

    /**
     * Gets the value of the code5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCode5() {
        return code5;
    }

    /**
     * Sets the value of the code5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCode5(JAXBElement<String> value) {
        this.code5 = value;
    }

    /**
     * Gets the value of the idClub property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdClub() {
        return idClub;
    }

    /**
     * Sets the value of the idClub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdClub(Integer value) {
        this.idClub = value;
    }

    /**
     * Gets the value of the idCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCountry() {
        return idCountry;
    }

    /**
     * Sets the value of the idCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCountry(Integer value) {
        this.idCountry = value;
    }

    /**
     * Gets the value of the idCurrentCompet property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdCurrentCompet() {
        return idCurrentCompet;
    }

    /**
     * Sets the value of the idCurrentCompet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdCurrentCompet(Integer value) {
        this.idCurrentCompet = value;
    }

    /**
     * Gets the value of the idName property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdName() {
        return idName;
    }

    /**
     * Sets the value of the idName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdName(Integer value) {
        this.idName = value;
    }

    /**
     * Gets the value of the idNameClub property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdNameClub() {
        return idNameClub;
    }

    /**
     * Sets the value of the idNameClub property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdNameClub(Integer value) {
        this.idNameClub = value;
    }

    /**
     * Gets the value of the idStadium property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdStadium() {
        return idStadium;
    }

    /**
     * Sets the value of the idStadium property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdStadium(JAXBElement<Integer> value) {
        this.idStadium = value;
    }

    /**
     * Gets the value of the idTeam property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTeam() {
        return idTeam;
    }

    /**
     * Sets the value of the idTeam property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTeam(Integer value) {
        this.idTeam = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the strIdCompets property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrIdCompets() {
        return strIdCompets;
    }

    /**
     * Sets the value of the strIdCompets property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrIdCompets(JAXBElement<String> value) {
        this.strIdCompets = value;
    }

    /**
     * Gets the value of the teamMediaName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTeamMediaName() {
        return teamMediaName;
    }

    /**
     * Sets the value of the teamMediaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTeamMediaName(JAXBElement<String> value) {
        this.teamMediaName = value;
    }

}
