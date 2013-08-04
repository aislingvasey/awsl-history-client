
package awdl.history;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EncounterInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncounterInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}BaseStructInfoOfEncounterInfo3pw8U1P1">
 *       &lt;sequence>
 *         &lt;element name="ClubAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClubBName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompetOrganizerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompetitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompetitionType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="DateAndTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Duration1" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Duration2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Duration3" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Duration4" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Groupe" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdCompany" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdCompetition" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdEncounter" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdNameTeamA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdNameTeamB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdPitch" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdSeason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdStatCalculationState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdState" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdTeamA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdTeamB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdTour" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsAmisco" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MatchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MatchState" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}MatchState" minOccurs="0"/>
 *         &lt;element name="MatchType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NbActions" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NbPeriods" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NbStats" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="NumDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScoreEndFinalShot_TeamA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScoreEndFinalShot_TeamB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScoreEndOfficialTime_TeamA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScoreEndOfficialTime_TeamB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScoreEndProlongation_TeamA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ScoreEndProlongation_TeamB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Score_TeamA" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Score_TeamB" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SeasonEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="SeasonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeasonStart" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="TeamAC5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamAName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamBC5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TeamBName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TpSynchroVideoMT1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TpSynchroVideoMT2" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TpSynchroVideoMT3" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="TpSynchroVideoMT4" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="VideoMatchState" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncounterInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "clubAName",
    "clubBName",
    "codeName",
    "competOrganizerName",
    "competitionName",
    "competitionType",
    "dateAndTime",
    "duration",
    "duration1",
    "duration2",
    "duration3",
    "duration4",
    "groupe",
    "idCompany",
    "idCompetition",
    "idDay",
    "idEncounter",
    "idNameTeamA",
    "idNameTeamB",
    "idPitch",
    "idSeason",
    "idStatCalculationState",
    "idState",
    "idTeamA",
    "idTeamB",
    "idTour",
    "isAmisco",
    "matchCode",
    "matchState",
    "matchType",
    "nbActions",
    "nbPeriods",
    "nbStats",
    "numDay",
    "scoreEndFinalShotTeamA",
    "scoreEndFinalShotTeamB",
    "scoreEndOfficialTimeTeamA",
    "scoreEndOfficialTimeTeamB",
    "scoreEndProlongationTeamA",
    "scoreEndProlongationTeamB",
    "scoreTeamA",
    "scoreTeamB",
    "seasonEnd",
    "seasonName",
    "seasonStart",
    "teamAC5",
    "teamAName",
    "teamBC5",
    "teamBName",
    "tpSynchroVideoMT1",
    "tpSynchroVideoMT2",
    "tpSynchroVideoMT3",
    "tpSynchroVideoMT4",
    "videoMatchState"
})
public class EncounterInfo
    extends BaseStructInfoOfEncounterInfo3Pw8U1P1
{

    @XmlElementRef(name = "ClubAName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clubAName;
    @XmlElementRef(name = "ClubBName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clubBName;
    @XmlElementRef(name = "CodeName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> codeName;
    @XmlElementRef(name = "CompetOrganizerName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> competOrganizerName;
    @XmlElementRef(name = "CompetitionName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> competitionName;
    @XmlElement(name = "CompetitionType")
    protected Integer competitionType;
    @XmlElement(name = "DateAndTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateAndTime;
    @XmlElement(name = "Duration")
    protected Integer duration;
    @XmlElementRef(name = "Duration1", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> duration1;
    @XmlElementRef(name = "Duration2", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> duration2;
    @XmlElementRef(name = "Duration3", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> duration3;
    @XmlElementRef(name = "Duration4", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> duration4;
    @XmlElementRef(name = "Groupe", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> groupe;
    @XmlElementRef(name = "IdCompany", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idCompany;
    @XmlElementRef(name = "IdCompetition", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idCompetition;
    @XmlElementRef(name = "IdDay", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idDay;
    @XmlElement(name = "IdEncounter")
    protected Integer idEncounter;
    @XmlElement(name = "IdNameTeamA")
    protected Integer idNameTeamA;
    @XmlElement(name = "IdNameTeamB")
    protected Integer idNameTeamB;
    @XmlElementRef(name = "IdPitch", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idPitch;
    @XmlElementRef(name = "IdSeason", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idSeason;
    @XmlElementRef(name = "IdStatCalculationState", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idStatCalculationState;
    @XmlElement(name = "IdState")
    protected Integer idState;
    @XmlElement(name = "IdTeamA")
    protected Integer idTeamA;
    @XmlElement(name = "IdTeamB")
    protected Integer idTeamB;
    @XmlElementRef(name = "IdTour", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> idTour;
    @XmlElement(name = "IsAmisco")
    protected Boolean isAmisco;
    @XmlElementRef(name = "MatchCode", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> matchCode;
    @XmlElementRef(name = "MatchState", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<MatchState> matchState;
    @XmlElementRef(name = "MatchType", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> matchType;
    @XmlElement(name = "NbActions")
    protected Integer nbActions;
    @XmlElement(name = "NbPeriods")
    protected Integer nbPeriods;
    @XmlElement(name = "NbStats")
    protected Integer nbStats;
    @XmlElementRef(name = "NumDay", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> numDay;
    @XmlElementRef(name = "ScoreEndFinalShot_TeamA", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreEndFinalShotTeamA;
    @XmlElementRef(name = "ScoreEndFinalShot_TeamB", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreEndFinalShotTeamB;
    @XmlElementRef(name = "ScoreEndOfficialTime_TeamA", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreEndOfficialTimeTeamA;
    @XmlElementRef(name = "ScoreEndOfficialTime_TeamB", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreEndOfficialTimeTeamB;
    @XmlElementRef(name = "ScoreEndProlongation_TeamA", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreEndProlongationTeamA;
    @XmlElementRef(name = "ScoreEndProlongation_TeamB", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreEndProlongationTeamB;
    @XmlElementRef(name = "Score_TeamA", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreTeamA;
    @XmlElementRef(name = "Score_TeamB", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> scoreTeamB;
    @XmlElement(name = "SeasonEnd")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar seasonEnd;
    @XmlElementRef(name = "SeasonName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seasonName;
    @XmlElement(name = "SeasonStart")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar seasonStart;
    @XmlElementRef(name = "TeamAC5", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> teamAC5;
    @XmlElementRef(name = "TeamAName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> teamAName;
    @XmlElementRef(name = "TeamBC5", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> teamBC5;
    @XmlElementRef(name = "TeamBName", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<String> teamBName;
    @XmlElementRef(name = "TpSynchroVideoMT1", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tpSynchroVideoMT1;
    @XmlElementRef(name = "TpSynchroVideoMT2", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tpSynchroVideoMT2;
    @XmlElementRef(name = "TpSynchroVideoMT3", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tpSynchroVideoMT3;
    @XmlElementRef(name = "TpSynchroVideoMT4", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> tpSynchroVideoMT4;
    @XmlElementRef(name = "VideoMatchState", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> videoMatchState;

    /**
     * Gets the value of the clubAName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClubAName() {
        return clubAName;
    }

    /**
     * Sets the value of the clubAName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClubAName(JAXBElement<String> value) {
        this.clubAName = value;
    }

    /**
     * Gets the value of the clubBName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClubBName() {
        return clubBName;
    }

    /**
     * Sets the value of the clubBName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClubBName(JAXBElement<String> value) {
        this.clubBName = value;
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
     * Gets the value of the competOrganizerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompetOrganizerName() {
        return competOrganizerName;
    }

    /**
     * Sets the value of the competOrganizerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompetOrganizerName(JAXBElement<String> value) {
        this.competOrganizerName = value;
    }

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
     * Gets the value of the competitionType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompetitionType() {
        return competitionType;
    }

    /**
     * Sets the value of the competitionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompetitionType(Integer value) {
        this.competitionType = value;
    }

    /**
     * Gets the value of the dateAndTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateAndTime() {
        return dateAndTime;
    }

    /**
     * Sets the value of the dateAndTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateAndTime(XMLGregorianCalendar value) {
        this.dateAndTime = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDuration(Integer value) {
        this.duration = value;
    }

    /**
     * Gets the value of the duration1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDuration1() {
        return duration1;
    }

    /**
     * Sets the value of the duration1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDuration1(JAXBElement<XMLGregorianCalendar> value) {
        this.duration1 = value;
    }

    /**
     * Gets the value of the duration2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDuration2() {
        return duration2;
    }

    /**
     * Sets the value of the duration2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDuration2(JAXBElement<XMLGregorianCalendar> value) {
        this.duration2 = value;
    }

    /**
     * Gets the value of the duration3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDuration3() {
        return duration3;
    }

    /**
     * Sets the value of the duration3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDuration3(JAXBElement<XMLGregorianCalendar> value) {
        this.duration3 = value;
    }

    /**
     * Gets the value of the duration4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDuration4() {
        return duration4;
    }

    /**
     * Sets the value of the duration4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDuration4(JAXBElement<XMLGregorianCalendar> value) {
        this.duration4 = value;
    }

    /**
     * Gets the value of the groupe property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getGroupe() {
        return groupe;
    }

    /**
     * Sets the value of the groupe property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setGroupe(JAXBElement<Integer> value) {
        this.groupe = value;
    }

    /**
     * Gets the value of the idCompany property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdCompany() {
        return idCompany;
    }

    /**
     * Sets the value of the idCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdCompany(JAXBElement<Integer> value) {
        this.idCompany = value;
    }

    /**
     * Gets the value of the idCompetition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdCompetition() {
        return idCompetition;
    }

    /**
     * Sets the value of the idCompetition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdCompetition(JAXBElement<Integer> value) {
        this.idCompetition = value;
    }

    /**
     * Gets the value of the idDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdDay() {
        return idDay;
    }

    /**
     * Sets the value of the idDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdDay(JAXBElement<Integer> value) {
        this.idDay = value;
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
     * Gets the value of the idNameTeamA property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdNameTeamA() {
        return idNameTeamA;
    }

    /**
     * Sets the value of the idNameTeamA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdNameTeamA(Integer value) {
        this.idNameTeamA = value;
    }

    /**
     * Gets the value of the idNameTeamB property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdNameTeamB() {
        return idNameTeamB;
    }

    /**
     * Sets the value of the idNameTeamB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdNameTeamB(Integer value) {
        this.idNameTeamB = value;
    }

    /**
     * Gets the value of the idPitch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdPitch() {
        return idPitch;
    }

    /**
     * Sets the value of the idPitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdPitch(JAXBElement<Integer> value) {
        this.idPitch = value;
    }

    /**
     * Gets the value of the idSeason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdSeason() {
        return idSeason;
    }

    /**
     * Sets the value of the idSeason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdSeason(JAXBElement<Integer> value) {
        this.idSeason = value;
    }

    /**
     * Gets the value of the idStatCalculationState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdStatCalculationState() {
        return idStatCalculationState;
    }

    /**
     * Sets the value of the idStatCalculationState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdStatCalculationState(JAXBElement<Integer> value) {
        this.idStatCalculationState = value;
    }

    /**
     * Gets the value of the idState property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdState() {
        return idState;
    }

    /**
     * Sets the value of the idState property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdState(Integer value) {
        this.idState = value;
    }

    /**
     * Gets the value of the idTeamA property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTeamA() {
        return idTeamA;
    }

    /**
     * Sets the value of the idTeamA property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTeamA(Integer value) {
        this.idTeamA = value;
    }

    /**
     * Gets the value of the idTeamB property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIdTeamB() {
        return idTeamB;
    }

    /**
     * Sets the value of the idTeamB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIdTeamB(Integer value) {
        this.idTeamB = value;
    }

    /**
     * Gets the value of the idTour property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIdTour() {
        return idTour;
    }

    /**
     * Sets the value of the idTour property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIdTour(JAXBElement<Integer> value) {
        this.idTour = value;
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
     * Gets the value of the matchCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMatchCode() {
        return matchCode;
    }

    /**
     * Sets the value of the matchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMatchCode(JAXBElement<String> value) {
        this.matchCode = value;
    }

    /**
     * Gets the value of the matchState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MatchState }{@code >}
     *     
     */
    public JAXBElement<MatchState> getMatchState() {
        return matchState;
    }

    /**
     * Sets the value of the matchState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MatchState }{@code >}
     *     
     */
    public void setMatchState(JAXBElement<MatchState> value) {
        this.matchState = value;
    }

    /**
     * Gets the value of the matchType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getMatchType() {
        return matchType;
    }

    /**
     * Sets the value of the matchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setMatchType(JAXBElement<Integer> value) {
        this.matchType = value;
    }

    /**
     * Gets the value of the nbActions property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbActions() {
        return nbActions;
    }

    /**
     * Sets the value of the nbActions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbActions(Integer value) {
        this.nbActions = value;
    }

    /**
     * Gets the value of the nbPeriods property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNbPeriods() {
        return nbPeriods;
    }

    /**
     * Sets the value of the nbPeriods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNbPeriods(Integer value) {
        this.nbPeriods = value;
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

    /**
     * Gets the value of the numDay property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getNumDay() {
        return numDay;
    }

    /**
     * Sets the value of the numDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setNumDay(JAXBElement<Integer> value) {
        this.numDay = value;
    }

    /**
     * Gets the value of the scoreEndFinalShotTeamA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreEndFinalShotTeamA() {
        return scoreEndFinalShotTeamA;
    }

    /**
     * Sets the value of the scoreEndFinalShotTeamA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreEndFinalShotTeamA(JAXBElement<Integer> value) {
        this.scoreEndFinalShotTeamA = value;
    }

    /**
     * Gets the value of the scoreEndFinalShotTeamB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreEndFinalShotTeamB() {
        return scoreEndFinalShotTeamB;
    }

    /**
     * Sets the value of the scoreEndFinalShotTeamB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreEndFinalShotTeamB(JAXBElement<Integer> value) {
        this.scoreEndFinalShotTeamB = value;
    }

    /**
     * Gets the value of the scoreEndOfficialTimeTeamA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreEndOfficialTimeTeamA() {
        return scoreEndOfficialTimeTeamA;
    }

    /**
     * Sets the value of the scoreEndOfficialTimeTeamA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreEndOfficialTimeTeamA(JAXBElement<Integer> value) {
        this.scoreEndOfficialTimeTeamA = value;
    }

    /**
     * Gets the value of the scoreEndOfficialTimeTeamB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreEndOfficialTimeTeamB() {
        return scoreEndOfficialTimeTeamB;
    }

    /**
     * Sets the value of the scoreEndOfficialTimeTeamB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreEndOfficialTimeTeamB(JAXBElement<Integer> value) {
        this.scoreEndOfficialTimeTeamB = value;
    }

    /**
     * Gets the value of the scoreEndProlongationTeamA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreEndProlongationTeamA() {
        return scoreEndProlongationTeamA;
    }

    /**
     * Sets the value of the scoreEndProlongationTeamA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreEndProlongationTeamA(JAXBElement<Integer> value) {
        this.scoreEndProlongationTeamA = value;
    }

    /**
     * Gets the value of the scoreEndProlongationTeamB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreEndProlongationTeamB() {
        return scoreEndProlongationTeamB;
    }

    /**
     * Sets the value of the scoreEndProlongationTeamB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreEndProlongationTeamB(JAXBElement<Integer> value) {
        this.scoreEndProlongationTeamB = value;
    }

    /**
     * Gets the value of the scoreTeamA property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreTeamA() {
        return scoreTeamA;
    }

    /**
     * Sets the value of the scoreTeamA property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreTeamA(JAXBElement<Integer> value) {
        this.scoreTeamA = value;
    }

    /**
     * Gets the value of the scoreTeamB property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getScoreTeamB() {
        return scoreTeamB;
    }

    /**
     * Sets the value of the scoreTeamB property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setScoreTeamB(JAXBElement<Integer> value) {
        this.scoreTeamB = value;
    }

    /**
     * Gets the value of the seasonEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeasonEnd() {
        return seasonEnd;
    }

    /**
     * Sets the value of the seasonEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeasonEnd(XMLGregorianCalendar value) {
        this.seasonEnd = value;
    }

    /**
     * Gets the value of the seasonName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeasonName() {
        return seasonName;
    }

    /**
     * Sets the value of the seasonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeasonName(JAXBElement<String> value) {
        this.seasonName = value;
    }

    /**
     * Gets the value of the seasonStart property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeasonStart() {
        return seasonStart;
    }

    /**
     * Sets the value of the seasonStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeasonStart(XMLGregorianCalendar value) {
        this.seasonStart = value;
    }

    /**
     * Gets the value of the teamAC5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTeamAC5() {
        return teamAC5;
    }

    /**
     * Sets the value of the teamAC5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTeamAC5(JAXBElement<String> value) {
        this.teamAC5 = value;
    }

    /**
     * Gets the value of the teamAName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTeamAName() {
        return teamAName;
    }

    /**
     * Sets the value of the teamAName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTeamAName(JAXBElement<String> value) {
        this.teamAName = value;
    }

    /**
     * Gets the value of the teamBC5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTeamBC5() {
        return teamBC5;
    }

    /**
     * Sets the value of the teamBC5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTeamBC5(JAXBElement<String> value) {
        this.teamBC5 = value;
    }

    /**
     * Gets the value of the teamBName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTeamBName() {
        return teamBName;
    }

    /**
     * Sets the value of the teamBName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTeamBName(JAXBElement<String> value) {
        this.teamBName = value;
    }

    /**
     * Gets the value of the tpSynchroVideoMT1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTpSynchroVideoMT1() {
        return tpSynchroVideoMT1;
    }

    /**
     * Sets the value of the tpSynchroVideoMT1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTpSynchroVideoMT1(JAXBElement<Integer> value) {
        this.tpSynchroVideoMT1 = value;
    }

    /**
     * Gets the value of the tpSynchroVideoMT2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTpSynchroVideoMT2() {
        return tpSynchroVideoMT2;
    }

    /**
     * Sets the value of the tpSynchroVideoMT2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTpSynchroVideoMT2(JAXBElement<Integer> value) {
        this.tpSynchroVideoMT2 = value;
    }

    /**
     * Gets the value of the tpSynchroVideoMT3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTpSynchroVideoMT3() {
        return tpSynchroVideoMT3;
    }

    /**
     * Sets the value of the tpSynchroVideoMT3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTpSynchroVideoMT3(JAXBElement<Integer> value) {
        this.tpSynchroVideoMT3 = value;
    }

    /**
     * Gets the value of the tpSynchroVideoMT4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getTpSynchroVideoMT4() {
        return tpSynchroVideoMT4;
    }

    /**
     * Sets the value of the tpSynchroVideoMT4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setTpSynchroVideoMT4(JAXBElement<Integer> value) {
        this.tpSynchroVideoMT4 = value;
    }

    /**
     * Gets the value of the videoMatchState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getVideoMatchState() {
        return videoMatchState;
    }

    /**
     * Sets the value of the videoMatchState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setVideoMatchState(JAXBElement<Boolean> value) {
        this.videoMatchState = value;
    }

}
