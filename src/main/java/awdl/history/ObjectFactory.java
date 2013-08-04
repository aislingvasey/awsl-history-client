
package awdl.history;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the awdl.history package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private final static QName _StatCategInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "StatCategInfo");
    private final static QName _PitchInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "PitchInfo");
    private final static QName _BaseStructInfoOfTextCategoryInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfTextCategoryInfo3pw8U1P1");
    private final static QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private final static QName _ArrayOfStatActorTrendInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfStatActorTrendInfo");
    private final static QName _BaseStructInfoOfStatEncounterInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfStatEncounterInfo3pw8U1P1");
    private final static QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private final static QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private final static QName _BaseStructInfoOfStatInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfStatInfo3pw8U1P1");
    private final static QName _StatSeasonValueInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "StatSeasonValueInfo");
    private final static QName _TextCategoryInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "TextCategoryInfo");
    private final static QName _ArrayOfStatEncounterInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfStatEncounterInfo");
    private final static QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private final static QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private final static QName _EncounterInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "EncounterInfo");
    private final static QName _ArrayOfPhotoInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfPhotoInfo");
    private final static QName _StatSeasonActorInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "StatSeasonActorInfo");
    private final static QName _BaseStructInfoOfStatSeasonActorInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfStatSeasonActorInfo3pw8U1P1");
    private final static QName _ArrayOfUnitInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfUnitInfo");
    private final static QName _BaseStructInfoOfSeasonInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfSeasonInfo3pw8U1P1");
    private final static QName _ArrayOfTextInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfTextInfo");
    private final static QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private final static QName _StatActorTrendInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "StatActorTrendInfo");
    private final static QName _ArrayOfPitchInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfPitchInfo");
    private final static QName _ArrayOfCompetitionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfCompetitionInfo");
    private final static QName _ArrayOfCustomTeam_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfCustomTeam");
    private final static QName _StatValueInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "StatValueInfo");
    private final static QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private final static QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private final static QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private final static QName _BaseStructInfoOfStatSeasonValueInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfStatSeasonValueInfo3pw8U1P1");
    private final static QName _ArrayOfStatCategInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfStatCategInfo");
    private final static QName _PlayerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "PlayerInfo");
    private final static QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private final static QName _ArrayOfPlayerInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfPlayerInfo");
    private final static QName _PhotoInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "PhotoInfo");
    private final static QName _ArrayOfStatValueInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfStatValueInfo");
    private final static QName _LanguageValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "LanguageValue");
    private final static QName _SeasonInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "SeasonInfo");
    private final static QName _ArrayOfint_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfint");
    private final static QName _BaseStructInfoOfCompetitionInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfCompetitionInfo3pw8U1P1");
    private final static QName _BaseStructInfoOfStatValueInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfStatValueInfo3pw8U1P1");
    private final static QName _ArrayOfStatInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfStatInfo");
    private final static QName _CompetitionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "CompetitionInfo");
    private final static QName _BaseStructInfoOfEncounterInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfEncounterInfo3pw8U1P1");
    private final static QName _ProfessionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ProfessionInfo");
    private final static QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private final static QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private final static QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private final static QName _BaseStructInfoOfStatSubCategInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfStatSubCategInfo3pw8U1P1");
    private final static QName _BaseStructInfoOfUnitInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfUnitInfo3pw8U1P1");
    private final static QName _StatEncounterInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "StatEncounterInfo");
    private final static QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private final static QName _StatActorEncounterInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "StatActorEncounterInfo");
    private final static QName _ArrayOfProfessionInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfProfessionInfo");
    private final static QName _BaseStructInfoOfPitchInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfPitchInfo3pw8U1P1");
    private final static QName _BaseStructInfoOfStatActorEncounterInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfStatActorEncounterInfo3pw8U1P1");
    private final static QName _StatInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "StatInfo");
    private final static QName _ArrayOfStatSubCategInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfStatSubCategInfo");
    private final static QName _ArrayOfStatSeasonActorInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfStatSeasonActorInfo");
    private final static QName _BaseStructInfoOfStatActorTrendInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfStatActorTrendInfo3pw8U1P1");
    private final static QName _BaseStructInfoOfPhotoInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfPhotoInfo3pw8U1P1");
    private final static QName _CustomTeam_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "CustomTeam");
    private final static QName _ArrayOfEncounterInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfEncounterInfo");
    private final static QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private final static QName _ArrayOfSeasonInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfSeasonInfo");
    private final static QName _ArrayOfTextCategoryInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfTextCategoryInfo");
    private final static QName _ArrayOfStatActorEncounterInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfStatActorEncounterInfo");
    private final static QName _UnitInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "UnitInfo");
    private final static QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private final static QName _TextInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "TextInfo");
    private final static QName _BaseStructInfoOfTextInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfTextInfo3pw8U1P1");
    private final static QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private final static QName _BaseStructInfoOfStatCategInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfStatCategInfo3pw8U1P1");
    private final static QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private final static QName _StatSubCategInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "StatSubCategInfo");
    private final static QName _BaseStructInfoOfPlayerInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfPlayerInfo3pw8U1P1");
    private final static QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private final static QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private final static QName _BaseStructInfoOfProfessionInfo3Pw8U1P1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BaseStructInfoOfProfessionInfo3pw8U1P1");
    private final static QName _MatchState_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "MatchState");
    private final static QName _ArrayOfStatSeasonValueInfo_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ArrayOfStatSeasonValueInfo");
    private final static QName _GetStatSubCategsIdStatCategs_QNAME = new QName("http://tempuri.org/", "IdStatCategs");
    private final static QName _EncounterInfoVideoMatchState_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "VideoMatchState");
    private final static QName _EncounterInfoScoreEndProlongationTeamB_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ScoreEndProlongation_TeamB");
    private final static QName _EncounterInfoScoreEndProlongationTeamA_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ScoreEndProlongation_TeamA");
    private final static QName _EncounterInfoIdPitch_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdPitch");
    private final static QName _EncounterInfoNumDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "NumDay");
    private final static QName _EncounterInfoTpSynchroVideoMT3_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "TpSynchroVideoMT3");
    private final static QName _EncounterInfoTpSynchroVideoMT2_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "TpSynchroVideoMT2");
    private final static QName _EncounterInfoIdStatCalculationState_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdStatCalculationState");
    private final static QName _EncounterInfoTpSynchroVideoMT1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "TpSynchroVideoMT1");
    private final static QName _EncounterInfoCodeName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "CodeName");
    private final static QName _EncounterInfoScoreEndOfficialTimeTeamA_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ScoreEndOfficialTime_TeamA");
    private final static QName _EncounterInfoScoreEndOfficialTimeTeamB_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ScoreEndOfficialTime_TeamB");
    private final static QName _EncounterInfoClubAName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ClubAName");
    private final static QName _EncounterInfoDuration4_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Duration4");
    private final static QName _EncounterInfoIdCompetition_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdCompetition");
    private final static QName _EncounterInfoTeamAC5_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "TeamAC5");
    private final static QName _EncounterInfoScoreEndFinalShotTeamA_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ScoreEndFinalShot_TeamA");
    private final static QName _EncounterInfoScoreEndFinalShotTeamB_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ScoreEndFinalShot_TeamB");
    private final static QName _EncounterInfoTeamAName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "TeamAName");
    private final static QName _EncounterInfoTeamBC5_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "TeamBC5");
    private final static QName _EncounterInfoMatchCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "MatchCode");
    private final static QName _EncounterInfoTeamBName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "TeamBName");
    private final static QName _EncounterInfoSeasonName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "SeasonName");
    private final static QName _EncounterInfoIdDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdDay");
    private final static QName _EncounterInfoMatchType_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "MatchType");
    private final static QName _EncounterInfoClubBName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ClubBName");
    private final static QName _EncounterInfoGroupe_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Groupe");
    private final static QName _EncounterInfoCompetOrganizerName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "CompetOrganizerName");
    private final static QName _EncounterInfoIdCompany_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdCompany");
    private final static QName _EncounterInfoTpSynchroVideoMT4_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "TpSynchroVideoMT4");
    private final static QName _EncounterInfoScoreTeamB_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Score_TeamB");
    private final static QName _EncounterInfoDuration1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Duration1");
    private final static QName _EncounterInfoDuration2_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Duration2");
    private final static QName _EncounterInfoDuration3_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Duration3");
    private final static QName _EncounterInfoIdSeason_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdSeason");
    private final static QName _EncounterInfoScoreTeamA_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Score_TeamA");
    private final static QName _EncounterInfoCompetitionName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "CompetitionName");
    private final static QName _EncounterInfoIdTour_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdTour");
    private final static QName _GetExtracterRankingResponseGetExtracterRankingResult_QNAME = new QName("http://tempuri.org/", "GetExtracterRankingResult");
    private final static QName _GetActorPhotoResponseGetActorPhotoResult_QNAME = new QName("http://tempuri.org/", "GetActorPhotoResult");
    private final static QName _GetProfessionsResponseGetProfessionsResult_QNAME = new QName("http://tempuri.org/", "GetProfessionsResult");
    private final static QName _PitchInfoPitchName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "PitchName");
    private final static QName _PitchInfoCityName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "CityName");
    private final static QName _GetStatValueActorResponseGetStatValueActorResult_QNAME = new QName("http://tempuri.org/", "GetStatValueActorResult");
    private final static QName _PlayerInfoClubUsualAbbrev_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ClubUsualAbbrev");
    private final static QName _PlayerInfoIdClient_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdClient");
    private final static QName _PlayerInfoIdShirt_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdShirt");
    private final static QName _PlayerInfoUsualName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "UsualName");
    private final static QName _PlayerInfoClubOfficialName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ClubOfficialName");
    private final static QName _PlayerInfoBirthDay_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "BirthDay");
    private final static QName _PlayerInfoIdSex_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdSex");
    private final static QName _PlayerInfoHeigth_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Heigth");
    private final static QName _PlayerInfoFirstName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "FirstName");
    private final static QName _PlayerInfoIdCountry_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdCountry");
    private final static QName _PlayerInfoIdentifier_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Identifier");
    private final static QName _PlayerInfoSecondName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "SecondName");
    private final static QName _PlayerInfoIdProfession_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdProfession");
    private final static QName _PlayerInfoIdUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdUnit");
    private final static QName _PlayerInfoLoan_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Loan");
    private final static QName _PlayerInfoClubOfficialAbbrev_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ClubOfficialAbbrev");
    private final static QName _PlayerInfoEndDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "EndDate");
    private final static QName _PlayerInfoWeight_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Weight");
    private final static QName _PlayerInfoClubUsualName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ClubUsualName");
    private final static QName _GetStatValueTeamIdEncounters_QNAME = new QName("http://tempuri.org/", "IdEncounters");
    private final static QName _GetStatValueTeamIdStats_QNAME = new QName("http://tempuri.org/", "IdStats");
    private final static QName _GetStatValueTeamIdTeams_QNAME = new QName("http://tempuri.org/", "IdTeams");
    private final static QName _GetUnitsResponseGetUnitsResult_QNAME = new QName("http://tempuri.org/", "GetUnitsResult");
    private final static QName _GetTeamIdTeams_QNAME = new QName("http://tempuri.org/", "idTeams");
    private final static QName _GetExtracterHistoricResponseGetExtracterHistoricResult_QNAME = new QName("http://tempuri.org/", "GetExtracterHistoricResult");
    private final static QName _GetSeasonIdSeasons_QNAME = new QName("http://tempuri.org/", "idSeasons");
    private final static QName _ServiceVersionResponseServiceVersionResult_QNAME = new QName("http://tempuri.org/", "ServiceVersionResult");
    private final static QName _PhotoInfoPhoto_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Photo");
    private final static QName _PhotoInfoName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Name");
    private final static QName _GetTextsIdTextCategory_QNAME = new QName("http://tempuri.org/", "IdTextCategory");
    private final static QName _GetTextsIdTexts_QNAME = new QName("http://tempuri.org/", "IdTexts");
    private final static QName _GetEncountersResponseGetEncountersResult_QNAME = new QName("http://tempuri.org/", "GetEncountersResult");
    private final static QName _GetPitchResponseGetPitchResult_QNAME = new QName("http://tempuri.org/", "GetPitchResult");
    private final static QName _GetStatCategsResponseGetStatCategsResult_QNAME = new QName("http://tempuri.org/", "GetStatCategsResult");
    private final static QName _GetTextCategoriesResponseGetTextCategoriesResult_QNAME = new QName("http://tempuri.org/", "GetTextCategoriesResult");
    private final static QName _GetStatSeasonValueTeamIdSeasons_QNAME = new QName("http://tempuri.org/", "IdSeasons");
    private final static QName _CustomTeamClubWebSiteUrl_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ClubWebSiteUrl");
    private final static QName _CustomTeamAbbrevClubName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "AbbrevClubName");
    private final static QName _CustomTeamTeamMediaName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "TeamMediaName");
    private final static QName _CustomTeamCode5_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Code5");
    private final static QName _CustomTeamClubName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ClubName");
    private final static QName _CustomTeamIdStadium_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdStadium");
    private final static QName _CustomTeamStrIdCompets_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "StrIdCompets");
    private final static QName _CustomTeamClubStadiumName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ClubStadiumName");
    private final static QName _CustomTeamClubMediaName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ClubMediaName");
    private final static QName _GetSeasonTeamsLogosResponseGetSeasonTeamsLogosResult_QNAME = new QName("http://tempuri.org/", "GetSeasonTeamsLogosResult");
    private final static QName _GetActorIdActor_QNAME = new QName("http://tempuri.org/", "idActor");
    private final static QName _StatSeasonValueInfoValue_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Value");
    private final static QName _GetEncounterActorsResponseGetEncounterActorsResult_QNAME = new QName("http://tempuri.org/", "GetEncounterActorsResult");
    private final static QName _GetPitchIdPitchs_QNAME = new QName("http://tempuri.org/", "idPitchs");
    private final static QName _GetTeamActorsResponseGetTeamActorsResult_QNAME = new QName("http://tempuri.org/", "GetTeamActorsResult");
    private final static QName _GetSeasonResponseGetSeasonResult_QNAME = new QName("http://tempuri.org/", "GetSeasonResult");
    private final static QName _StatValueInfoIdPeriod_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdPeriod");
    private final static QName _StatValueInfoEndTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "EndTime");
    private final static QName _StatValueInfoStartTime_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "StartTime");
    private final static QName _StatValueInfoZoneX1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ZoneX1");
    private final static QName _StatValueInfoZoneZ1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ZoneZ1");
    private final static QName _StatValueInfoZoneX2_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ZoneX2");
    private final static QName _StatValueInfoZoneZ2_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ZoneZ2");
    private final static QName _StatValueInfoZoneY2_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ZoneY2");
    private final static QName _StatValueInfoZoneY1_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "ZoneY1");
    private final static QName _GetCompetitionSeasonsResponseGetCompetitionSeasonsResult_QNAME = new QName("http://tempuri.org/", "GetCompetitionSeasonsResult");
    private final static QName _GetStatSeasonActorResponseGetStatSeasonActorResult_QNAME = new QName("http://tempuri.org/", "GetStatSeasonActorResult");
    private final static QName _GetTextsResponseGetTextsResult_QNAME = new QName("http://tempuri.org/", "GetTextsResult");
    private final static QName _StatEncounterInfoNbActions_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "NbActions");
    private final static QName _GetStatSeasonActorIdActors_QNAME = new QName("http://tempuri.org/", "IdActors");
    private final static QName _GetCompetitionIdCompetitions_QNAME = new QName("http://tempuri.org/", "idCompetitions");
    private final static QName _StatSubCategInfoStatSubCategName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "StatSubCategName");
    private final static QName _StatActorEncounterInfoPeriod3Complete_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Period3Complete");
    private final static QName _StatActorEncounterInfoPrecentPlayed_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "PrecentPlayed");
    private final static QName _StatActorEncounterInfoPeriod4Complete_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Period4Complete");
    private final static QName _StatActorEncounterInfoTimePlayed_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "TimePlayed");
    private final static QName _ProfessionInfoProfession_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Profession");
    private final static QName _GetStatValueActorTrendResponseGetStatValueActorTrendResult_QNAME = new QName("http://tempuri.org/", "GetStatValueActorTrendResult");
    private final static QName _GetStatValueTeamResponseGetStatValueTeamResult_QNAME = new QName("http://tempuri.org/", "GetStatValueTeamResult");
    private final static QName _TextCategoryInfoCategory_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Category");
    private final static QName _GetTeamPlayersPhotosResponseGetTeamPlayersPhotosResult_QNAME = new QName("http://tempuri.org/", "GetTeamPlayersPhotosResult");
    private final static QName _CompetitionInfoIdOrganizer_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdOrganizer");
    private final static QName _StatCategInfoCategName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "CategName");
    private final static QName _GetStatSeasonValueTeamResponseGetStatSeasonValueTeamResult_QNAME = new QName("http://tempuri.org/", "GetStatSeasonValueTeamResult");
    private final static QName _TextInfoText_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Text");
    private final static QName _GetCompetitionResponseGetCompetitionResult_QNAME = new QName("http://tempuri.org/", "GetCompetitionResult");
    private final static QName _StatInfoIdStatCateg_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "IdStatCateg");
    private final static QName _StatInfoStatName_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "StatName");
    private final static QName _GetEncountersByIdClientsResponseGetEncountersByIdClientsResult_QNAME = new QName("http://tempuri.org/", "GetEncountersByIdClientsResult");
    private final static QName _GetTeamLogoResponseGetTeamLogoResult_QNAME = new QName("http://tempuri.org/", "GetTeamLogoResult");
    private final static QName _GetStatSeasonValueActorResponseGetStatSeasonValueActorResult_QNAME = new QName("http://tempuri.org/", "GetStatSeasonValueActorResult");
    private final static QName _GetStatValueActorEncounterResponseGetStatValueActorEncounterResult_QNAME = new QName("http://tempuri.org/", "GetStatValueActorEncounterResult");
    private final static QName _GetEncountersByCompetNameResponseGetEncountersByCompetNameResult_QNAME = new QName("http://tempuri.org/", "GetEncountersByCompetNameResult");
    private final static QName _GetActorResponseGetActorResult_QNAME = new QName("http://tempuri.org/", "GetActorResult");
    private final static QName _GetStatValueEncounterResponseGetStatValueEncounterResult_QNAME = new QName("http://tempuri.org/", "GetStatValueEncounterResult");
    private final static QName _GetEncountersIdRencontres_QNAME = new QName("http://tempuri.org/", "IdRencontres");
    private final static QName _GetEncountersDay_QNAME = new QName("http://tempuri.org/", "Day");
    private final static QName _GetEncountersIdSaison_QNAME = new QName("http://tempuri.org/", "IdSaison");
    private final static QName _GetEncountersByCompetNameCompetitionName_QNAME = new QName("http://tempuri.org/", "CompetitionName");
    private final static QName _GetEncountersByCompetNameSeasonEndYear_QNAME = new QName("http://tempuri.org/", "SeasonEndYear");
    private final static QName _GetEncountersByCompetNameSeasonStartYear_QNAME = new QName("http://tempuri.org/", "SeasonStartYear");
    private final static QName _GetStatsResponseGetStatsResult_QNAME = new QName("http://tempuri.org/", "GetStatsResult");
    private final static QName _GetTeamResponseGetTeamResult_QNAME = new QName("http://tempuri.org/", "GetTeamResult");
    private final static QName _UnitInfoUnit_QNAME = new QName("http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", "Unit");
    private final static QName _GetStatSubCategsResponseGetStatSubCategsResult_QNAME = new QName("http://tempuri.org/", "GetStatSubCategsResult");
    private final static QName _GetMatchEventsResponseGetMatchEventsResult_QNAME = new QName("http://tempuri.org/", "GetMatchEventsResult");
    private final static QName _GetSeasonPlayersPhotosResponseGetSeasonPlayersPhotosResult_QNAME = new QName("http://tempuri.org/", "GetSeasonPlayersPhotosResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: awdl.history
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStatValueActorEncounter }
     * 
     */
    public GetStatValueActorEncounter createGetStatValueActorEncounter() {
        return new GetStatValueActorEncounter();
    }

    /**
     * Create an instance of {@link ArrayOfint }
     * 
     */
    public ArrayOfint createArrayOfint() {
        return new ArrayOfint();
    }

    /**
     * Create an instance of {@link GetStatSeasonActor }
     * 
     */
    public GetStatSeasonActor createGetStatSeasonActor() {
        return new GetStatSeasonActor();
    }

    /**
     * Create an instance of {@link GetTeamResponse }
     * 
     */
    public GetTeamResponse createGetTeamResponse() {
        return new GetTeamResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCustomTeam }
     * 
     */
    public ArrayOfCustomTeam createArrayOfCustomTeam() {
        return new ArrayOfCustomTeam();
    }

    /**
     * Create an instance of {@link GetStatValueActorTrend }
     * 
     */
    public GetStatValueActorTrend createGetStatValueActorTrend() {
        return new GetStatValueActorTrend();
    }

    /**
     * Create an instance of {@link GetProfessionsResponse }
     * 
     */
    public GetProfessionsResponse createGetProfessionsResponse() {
        return new GetProfessionsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProfessionInfo }
     * 
     */
    public ArrayOfProfessionInfo createArrayOfProfessionInfo() {
        return new ArrayOfProfessionInfo();
    }

    /**
     * Create an instance of {@link GetStatValueActor }
     * 
     */
    public GetStatValueActor createGetStatValueActor() {
        return new GetStatValueActor();
    }

    /**
     * Create an instance of {@link GetSeason }
     * 
     */
    public GetSeason createGetSeason() {
        return new GetSeason();
    }

    /**
     * Create an instance of {@link GetStatsResponse }
     * 
     */
    public GetStatsResponse createGetStatsResponse() {
        return new GetStatsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStatInfo }
     * 
     */
    public ArrayOfStatInfo createArrayOfStatInfo() {
        return new ArrayOfStatInfo();
    }

    /**
     * Create an instance of {@link GetEncounters }
     * 
     */
    public GetEncounters createGetEncounters() {
        return new GetEncounters();
    }

    /**
     * Create an instance of {@link GetExtracterRankingResponse }
     * 
     */
    public GetExtracterRankingResponse createGetExtracterRankingResponse() {
        return new GetExtracterRankingResponse();
    }

    /**
     * Create an instance of {@link GetStats }
     * 
     */
    public GetStats createGetStats() {
        return new GetStats();
    }

    /**
     * Create an instance of {@link GetStatSeasonValueTeamResponse }
     * 
     */
    public GetStatSeasonValueTeamResponse createGetStatSeasonValueTeamResponse() {
        return new GetStatSeasonValueTeamResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStatSeasonValueInfo }
     * 
     */
    public ArrayOfStatSeasonValueInfo createArrayOfStatSeasonValueInfo() {
        return new ArrayOfStatSeasonValueInfo();
    }

    /**
     * Create an instance of {@link GetCompetitionResponse }
     * 
     */
    public GetCompetitionResponse createGetCompetitionResponse() {
        return new GetCompetitionResponse();
    }

    /**
     * Create an instance of {@link ArrayOfCompetitionInfo }
     * 
     */
    public ArrayOfCompetitionInfo createArrayOfCompetitionInfo() {
        return new ArrayOfCompetitionInfo();
    }

    /**
     * Create an instance of {@link GetTeamLogoResponse }
     * 
     */
    public GetTeamLogoResponse createGetTeamLogoResponse() {
        return new GetTeamLogoResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPhotoInfo }
     * 
     */
    public ArrayOfPhotoInfo createArrayOfPhotoInfo() {
        return new ArrayOfPhotoInfo();
    }

    /**
     * Create an instance of {@link GetActorPhotoResponse }
     * 
     */
    public GetActorPhotoResponse createGetActorPhotoResponse() {
        return new GetActorPhotoResponse();
    }

    /**
     * Create an instance of {@link ServiceVersionResponse }
     * 
     */
    public ServiceVersionResponse createServiceVersionResponse() {
        return new ServiceVersionResponse();
    }

    /**
     * Create an instance of {@link GetUnits }
     * 
     */
    public GetUnits createGetUnits() {
        return new GetUnits();
    }

    /**
     * Create an instance of {@link GetEncounterActors }
     * 
     */
    public GetEncounterActors createGetEncounterActors() {
        return new GetEncounterActors();
    }

    /**
     * Create an instance of {@link GetStatSeasonActorResponse }
     * 
     */
    public GetStatSeasonActorResponse createGetStatSeasonActorResponse() {
        return new GetStatSeasonActorResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStatSeasonActorInfo }
     * 
     */
    public ArrayOfStatSeasonActorInfo createArrayOfStatSeasonActorInfo() {
        return new ArrayOfStatSeasonActorInfo();
    }

    /**
     * Create an instance of {@link GetProfessions }
     * 
     */
    public GetProfessions createGetProfessions() {
        return new GetProfessions();
    }

    /**
     * Create an instance of {@link GetTextCategories }
     * 
     */
    public GetTextCategories createGetTextCategories() {
        return new GetTextCategories();
    }

    /**
     * Create an instance of {@link GetEncountersByCompetNameResponse }
     * 
     */
    public GetEncountersByCompetNameResponse createGetEncountersByCompetNameResponse() {
        return new GetEncountersByCompetNameResponse();
    }

    /**
     * Create an instance of {@link ArrayOfEncounterInfo }
     * 
     */
    public ArrayOfEncounterInfo createArrayOfEncounterInfo() {
        return new ArrayOfEncounterInfo();
    }

    /**
     * Create an instance of {@link GetEncountersByIdClientsResponse }
     * 
     */
    public GetEncountersByIdClientsResponse createGetEncountersByIdClientsResponse() {
        return new GetEncountersByIdClientsResponse();
    }

    /**
     * Create an instance of {@link EncounterInfo }
     * 
     */
    public EncounterInfo createEncounterInfo() {
        return new EncounterInfo();
    }

    /**
     * Create an instance of {@link GetExtracterRanking }
     * 
     */
    public GetExtracterRanking createGetExtracterRanking() {
        return new GetExtracterRanking();
    }

    /**
     * Create an instance of {@link GetCompetitionSeasonsResponse }
     * 
     */
    public GetCompetitionSeasonsResponse createGetCompetitionSeasonsResponse() {
        return new GetCompetitionSeasonsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSeasonInfo }
     * 
     */
    public ArrayOfSeasonInfo createArrayOfSeasonInfo() {
        return new ArrayOfSeasonInfo();
    }

    /**
     * Create an instance of {@link GetEncountersResponse }
     * 
     */
    public GetEncountersResponse createGetEncountersResponse() {
        return new GetEncountersResponse();
    }

    /**
     * Create an instance of {@link GetSeasonPlayersPhotos }
     * 
     */
    public GetSeasonPlayersPhotos createGetSeasonPlayersPhotos() {
        return new GetSeasonPlayersPhotos();
    }

    /**
     * Create an instance of {@link GetSeasonTeamsLogosResponse }
     * 
     */
    public GetSeasonTeamsLogosResponse createGetSeasonTeamsLogosResponse() {
        return new GetSeasonTeamsLogosResponse();
    }

    /**
     * Create an instance of {@link GetUnitsResponse }
     * 
     */
    public GetUnitsResponse createGetUnitsResponse() {
        return new GetUnitsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfUnitInfo }
     * 
     */
    public ArrayOfUnitInfo createArrayOfUnitInfo() {
        return new ArrayOfUnitInfo();
    }

    /**
     * Create an instance of {@link GetActor }
     * 
     */
    public GetActor createGetActor() {
        return new GetActor();
    }

    /**
     * Create an instance of {@link GetStatSubCategsResponse }
     * 
     */
    public GetStatSubCategsResponse createGetStatSubCategsResponse() {
        return new GetStatSubCategsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStatSubCategInfo }
     * 
     */
    public ArrayOfStatSubCategInfo createArrayOfStatSubCategInfo() {
        return new ArrayOfStatSubCategInfo();
    }

    /**
     * Create an instance of {@link GetTeam }
     * 
     */
    public GetTeam createGetTeam() {
        return new GetTeam();
    }

    /**
     * Create an instance of {@link GetEncountersByIdClients }
     * 
     */
    public GetEncountersByIdClients createGetEncountersByIdClients() {
        return new GetEncountersByIdClients();
    }

    /**
     * Create an instance of {@link GetExtracterHistoricResponse }
     * 
     */
    public GetExtracterHistoricResponse createGetExtracterHistoricResponse() {
        return new GetExtracterHistoricResponse();
    }

    /**
     * Create an instance of {@link GetTeamPlayersPhotos }
     * 
     */
    public GetTeamPlayersPhotos createGetTeamPlayersPhotos() {
        return new GetTeamPlayersPhotos();
    }

    /**
     * Create an instance of {@link GetPitchResponse }
     * 
     */
    public GetPitchResponse createGetPitchResponse() {
        return new GetPitchResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPitchInfo }
     * 
     */
    public ArrayOfPitchInfo createArrayOfPitchInfo() {
        return new ArrayOfPitchInfo();
    }

    /**
     * Create an instance of {@link IsReady }
     * 
     */
    public IsReady createIsReady() {
        return new IsReady();
    }

    /**
     * Create an instance of {@link GetActorResponse }
     * 
     */
    public GetActorResponse createGetActorResponse() {
        return new GetActorResponse();
    }

    /**
     * Create an instance of {@link ArrayOfPlayerInfo }
     * 
     */
    public ArrayOfPlayerInfo createArrayOfPlayerInfo() {
        return new ArrayOfPlayerInfo();
    }

    /**
     * Create an instance of {@link GetStatSeasonValueActorResponse }
     * 
     */
    public GetStatSeasonValueActorResponse createGetStatSeasonValueActorResponse() {
        return new GetStatSeasonValueActorResponse();
    }

    /**
     * Create an instance of {@link GetStatValueTeam }
     * 
     */
    public GetStatValueTeam createGetStatValueTeam() {
        return new GetStatValueTeam();
    }

    /**
     * Create an instance of {@link GetEncountersByCompetName }
     * 
     */
    public GetEncountersByCompetName createGetEncountersByCompetName() {
        return new GetEncountersByCompetName();
    }

    /**
     * Create an instance of {@link GetSeasonPlayersPhotosResponse }
     * 
     */
    public GetSeasonPlayersPhotosResponse createGetSeasonPlayersPhotosResponse() {
        return new GetSeasonPlayersPhotosResponse();
    }

    /**
     * Create an instance of {@link GetStatValueEncounterResponse }
     * 
     */
    public GetStatValueEncounterResponse createGetStatValueEncounterResponse() {
        return new GetStatValueEncounterResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStatEncounterInfo }
     * 
     */
    public ArrayOfStatEncounterInfo createArrayOfStatEncounterInfo() {
        return new ArrayOfStatEncounterInfo();
    }

    /**
     * Create an instance of {@link GetMatchEvents }
     * 
     */
    public GetMatchEvents createGetMatchEvents() {
        return new GetMatchEvents();
    }

    /**
     * Create an instance of {@link GetStatSeasonValueActor }
     * 
     */
    public GetStatSeasonValueActor createGetStatSeasonValueActor() {
        return new GetStatSeasonValueActor();
    }

    /**
     * Create an instance of {@link GetTeamLogo }
     * 
     */
    public GetTeamLogo createGetTeamLogo() {
        return new GetTeamLogo();
    }

    /**
     * Create an instance of {@link GetExtracterHistoric }
     * 
     */
    public GetExtracterHistoric createGetExtracterHistoric() {
        return new GetExtracterHistoric();
    }

    /**
     * Create an instance of {@link GetActorPhoto }
     * 
     */
    public GetActorPhoto createGetActorPhoto() {
        return new GetActorPhoto();
    }

    /**
     * Create an instance of {@link GetMatchEventsResponse }
     * 
     */
    public GetMatchEventsResponse createGetMatchEventsResponse() {
        return new GetMatchEventsResponse();
    }

    /**
     * Create an instance of {@link GetStatValueTeamResponse }
     * 
     */
    public GetStatValueTeamResponse createGetStatValueTeamResponse() {
        return new GetStatValueTeamResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStatValueInfo }
     * 
     */
    public ArrayOfStatValueInfo createArrayOfStatValueInfo() {
        return new ArrayOfStatValueInfo();
    }

    /**
     * Create an instance of {@link GetStatValueActorResponse }
     * 
     */
    public GetStatValueActorResponse createGetStatValueActorResponse() {
        return new GetStatValueActorResponse();
    }

    /**
     * Create an instance of {@link GetStatCategsResponse }
     * 
     */
    public GetStatCategsResponse createGetStatCategsResponse() {
        return new GetStatCategsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStatCategInfo }
     * 
     */
    public ArrayOfStatCategInfo createArrayOfStatCategInfo() {
        return new ArrayOfStatCategInfo();
    }

    /**
     * Create an instance of {@link GetCompetition }
     * 
     */
    public GetCompetition createGetCompetition() {
        return new GetCompetition();
    }

    /**
     * Create an instance of {@link GetStatSubCategs }
     * 
     */
    public GetStatSubCategs createGetStatSubCategs() {
        return new GetStatSubCategs();
    }

    /**
     * Create an instance of {@link GetTeamActors }
     * 
     */
    public GetTeamActors createGetTeamActors() {
        return new GetTeamActors();
    }

    /**
     * Create an instance of {@link GetTexts }
     * 
     */
    public GetTexts createGetTexts() {
        return new GetTexts();
    }

    /**
     * Create an instance of {@link IsReadyResponse }
     * 
     */
    public IsReadyResponse createIsReadyResponse() {
        return new IsReadyResponse();
    }

    /**
     * Create an instance of {@link GetStatValueEncounter }
     * 
     */
    public GetStatValueEncounter createGetStatValueEncounter() {
        return new GetStatValueEncounter();
    }

    /**
     * Create an instance of {@link GetPitch }
     * 
     */
    public GetPitch createGetPitch() {
        return new GetPitch();
    }

    /**
     * Create an instance of {@link GetStatCategs }
     * 
     */
    public GetStatCategs createGetStatCategs() {
        return new GetStatCategs();
    }

    /**
     * Create an instance of {@link GetTextsResponse }
     * 
     */
    public GetTextsResponse createGetTextsResponse() {
        return new GetTextsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTextInfo }
     * 
     */
    public ArrayOfTextInfo createArrayOfTextInfo() {
        return new ArrayOfTextInfo();
    }

    /**
     * Create an instance of {@link GetStatSeasonValueTeam }
     * 
     */
    public GetStatSeasonValueTeam createGetStatSeasonValueTeam() {
        return new GetStatSeasonValueTeam();
    }

    /**
     * Create an instance of {@link ServiceVersion }
     * 
     */
    public ServiceVersion createServiceVersion() {
        return new ServiceVersion();
    }

    /**
     * Create an instance of {@link GetSeasonTeamsLogos }
     * 
     */
    public GetSeasonTeamsLogos createGetSeasonTeamsLogos() {
        return new GetSeasonTeamsLogos();
    }

    /**
     * Create an instance of {@link GetTeamPlayersPhotosResponse }
     * 
     */
    public GetTeamPlayersPhotosResponse createGetTeamPlayersPhotosResponse() {
        return new GetTeamPlayersPhotosResponse();
    }

    /**
     * Create an instance of {@link GetSeasonResponse }
     * 
     */
    public GetSeasonResponse createGetSeasonResponse() {
        return new GetSeasonResponse();
    }

    /**
     * Create an instance of {@link GetTeamActorsResponse }
     * 
     */
    public GetTeamActorsResponse createGetTeamActorsResponse() {
        return new GetTeamActorsResponse();
    }

    /**
     * Create an instance of {@link GetStatValueActorEncounterResponse }
     * 
     */
    public GetStatValueActorEncounterResponse createGetStatValueActorEncounterResponse() {
        return new GetStatValueActorEncounterResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStatActorEncounterInfo }
     * 
     */
    public ArrayOfStatActorEncounterInfo createArrayOfStatActorEncounterInfo() {
        return new ArrayOfStatActorEncounterInfo();
    }

    /**
     * Create an instance of {@link GetCompetitionSeasons }
     * 
     */
    public GetCompetitionSeasons createGetCompetitionSeasons() {
        return new GetCompetitionSeasons();
    }

    /**
     * Create an instance of {@link GetEncounterActorsResponse }
     * 
     */
    public GetEncounterActorsResponse createGetEncounterActorsResponse() {
        return new GetEncounterActorsResponse();
    }

    /**
     * Create an instance of {@link GetTextCategoriesResponse }
     * 
     */
    public GetTextCategoriesResponse createGetTextCategoriesResponse() {
        return new GetTextCategoriesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfTextCategoryInfo }
     * 
     */
    public ArrayOfTextCategoryInfo createArrayOfTextCategoryInfo() {
        return new ArrayOfTextCategoryInfo();
    }

    /**
     * Create an instance of {@link GetStatValueActorTrendResponse }
     * 
     */
    public GetStatValueActorTrendResponse createGetStatValueActorTrendResponse() {
        return new GetStatValueActorTrendResponse();
    }

    /**
     * Create an instance of {@link ArrayOfStatActorTrendInfo }
     * 
     */
    public ArrayOfStatActorTrendInfo createArrayOfStatActorTrendInfo() {
        return new ArrayOfStatActorTrendInfo();
    }

    /**
     * Create an instance of {@link UnitInfo }
     * 
     */
    public UnitInfo createUnitInfo() {
        return new UnitInfo();
    }

    /**
     * Create an instance of {@link TextInfo }
     * 
     */
    public TextInfo createTextInfo() {
        return new TextInfo();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfStatActorTrendInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfStatActorTrendInfo3Pw8U1P1 createBaseStructInfoOfStatActorTrendInfo3Pw8U1P1() {
        return new BaseStructInfoOfStatActorTrendInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfPhotoInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfPhotoInfo3Pw8U1P1 createBaseStructInfoOfPhotoInfo3Pw8U1P1() {
        return new BaseStructInfoOfPhotoInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link CustomTeam }
     * 
     */
    public CustomTeam createCustomTeam() {
        return new CustomTeam();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfProfessionInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfProfessionInfo3Pw8U1P1 createBaseStructInfoOfProfessionInfo3Pw8U1P1() {
        return new BaseStructInfoOfProfessionInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfTextInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfTextInfo3Pw8U1P1 createBaseStructInfoOfTextInfo3Pw8U1P1() {
        return new BaseStructInfoOfTextInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfStatCategInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfStatCategInfo3Pw8U1P1 createBaseStructInfoOfStatCategInfo3Pw8U1P1() {
        return new BaseStructInfoOfStatCategInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfPlayerInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfPlayerInfo3Pw8U1P1 createBaseStructInfoOfPlayerInfo3Pw8U1P1() {
        return new BaseStructInfoOfPlayerInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link StatSubCategInfo }
     * 
     */
    public StatSubCategInfo createStatSubCategInfo() {
        return new StatSubCategInfo();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfUnitInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfUnitInfo3Pw8U1P1 createBaseStructInfoOfUnitInfo3Pw8U1P1() {
        return new BaseStructInfoOfUnitInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfStatSubCategInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfStatSubCategInfo3Pw8U1P1 createBaseStructInfoOfStatSubCategInfo3Pw8U1P1() {
        return new BaseStructInfoOfStatSubCategInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link ProfessionInfo }
     * 
     */
    public ProfessionInfo createProfessionInfo() {
        return new ProfessionInfo();
    }

    /**
     * Create an instance of {@link StatInfo }
     * 
     */
    public StatInfo createStatInfo() {
        return new StatInfo();
    }

    /**
     * Create an instance of {@link StatEncounterInfo }
     * 
     */
    public StatEncounterInfo createStatEncounterInfo() {
        return new StatEncounterInfo();
    }

    /**
     * Create an instance of {@link StatActorEncounterInfo }
     * 
     */
    public StatActorEncounterInfo createStatActorEncounterInfo() {
        return new StatActorEncounterInfo();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfPitchInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfPitchInfo3Pw8U1P1 createBaseStructInfoOfPitchInfo3Pw8U1P1() {
        return new BaseStructInfoOfPitchInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfStatActorEncounterInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfStatActorEncounterInfo3Pw8U1P1 createBaseStructInfoOfStatActorEncounterInfo3Pw8U1P1() {
        return new BaseStructInfoOfStatActorEncounterInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link PlayerInfo }
     * 
     */
    public PlayerInfo createPlayerInfo() {
        return new PlayerInfo();
    }

    /**
     * Create an instance of {@link PhotoInfo }
     * 
     */
    public PhotoInfo createPhotoInfo() {
        return new PhotoInfo();
    }

    /**
     * Create an instance of {@link StatValueInfo }
     * 
     */
    public StatValueInfo createStatValueInfo() {
        return new StatValueInfo();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfStatSeasonValueInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfStatSeasonValueInfo3Pw8U1P1 createBaseStructInfoOfStatSeasonValueInfo3Pw8U1P1() {
        return new BaseStructInfoOfStatSeasonValueInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfStatValueInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfStatValueInfo3Pw8U1P1 createBaseStructInfoOfStatValueInfo3Pw8U1P1() {
        return new BaseStructInfoOfStatValueInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link CompetitionInfo }
     * 
     */
    public CompetitionInfo createCompetitionInfo() {
        return new CompetitionInfo();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfEncounterInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfEncounterInfo3Pw8U1P1 createBaseStructInfoOfEncounterInfo3Pw8U1P1() {
        return new BaseStructInfoOfEncounterInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link SeasonInfo }
     * 
     */
    public SeasonInfo createSeasonInfo() {
        return new SeasonInfo();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfCompetitionInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfCompetitionInfo3Pw8U1P1 createBaseStructInfoOfCompetitionInfo3Pw8U1P1() {
        return new BaseStructInfoOfCompetitionInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfStatEncounterInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfStatEncounterInfo3Pw8U1P1 createBaseStructInfoOfStatEncounterInfo3Pw8U1P1() {
        return new BaseStructInfoOfStatEncounterInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfStatInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfStatInfo3Pw8U1P1 createBaseStructInfoOfStatInfo3Pw8U1P1() {
        return new BaseStructInfoOfStatInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link PitchInfo }
     * 
     */
    public PitchInfo createPitchInfo() {
        return new PitchInfo();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfTextCategoryInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfTextCategoryInfo3Pw8U1P1 createBaseStructInfoOfTextCategoryInfo3Pw8U1P1() {
        return new BaseStructInfoOfTextCategoryInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link StatCategInfo }
     * 
     */
    public StatCategInfo createStatCategInfo() {
        return new StatCategInfo();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfSeasonInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfSeasonInfo3Pw8U1P1 createBaseStructInfoOfSeasonInfo3Pw8U1P1() {
        return new BaseStructInfoOfSeasonInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link StatActorTrendInfo }
     * 
     */
    public StatActorTrendInfo createStatActorTrendInfo() {
        return new StatActorTrendInfo();
    }

    /**
     * Create an instance of {@link StatSeasonValueInfo }
     * 
     */
    public StatSeasonValueInfo createStatSeasonValueInfo() {
        return new StatSeasonValueInfo();
    }

    /**
     * Create an instance of {@link TextCategoryInfo }
     * 
     */
    public TextCategoryInfo createTextCategoryInfo() {
        return new TextCategoryInfo();
    }

    /**
     * Create an instance of {@link StatSeasonActorInfo }
     * 
     */
    public StatSeasonActorInfo createStatSeasonActorInfo() {
        return new StatSeasonActorInfo();
    }

    /**
     * Create an instance of {@link BaseStructInfoOfStatSeasonActorInfo3Pw8U1P1 }
     * 
     */
    public BaseStructInfoOfStatSeasonActorInfo3Pw8U1P1 createBaseStructInfoOfStatSeasonActorInfo3Pw8U1P1() {
        return new BaseStructInfoOfStatSeasonActorInfo3Pw8U1P1();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatCategInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "StatCategInfo")
    public JAXBElement<StatCategInfo> createStatCategInfo(StatCategInfo value) {
        return new JAXBElement<StatCategInfo>(_StatCategInfo_QNAME, StatCategInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PitchInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "PitchInfo")
    public JAXBElement<PitchInfo> createPitchInfo(PitchInfo value) {
        return new JAXBElement<PitchInfo>(_PitchInfo_QNAME, PitchInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfTextCategoryInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfTextCategoryInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfTextCategoryInfo3Pw8U1P1> createBaseStructInfoOfTextCategoryInfo3Pw8U1P1(BaseStructInfoOfTextCategoryInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfTextCategoryInfo3Pw8U1P1>(_BaseStructInfoOfTextCategoryInfo3Pw8U1P1_QNAME, BaseStructInfoOfTextCategoryInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatActorTrendInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfStatActorTrendInfo")
    public JAXBElement<ArrayOfStatActorTrendInfo> createArrayOfStatActorTrendInfo(ArrayOfStatActorTrendInfo value) {
        return new JAXBElement<ArrayOfStatActorTrendInfo>(_ArrayOfStatActorTrendInfo_QNAME, ArrayOfStatActorTrendInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfStatEncounterInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfStatEncounterInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfStatEncounterInfo3Pw8U1P1> createBaseStructInfoOfStatEncounterInfo3Pw8U1P1(BaseStructInfoOfStatEncounterInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfStatEncounterInfo3Pw8U1P1>(_BaseStructInfoOfStatEncounterInfo3Pw8U1P1_QNAME, BaseStructInfoOfStatEncounterInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfStatInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfStatInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfStatInfo3Pw8U1P1> createBaseStructInfoOfStatInfo3Pw8U1P1(BaseStructInfoOfStatInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfStatInfo3Pw8U1P1>(_BaseStructInfoOfStatInfo3Pw8U1P1_QNAME, BaseStructInfoOfStatInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatSeasonValueInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "StatSeasonValueInfo")
    public JAXBElement<StatSeasonValueInfo> createStatSeasonValueInfo(StatSeasonValueInfo value) {
        return new JAXBElement<StatSeasonValueInfo>(_StatSeasonValueInfo_QNAME, StatSeasonValueInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextCategoryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "TextCategoryInfo")
    public JAXBElement<TextCategoryInfo> createTextCategoryInfo(TextCategoryInfo value) {
        return new JAXBElement<TextCategoryInfo>(_TextCategoryInfo_QNAME, TextCategoryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatEncounterInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfStatEncounterInfo")
    public JAXBElement<ArrayOfStatEncounterInfo> createArrayOfStatEncounterInfo(ArrayOfStatEncounterInfo value) {
        return new JAXBElement<ArrayOfStatEncounterInfo>(_ArrayOfStatEncounterInfo_QNAME, ArrayOfStatEncounterInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncounterInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "EncounterInfo")
    public JAXBElement<EncounterInfo> createEncounterInfo(EncounterInfo value) {
        return new JAXBElement<EncounterInfo>(_EncounterInfo_QNAME, EncounterInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhotoInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfPhotoInfo")
    public JAXBElement<ArrayOfPhotoInfo> createArrayOfPhotoInfo(ArrayOfPhotoInfo value) {
        return new JAXBElement<ArrayOfPhotoInfo>(_ArrayOfPhotoInfo_QNAME, ArrayOfPhotoInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatSeasonActorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "StatSeasonActorInfo")
    public JAXBElement<StatSeasonActorInfo> createStatSeasonActorInfo(StatSeasonActorInfo value) {
        return new JAXBElement<StatSeasonActorInfo>(_StatSeasonActorInfo_QNAME, StatSeasonActorInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfStatSeasonActorInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfStatSeasonActorInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfStatSeasonActorInfo3Pw8U1P1> createBaseStructInfoOfStatSeasonActorInfo3Pw8U1P1(BaseStructInfoOfStatSeasonActorInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfStatSeasonActorInfo3Pw8U1P1>(_BaseStructInfoOfStatSeasonActorInfo3Pw8U1P1_QNAME, BaseStructInfoOfStatSeasonActorInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnitInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfUnitInfo")
    public JAXBElement<ArrayOfUnitInfo> createArrayOfUnitInfo(ArrayOfUnitInfo value) {
        return new JAXBElement<ArrayOfUnitInfo>(_ArrayOfUnitInfo_QNAME, ArrayOfUnitInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfSeasonInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfSeasonInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfSeasonInfo3Pw8U1P1> createBaseStructInfoOfSeasonInfo3Pw8U1P1(BaseStructInfoOfSeasonInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfSeasonInfo3Pw8U1P1>(_BaseStructInfoOfSeasonInfo3Pw8U1P1_QNAME, BaseStructInfoOfSeasonInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTextInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfTextInfo")
    public JAXBElement<ArrayOfTextInfo> createArrayOfTextInfo(ArrayOfTextInfo value) {
        return new JAXBElement<ArrayOfTextInfo>(_ArrayOfTextInfo_QNAME, ArrayOfTextInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatActorTrendInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "StatActorTrendInfo")
    public JAXBElement<StatActorTrendInfo> createStatActorTrendInfo(StatActorTrendInfo value) {
        return new JAXBElement<StatActorTrendInfo>(_StatActorTrendInfo_QNAME, StatActorTrendInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPitchInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfPitchInfo")
    public JAXBElement<ArrayOfPitchInfo> createArrayOfPitchInfo(ArrayOfPitchInfo value) {
        return new JAXBElement<ArrayOfPitchInfo>(_ArrayOfPitchInfo_QNAME, ArrayOfPitchInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompetitionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfCompetitionInfo")
    public JAXBElement<ArrayOfCompetitionInfo> createArrayOfCompetitionInfo(ArrayOfCompetitionInfo value) {
        return new JAXBElement<ArrayOfCompetitionInfo>(_ArrayOfCompetitionInfo_QNAME, ArrayOfCompetitionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomTeam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfCustomTeam")
    public JAXBElement<ArrayOfCustomTeam> createArrayOfCustomTeam(ArrayOfCustomTeam value) {
        return new JAXBElement<ArrayOfCustomTeam>(_ArrayOfCustomTeam_QNAME, ArrayOfCustomTeam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatValueInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "StatValueInfo")
    public JAXBElement<StatValueInfo> createStatValueInfo(StatValueInfo value) {
        return new JAXBElement<StatValueInfo>(_StatValueInfo_QNAME, StatValueInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfStatSeasonValueInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfStatSeasonValueInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfStatSeasonValueInfo3Pw8U1P1> createBaseStructInfoOfStatSeasonValueInfo3Pw8U1P1(BaseStructInfoOfStatSeasonValueInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfStatSeasonValueInfo3Pw8U1P1>(_BaseStructInfoOfStatSeasonValueInfo3Pw8U1P1_QNAME, BaseStructInfoOfStatSeasonValueInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatCategInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfStatCategInfo")
    public JAXBElement<ArrayOfStatCategInfo> createArrayOfStatCategInfo(ArrayOfStatCategInfo value) {
        return new JAXBElement<ArrayOfStatCategInfo>(_ArrayOfStatCategInfo_QNAME, ArrayOfStatCategInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PlayerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "PlayerInfo")
    public JAXBElement<PlayerInfo> createPlayerInfo(PlayerInfo value) {
        return new JAXBElement<PlayerInfo>(_PlayerInfo_QNAME, PlayerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPlayerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfPlayerInfo")
    public JAXBElement<ArrayOfPlayerInfo> createArrayOfPlayerInfo(ArrayOfPlayerInfo value) {
        return new JAXBElement<ArrayOfPlayerInfo>(_ArrayOfPlayerInfo_QNAME, ArrayOfPlayerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhotoInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "PhotoInfo")
    public JAXBElement<PhotoInfo> createPhotoInfo(PhotoInfo value) {
        return new JAXBElement<PhotoInfo>(_PhotoInfo_QNAME, PhotoInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatValueInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfStatValueInfo")
    public JAXBElement<ArrayOfStatValueInfo> createArrayOfStatValueInfo(ArrayOfStatValueInfo value) {
        return new JAXBElement<ArrayOfStatValueInfo>(_ArrayOfStatValueInfo_QNAME, ArrayOfStatValueInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "LanguageValue")
    public JAXBElement<List<String>> createLanguageValue(List<String> value) {
        return new JAXBElement<List<String>>(_LanguageValue_QNAME, ((Class) List.class), null, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeasonInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "SeasonInfo")
    public JAXBElement<SeasonInfo> createSeasonInfo(SeasonInfo value) {
        return new JAXBElement<SeasonInfo>(_SeasonInfo_QNAME, SeasonInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfint")
    public JAXBElement<ArrayOfint> createArrayOfint(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_ArrayOfint_QNAME, ArrayOfint.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfCompetitionInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfCompetitionInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfCompetitionInfo3Pw8U1P1> createBaseStructInfoOfCompetitionInfo3Pw8U1P1(BaseStructInfoOfCompetitionInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfCompetitionInfo3Pw8U1P1>(_BaseStructInfoOfCompetitionInfo3Pw8U1P1_QNAME, BaseStructInfoOfCompetitionInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfStatValueInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfStatValueInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfStatValueInfo3Pw8U1P1> createBaseStructInfoOfStatValueInfo3Pw8U1P1(BaseStructInfoOfStatValueInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfStatValueInfo3Pw8U1P1>(_BaseStructInfoOfStatValueInfo3Pw8U1P1_QNAME, BaseStructInfoOfStatValueInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfStatInfo")
    public JAXBElement<ArrayOfStatInfo> createArrayOfStatInfo(ArrayOfStatInfo value) {
        return new JAXBElement<ArrayOfStatInfo>(_ArrayOfStatInfo_QNAME, ArrayOfStatInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompetitionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "CompetitionInfo")
    public JAXBElement<CompetitionInfo> createCompetitionInfo(CompetitionInfo value) {
        return new JAXBElement<CompetitionInfo>(_CompetitionInfo_QNAME, CompetitionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfEncounterInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfEncounterInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfEncounterInfo3Pw8U1P1> createBaseStructInfoOfEncounterInfo3Pw8U1P1(BaseStructInfoOfEncounterInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfEncounterInfo3Pw8U1P1>(_BaseStructInfoOfEncounterInfo3Pw8U1P1_QNAME, BaseStructInfoOfEncounterInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfessionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ProfessionInfo")
    public JAXBElement<ProfessionInfo> createProfessionInfo(ProfessionInfo value) {
        return new JAXBElement<ProfessionInfo>(_ProfessionInfo_QNAME, ProfessionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfStatSubCategInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfStatSubCategInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfStatSubCategInfo3Pw8U1P1> createBaseStructInfoOfStatSubCategInfo3Pw8U1P1(BaseStructInfoOfStatSubCategInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfStatSubCategInfo3Pw8U1P1>(_BaseStructInfoOfStatSubCategInfo3Pw8U1P1_QNAME, BaseStructInfoOfStatSubCategInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfUnitInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfUnitInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfUnitInfo3Pw8U1P1> createBaseStructInfoOfUnitInfo3Pw8U1P1(BaseStructInfoOfUnitInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfUnitInfo3Pw8U1P1>(_BaseStructInfoOfUnitInfo3Pw8U1P1_QNAME, BaseStructInfoOfUnitInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatEncounterInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "StatEncounterInfo")
    public JAXBElement<StatEncounterInfo> createStatEncounterInfo(StatEncounterInfo value) {
        return new JAXBElement<StatEncounterInfo>(_StatEncounterInfo_QNAME, StatEncounterInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatActorEncounterInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "StatActorEncounterInfo")
    public JAXBElement<StatActorEncounterInfo> createStatActorEncounterInfo(StatActorEncounterInfo value) {
        return new JAXBElement<StatActorEncounterInfo>(_StatActorEncounterInfo_QNAME, StatActorEncounterInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProfessionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfProfessionInfo")
    public JAXBElement<ArrayOfProfessionInfo> createArrayOfProfessionInfo(ArrayOfProfessionInfo value) {
        return new JAXBElement<ArrayOfProfessionInfo>(_ArrayOfProfessionInfo_QNAME, ArrayOfProfessionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfPitchInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfPitchInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfPitchInfo3Pw8U1P1> createBaseStructInfoOfPitchInfo3Pw8U1P1(BaseStructInfoOfPitchInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfPitchInfo3Pw8U1P1>(_BaseStructInfoOfPitchInfo3Pw8U1P1_QNAME, BaseStructInfoOfPitchInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfStatActorEncounterInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfStatActorEncounterInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfStatActorEncounterInfo3Pw8U1P1> createBaseStructInfoOfStatActorEncounterInfo3Pw8U1P1(BaseStructInfoOfStatActorEncounterInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfStatActorEncounterInfo3Pw8U1P1>(_BaseStructInfoOfStatActorEncounterInfo3Pw8U1P1_QNAME, BaseStructInfoOfStatActorEncounterInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "StatInfo")
    public JAXBElement<StatInfo> createStatInfo(StatInfo value) {
        return new JAXBElement<StatInfo>(_StatInfo_QNAME, StatInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatSubCategInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfStatSubCategInfo")
    public JAXBElement<ArrayOfStatSubCategInfo> createArrayOfStatSubCategInfo(ArrayOfStatSubCategInfo value) {
        return new JAXBElement<ArrayOfStatSubCategInfo>(_ArrayOfStatSubCategInfo_QNAME, ArrayOfStatSubCategInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatSeasonActorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfStatSeasonActorInfo")
    public JAXBElement<ArrayOfStatSeasonActorInfo> createArrayOfStatSeasonActorInfo(ArrayOfStatSeasonActorInfo value) {
        return new JAXBElement<ArrayOfStatSeasonActorInfo>(_ArrayOfStatSeasonActorInfo_QNAME, ArrayOfStatSeasonActorInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfStatActorTrendInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfStatActorTrendInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfStatActorTrendInfo3Pw8U1P1> createBaseStructInfoOfStatActorTrendInfo3Pw8U1P1(BaseStructInfoOfStatActorTrendInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfStatActorTrendInfo3Pw8U1P1>(_BaseStructInfoOfStatActorTrendInfo3Pw8U1P1_QNAME, BaseStructInfoOfStatActorTrendInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfPhotoInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfPhotoInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfPhotoInfo3Pw8U1P1> createBaseStructInfoOfPhotoInfo3Pw8U1P1(BaseStructInfoOfPhotoInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfPhotoInfo3Pw8U1P1>(_BaseStructInfoOfPhotoInfo3Pw8U1P1_QNAME, BaseStructInfoOfPhotoInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomTeam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "CustomTeam")
    public JAXBElement<CustomTeam> createCustomTeam(CustomTeam value) {
        return new JAXBElement<CustomTeam>(_CustomTeam_QNAME, CustomTeam.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEncounterInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfEncounterInfo")
    public JAXBElement<ArrayOfEncounterInfo> createArrayOfEncounterInfo(ArrayOfEncounterInfo value) {
        return new JAXBElement<ArrayOfEncounterInfo>(_ArrayOfEncounterInfo_QNAME, ArrayOfEncounterInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeasonInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfSeasonInfo")
    public JAXBElement<ArrayOfSeasonInfo> createArrayOfSeasonInfo(ArrayOfSeasonInfo value) {
        return new JAXBElement<ArrayOfSeasonInfo>(_ArrayOfSeasonInfo_QNAME, ArrayOfSeasonInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTextCategoryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfTextCategoryInfo")
    public JAXBElement<ArrayOfTextCategoryInfo> createArrayOfTextCategoryInfo(ArrayOfTextCategoryInfo value) {
        return new JAXBElement<ArrayOfTextCategoryInfo>(_ArrayOfTextCategoryInfo_QNAME, ArrayOfTextCategoryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatActorEncounterInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfStatActorEncounterInfo")
    public JAXBElement<ArrayOfStatActorEncounterInfo> createArrayOfStatActorEncounterInfo(ArrayOfStatActorEncounterInfo value) {
        return new JAXBElement<ArrayOfStatActorEncounterInfo>(_ArrayOfStatActorEncounterInfo_QNAME, ArrayOfStatActorEncounterInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnitInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "UnitInfo")
    public JAXBElement<UnitInfo> createUnitInfo(UnitInfo value) {
        return new JAXBElement<UnitInfo>(_UnitInfo_QNAME, UnitInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TextInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "TextInfo")
    public JAXBElement<TextInfo> createTextInfo(TextInfo value) {
        return new JAXBElement<TextInfo>(_TextInfo_QNAME, TextInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfTextInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfTextInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfTextInfo3Pw8U1P1> createBaseStructInfoOfTextInfo3Pw8U1P1(BaseStructInfoOfTextInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfTextInfo3Pw8U1P1>(_BaseStructInfoOfTextInfo3Pw8U1P1_QNAME, BaseStructInfoOfTextInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfStatCategInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfStatCategInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfStatCategInfo3Pw8U1P1> createBaseStructInfoOfStatCategInfo3Pw8U1P1(BaseStructInfoOfStatCategInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfStatCategInfo3Pw8U1P1>(_BaseStructInfoOfStatCategInfo3Pw8U1P1_QNAME, BaseStructInfoOfStatCategInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StatSubCategInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "StatSubCategInfo")
    public JAXBElement<StatSubCategInfo> createStatSubCategInfo(StatSubCategInfo value) {
        return new JAXBElement<StatSubCategInfo>(_StatSubCategInfo_QNAME, StatSubCategInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfPlayerInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfPlayerInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfPlayerInfo3Pw8U1P1> createBaseStructInfoOfPlayerInfo3Pw8U1P1(BaseStructInfoOfPlayerInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfPlayerInfo3Pw8U1P1>(_BaseStructInfoOfPlayerInfo3Pw8U1P1_QNAME, BaseStructInfoOfPlayerInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseStructInfoOfProfessionInfo3Pw8U1P1 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BaseStructInfoOfProfessionInfo3pw8U1P1")
    public JAXBElement<BaseStructInfoOfProfessionInfo3Pw8U1P1> createBaseStructInfoOfProfessionInfo3Pw8U1P1(BaseStructInfoOfProfessionInfo3Pw8U1P1 value) {
        return new JAXBElement<BaseStructInfoOfProfessionInfo3Pw8U1P1>(_BaseStructInfoOfProfessionInfo3Pw8U1P1_QNAME, BaseStructInfoOfProfessionInfo3Pw8U1P1 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "MatchState")
    public JAXBElement<MatchState> createMatchState(MatchState value) {
        return new JAXBElement<MatchState>(_MatchState_QNAME, MatchState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatSeasonValueInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ArrayOfStatSeasonValueInfo")
    public JAXBElement<ArrayOfStatSeasonValueInfo> createArrayOfStatSeasonValueInfo(ArrayOfStatSeasonValueInfo value) {
        return new JAXBElement<ArrayOfStatSeasonValueInfo>(_ArrayOfStatSeasonValueInfo_QNAME, ArrayOfStatSeasonValueInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdStatCategs", scope = GetStatSubCategs.class)
    public JAXBElement<ArrayOfint> createGetStatSubCategsIdStatCategs(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatSubCategsIdStatCategs_QNAME, ArrayOfint.class, GetStatSubCategs.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "VideoMatchState", scope = EncounterInfo.class)
    public JAXBElement<Boolean> createEncounterInfoVideoMatchState(Boolean value) {
        return new JAXBElement<Boolean>(_EncounterInfoVideoMatchState_QNAME, Boolean.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ScoreEndProlongation_TeamB", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoScoreEndProlongationTeamB(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoScoreEndProlongationTeamB_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ScoreEndProlongation_TeamA", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoScoreEndProlongationTeamA(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoScoreEndProlongationTeamA_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdPitch", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoIdPitch(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoIdPitch_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "NumDay", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoNumDay(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoNumDay_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "TpSynchroVideoMT3", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoTpSynchroVideoMT3(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoTpSynchroVideoMT3_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "TpSynchroVideoMT2", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoTpSynchroVideoMT2(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoTpSynchroVideoMT2_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdStatCalculationState", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoIdStatCalculationState(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoIdStatCalculationState_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "TpSynchroVideoMT1", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoTpSynchroVideoMT1(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoTpSynchroVideoMT1_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "CodeName", scope = EncounterInfo.class)
    public JAXBElement<String> createEncounterInfoCodeName(String value) {
        return new JAXBElement<String>(_EncounterInfoCodeName_QNAME, String.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ScoreEndOfficialTime_TeamA", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoScoreEndOfficialTimeTeamA(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoScoreEndOfficialTimeTeamA_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ScoreEndOfficialTime_TeamB", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoScoreEndOfficialTimeTeamB(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoScoreEndOfficialTimeTeamB_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ClubAName", scope = EncounterInfo.class)
    public JAXBElement<String> createEncounterInfoClubAName(String value) {
        return new JAXBElement<String>(_EncounterInfoClubAName_QNAME, String.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Duration4", scope = EncounterInfo.class)
    public JAXBElement<XMLGregorianCalendar> createEncounterInfoDuration4(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EncounterInfoDuration4_QNAME, XMLGregorianCalendar.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdCompetition", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoIdCompetition(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoIdCompetition_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "TeamAC5", scope = EncounterInfo.class)
    public JAXBElement<String> createEncounterInfoTeamAC5(String value) {
        return new JAXBElement<String>(_EncounterInfoTeamAC5_QNAME, String.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ScoreEndFinalShot_TeamA", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoScoreEndFinalShotTeamA(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoScoreEndFinalShotTeamA_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ScoreEndFinalShot_TeamB", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoScoreEndFinalShotTeamB(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoScoreEndFinalShotTeamB_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "TeamAName", scope = EncounterInfo.class)
    public JAXBElement<String> createEncounterInfoTeamAName(String value) {
        return new JAXBElement<String>(_EncounterInfoTeamAName_QNAME, String.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "TeamBC5", scope = EncounterInfo.class)
    public JAXBElement<String> createEncounterInfoTeamBC5(String value) {
        return new JAXBElement<String>(_EncounterInfoTeamBC5_QNAME, String.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "MatchCode", scope = EncounterInfo.class)
    public JAXBElement<String> createEncounterInfoMatchCode(String value) {
        return new JAXBElement<String>(_EncounterInfoMatchCode_QNAME, String.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "TeamBName", scope = EncounterInfo.class)
    public JAXBElement<String> createEncounterInfoTeamBName(String value) {
        return new JAXBElement<String>(_EncounterInfoTeamBName_QNAME, String.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "SeasonName", scope = EncounterInfo.class)
    public JAXBElement<String> createEncounterInfoSeasonName(String value) {
        return new JAXBElement<String>(_EncounterInfoSeasonName_QNAME, String.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdDay", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoIdDay(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoIdDay_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "MatchType", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoMatchType(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoMatchType_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ClubBName", scope = EncounterInfo.class)
    public JAXBElement<String> createEncounterInfoClubBName(String value) {
        return new JAXBElement<String>(_EncounterInfoClubBName_QNAME, String.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Groupe", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoGroupe(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoGroupe_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "CompetOrganizerName", scope = EncounterInfo.class)
    public JAXBElement<String> createEncounterInfoCompetOrganizerName(String value) {
        return new JAXBElement<String>(_EncounterInfoCompetOrganizerName_QNAME, String.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdCompany", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoIdCompany(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoIdCompany_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "TpSynchroVideoMT4", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoTpSynchroVideoMT4(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoTpSynchroVideoMT4_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Score_TeamB", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoScoreTeamB(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoScoreTeamB_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Duration1", scope = EncounterInfo.class)
    public JAXBElement<XMLGregorianCalendar> createEncounterInfoDuration1(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EncounterInfoDuration1_QNAME, XMLGregorianCalendar.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Duration2", scope = EncounterInfo.class)
    public JAXBElement<XMLGregorianCalendar> createEncounterInfoDuration2(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EncounterInfoDuration2_QNAME, XMLGregorianCalendar.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Duration3", scope = EncounterInfo.class)
    public JAXBElement<XMLGregorianCalendar> createEncounterInfoDuration3(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EncounterInfoDuration3_QNAME, XMLGregorianCalendar.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdSeason", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoIdSeason(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoIdSeason_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Score_TeamA", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoScoreTeamA(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoScoreTeamA_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MatchState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "MatchState", scope = EncounterInfo.class)
    public JAXBElement<MatchState> createEncounterInfoMatchState(MatchState value) {
        return new JAXBElement<MatchState>(_MatchState_QNAME, MatchState.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "CompetitionName", scope = EncounterInfo.class)
    public JAXBElement<String> createEncounterInfoCompetitionName(String value) {
        return new JAXBElement<String>(_EncounterInfoCompetitionName_QNAME, String.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdTour", scope = EncounterInfo.class)
    public JAXBElement<Integer> createEncounterInfoIdTour(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoIdTour_QNAME, Integer.class, EncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetExtracterRankingResult", scope = GetExtracterRankingResponse.class)
    public JAXBElement<String> createGetExtracterRankingResponseGetExtracterRankingResult(String value) {
        return new JAXBElement<String>(_GetExtracterRankingResponseGetExtracterRankingResult_QNAME, String.class, GetExtracterRankingResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhotoInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetActorPhotoResult", scope = GetActorPhotoResponse.class)
    public JAXBElement<ArrayOfPhotoInfo> createGetActorPhotoResponseGetActorPhotoResult(ArrayOfPhotoInfo value) {
        return new JAXBElement<ArrayOfPhotoInfo>(_GetActorPhotoResponseGetActorPhotoResult_QNAME, ArrayOfPhotoInfo.class, GetActorPhotoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProfessionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetProfessionsResult", scope = GetProfessionsResponse.class)
    public JAXBElement<ArrayOfProfessionInfo> createGetProfessionsResponseGetProfessionsResult(ArrayOfProfessionInfo value) {
        return new JAXBElement<ArrayOfProfessionInfo>(_GetProfessionsResponseGetProfessionsResult_QNAME, ArrayOfProfessionInfo.class, GetProfessionsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "CodeName", scope = PitchInfo.class)
    public JAXBElement<String> createPitchInfoCodeName(String value) {
        return new JAXBElement<String>(_EncounterInfoCodeName_QNAME, String.class, PitchInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "PitchName", scope = PitchInfo.class)
    public JAXBElement<String> createPitchInfoPitchName(String value) {
        return new JAXBElement<String>(_PitchInfoPitchName_QNAME, String.class, PitchInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "CityName", scope = PitchInfo.class)
    public JAXBElement<String> createPitchInfoCityName(String value) {
        return new JAXBElement<String>(_PitchInfoCityName_QNAME, String.class, PitchInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatValueInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStatValueActorResult", scope = GetStatValueActorResponse.class)
    public JAXBElement<ArrayOfStatValueInfo> createGetStatValueActorResponseGetStatValueActorResult(ArrayOfStatValueInfo value) {
        return new JAXBElement<ArrayOfStatValueInfo>(_GetStatValueActorResponseGetStatValueActorResult_QNAME, ArrayOfStatValueInfo.class, GetStatValueActorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ClubUsualAbbrev", scope = PlayerInfo.class)
    public JAXBElement<String> createPlayerInfoClubUsualAbbrev(String value) {
        return new JAXBElement<String>(_PlayerInfoClubUsualAbbrev_QNAME, String.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdClient", scope = PlayerInfo.class)
    public JAXBElement<Integer> createPlayerInfoIdClient(Integer value) {
        return new JAXBElement<Integer>(_PlayerInfoIdClient_QNAME, Integer.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdShirt", scope = PlayerInfo.class)
    public JAXBElement<String> createPlayerInfoIdShirt(String value) {
        return new JAXBElement<String>(_PlayerInfoIdShirt_QNAME, String.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "UsualName", scope = PlayerInfo.class)
    public JAXBElement<String> createPlayerInfoUsualName(String value) {
        return new JAXBElement<String>(_PlayerInfoUsualName_QNAME, String.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ClubOfficialName", scope = PlayerInfo.class)
    public JAXBElement<String> createPlayerInfoClubOfficialName(String value) {
        return new JAXBElement<String>(_PlayerInfoClubOfficialName_QNAME, String.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "BirthDay", scope = PlayerInfo.class)
    public JAXBElement<XMLGregorianCalendar> createPlayerInfoBirthDay(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PlayerInfoBirthDay_QNAME, XMLGregorianCalendar.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdSex", scope = PlayerInfo.class)
    public JAXBElement<Integer> createPlayerInfoIdSex(Integer value) {
        return new JAXBElement<Integer>(_PlayerInfoIdSex_QNAME, Integer.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Heigth", scope = PlayerInfo.class)
    public JAXBElement<Short> createPlayerInfoHeigth(Short value) {
        return new JAXBElement<Short>(_PlayerInfoHeigth_QNAME, Short.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "FirstName", scope = PlayerInfo.class)
    public JAXBElement<String> createPlayerInfoFirstName(String value) {
        return new JAXBElement<String>(_PlayerInfoFirstName_QNAME, String.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdCountry", scope = PlayerInfo.class)
    public JAXBElement<Integer> createPlayerInfoIdCountry(Integer value) {
        return new JAXBElement<Integer>(_PlayerInfoIdCountry_QNAME, Integer.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Identifier", scope = PlayerInfo.class)
    public JAXBElement<String> createPlayerInfoIdentifier(String value) {
        return new JAXBElement<String>(_PlayerInfoIdentifier_QNAME, String.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "SecondName", scope = PlayerInfo.class)
    public JAXBElement<String> createPlayerInfoSecondName(String value) {
        return new JAXBElement<String>(_PlayerInfoSecondName_QNAME, String.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdProfession", scope = PlayerInfo.class)
    public JAXBElement<Short> createPlayerInfoIdProfession(Short value) {
        return new JAXBElement<Short>(_PlayerInfoIdProfession_QNAME, Short.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdUnit", scope = PlayerInfo.class)
    public JAXBElement<Short> createPlayerInfoIdUnit(Short value) {
        return new JAXBElement<Short>(_PlayerInfoIdUnit_QNAME, Short.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Loan", scope = PlayerInfo.class)
    public JAXBElement<Boolean> createPlayerInfoLoan(Boolean value) {
        return new JAXBElement<Boolean>(_PlayerInfoLoan_QNAME, Boolean.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ClubOfficialAbbrev", scope = PlayerInfo.class)
    public JAXBElement<String> createPlayerInfoClubOfficialAbbrev(String value) {
        return new JAXBElement<String>(_PlayerInfoClubOfficialAbbrev_QNAME, String.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "EndDate", scope = PlayerInfo.class)
    public JAXBElement<XMLGregorianCalendar> createPlayerInfoEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PlayerInfoEndDate_QNAME, XMLGregorianCalendar.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Weight", scope = PlayerInfo.class)
    public JAXBElement<Short> createPlayerInfoWeight(Short value) {
        return new JAXBElement<Short>(_PlayerInfoWeight_QNAME, Short.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ClubUsualName", scope = PlayerInfo.class)
    public JAXBElement<String> createPlayerInfoClubUsualName(String value) {
        return new JAXBElement<String>(_PlayerInfoClubUsualName_QNAME, String.class, PlayerInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdCompetition", scope = SeasonInfo.class)
    public JAXBElement<Integer> createSeasonInfoIdCompetition(Integer value) {
        return new JAXBElement<Integer>(_EncounterInfoIdCompetition_QNAME, Integer.class, SeasonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "EndDate", scope = SeasonInfo.class)
    public JAXBElement<XMLGregorianCalendar> createSeasonInfoEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PlayerInfoEndDate_QNAME, XMLGregorianCalendar.class, SeasonInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdEncounters", scope = GetStatValueTeam.class)
    public JAXBElement<ArrayOfint> createGetStatValueTeamIdEncounters(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatValueTeamIdEncounters_QNAME, ArrayOfint.class, GetStatValueTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdStats", scope = GetStatValueTeam.class)
    public JAXBElement<ArrayOfint> createGetStatValueTeamIdStats(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatValueTeamIdStats_QNAME, ArrayOfint.class, GetStatValueTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdTeams", scope = GetStatValueTeam.class)
    public JAXBElement<ArrayOfint> createGetStatValueTeamIdTeams(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatValueTeamIdTeams_QNAME, ArrayOfint.class, GetStatValueTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUnitInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetUnitsResult", scope = GetUnitsResponse.class)
    public JAXBElement<ArrayOfUnitInfo> createGetUnitsResponseGetUnitsResult(ArrayOfUnitInfo value) {
        return new JAXBElement<ArrayOfUnitInfo>(_GetUnitsResponseGetUnitsResult_QNAME, ArrayOfUnitInfo.class, GetUnitsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idTeams", scope = GetTeam.class)
    public JAXBElement<ArrayOfint> createGetTeamIdTeams(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetTeamIdTeams_QNAME, ArrayOfint.class, GetTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetExtracterHistoricResult", scope = GetExtracterHistoricResponse.class)
    public JAXBElement<String> createGetExtracterHistoricResponseGetExtracterHistoricResult(String value) {
        return new JAXBElement<String>(_GetExtracterHistoricResponseGetExtracterHistoricResult_QNAME, String.class, GetExtracterHistoricResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idSeasons", scope = GetSeason.class)
    public JAXBElement<ArrayOfint> createGetSeasonIdSeasons(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetSeasonIdSeasons_QNAME, ArrayOfint.class, GetSeason.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ServiceVersionResult", scope = ServiceVersionResponse.class)
    public JAXBElement<String> createServiceVersionResponseServiceVersionResult(String value) {
        return new JAXBElement<String>(_ServiceVersionResponseServiceVersionResult_QNAME, String.class, ServiceVersionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Photo", scope = PhotoInfo.class)
    public JAXBElement<byte[]> createPhotoInfoPhoto(byte[] value) {
        return new JAXBElement<byte[]>(_PhotoInfoPhoto_QNAME, byte[].class, PhotoInfo.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Name", scope = PhotoInfo.class)
    public JAXBElement<String> createPhotoInfoName(String value) {
        return new JAXBElement<String>(_PhotoInfoName_QNAME, String.class, PhotoInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdTextCategory", scope = GetTexts.class)
    public JAXBElement<Integer> createGetTextsIdTextCategory(Integer value) {
        return new JAXBElement<Integer>(_GetTextsIdTextCategory_QNAME, Integer.class, GetTexts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdTexts", scope = GetTexts.class)
    public JAXBElement<ArrayOfint> createGetTextsIdTexts(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetTextsIdTexts_QNAME, ArrayOfint.class, GetTexts.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEncounterInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetEncountersResult", scope = GetEncountersResponse.class)
    public JAXBElement<ArrayOfEncounterInfo> createGetEncountersResponseGetEncountersResult(ArrayOfEncounterInfo value) {
        return new JAXBElement<ArrayOfEncounterInfo>(_GetEncountersResponseGetEncountersResult_QNAME, ArrayOfEncounterInfo.class, GetEncountersResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPitchInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetPitchResult", scope = GetPitchResponse.class)
    public JAXBElement<ArrayOfPitchInfo> createGetPitchResponseGetPitchResult(ArrayOfPitchInfo value) {
        return new JAXBElement<ArrayOfPitchInfo>(_GetPitchResponseGetPitchResult_QNAME, ArrayOfPitchInfo.class, GetPitchResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatCategInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStatCategsResult", scope = GetStatCategsResponse.class)
    public JAXBElement<ArrayOfStatCategInfo> createGetStatCategsResponseGetStatCategsResult(ArrayOfStatCategInfo value) {
        return new JAXBElement<ArrayOfStatCategInfo>(_GetStatCategsResponseGetStatCategsResult_QNAME, ArrayOfStatCategInfo.class, GetStatCategsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTextCategoryInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTextCategoriesResult", scope = GetTextCategoriesResponse.class)
    public JAXBElement<ArrayOfTextCategoryInfo> createGetTextCategoriesResponseGetTextCategoriesResult(ArrayOfTextCategoryInfo value) {
        return new JAXBElement<ArrayOfTextCategoryInfo>(_GetTextCategoriesResponseGetTextCategoriesResult_QNAME, ArrayOfTextCategoryInfo.class, GetTextCategoriesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdStats", scope = GetStatSeasonValueTeam.class)
    public JAXBElement<ArrayOfint> createGetStatSeasonValueTeamIdStats(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatValueTeamIdStats_QNAME, ArrayOfint.class, GetStatSeasonValueTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdTeams", scope = GetStatSeasonValueTeam.class)
    public JAXBElement<ArrayOfint> createGetStatSeasonValueTeamIdTeams(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatValueTeamIdTeams_QNAME, ArrayOfint.class, GetStatSeasonValueTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdSeasons", scope = GetStatSeasonValueTeam.class)
    public JAXBElement<ArrayOfint> createGetStatSeasonValueTeamIdSeasons(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatSeasonValueTeamIdSeasons_QNAME, ArrayOfint.class, GetStatSeasonValueTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ClubWebSiteUrl", scope = CustomTeam.class)
    public JAXBElement<String> createCustomTeamClubWebSiteUrl(String value) {
        return new JAXBElement<String>(_CustomTeamClubWebSiteUrl_QNAME, String.class, CustomTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "AbbrevClubName", scope = CustomTeam.class)
    public JAXBElement<String> createCustomTeamAbbrevClubName(String value) {
        return new JAXBElement<String>(_CustomTeamAbbrevClubName_QNAME, String.class, CustomTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "TeamMediaName", scope = CustomTeam.class)
    public JAXBElement<String> createCustomTeamTeamMediaName(String value) {
        return new JAXBElement<String>(_CustomTeamTeamMediaName_QNAME, String.class, CustomTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Code5", scope = CustomTeam.class)
    public JAXBElement<String> createCustomTeamCode5(String value) {
        return new JAXBElement<String>(_CustomTeamCode5_QNAME, String.class, CustomTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Name", scope = CustomTeam.class)
    public JAXBElement<String> createCustomTeamName(String value) {
        return new JAXBElement<String>(_PhotoInfoName_QNAME, String.class, CustomTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ClubName", scope = CustomTeam.class)
    public JAXBElement<String> createCustomTeamClubName(String value) {
        return new JAXBElement<String>(_CustomTeamClubName_QNAME, String.class, CustomTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdStadium", scope = CustomTeam.class)
    public JAXBElement<Integer> createCustomTeamIdStadium(Integer value) {
        return new JAXBElement<Integer>(_CustomTeamIdStadium_QNAME, Integer.class, CustomTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "StrIdCompets", scope = CustomTeam.class)
    public JAXBElement<String> createCustomTeamStrIdCompets(String value) {
        return new JAXBElement<String>(_CustomTeamStrIdCompets_QNAME, String.class, CustomTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ClubStadiumName", scope = CustomTeam.class)
    public JAXBElement<String> createCustomTeamClubStadiumName(String value) {
        return new JAXBElement<String>(_CustomTeamClubStadiumName_QNAME, String.class, CustomTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ClubMediaName", scope = CustomTeam.class)
    public JAXBElement<String> createCustomTeamClubMediaName(String value) {
        return new JAXBElement<String>(_CustomTeamClubMediaName_QNAME, String.class, CustomTeam.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhotoInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSeasonTeamsLogosResult", scope = GetSeasonTeamsLogosResponse.class)
    public JAXBElement<ArrayOfPhotoInfo> createGetSeasonTeamsLogosResponseGetSeasonTeamsLogosResult(ArrayOfPhotoInfo value) {
        return new JAXBElement<ArrayOfPhotoInfo>(_GetSeasonTeamsLogosResponseGetSeasonTeamsLogosResult_QNAME, ArrayOfPhotoInfo.class, GetSeasonTeamsLogosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idActor", scope = GetActor.class)
    public JAXBElement<ArrayOfint> createGetActorIdActor(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetActorIdActor_QNAME, ArrayOfint.class, GetActor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Value", scope = StatSeasonValueInfo.class)
    public JAXBElement<Double> createStatSeasonValueInfoValue(Double value) {
        return new JAXBElement<Double>(_StatSeasonValueInfoValue_QNAME, Double.class, StatSeasonValueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPlayerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetEncounterActorsResult", scope = GetEncounterActorsResponse.class)
    public JAXBElement<ArrayOfPlayerInfo> createGetEncounterActorsResponseGetEncounterActorsResult(ArrayOfPlayerInfo value) {
        return new JAXBElement<ArrayOfPlayerInfo>(_GetEncounterActorsResponseGetEncounterActorsResult_QNAME, ArrayOfPlayerInfo.class, GetEncounterActorsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idPitchs", scope = GetPitch.class)
    public JAXBElement<ArrayOfint> createGetPitchIdPitchs(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetPitchIdPitchs_QNAME, ArrayOfint.class, GetPitch.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPlayerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTeamActorsResult", scope = GetTeamActorsResponse.class)
    public JAXBElement<ArrayOfPlayerInfo> createGetTeamActorsResponseGetTeamActorsResult(ArrayOfPlayerInfo value) {
        return new JAXBElement<ArrayOfPlayerInfo>(_GetTeamActorsResponseGetTeamActorsResult_QNAME, ArrayOfPlayerInfo.class, GetTeamActorsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeasonInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSeasonResult", scope = GetSeasonResponse.class)
    public JAXBElement<ArrayOfSeasonInfo> createGetSeasonResponseGetSeasonResult(ArrayOfSeasonInfo value) {
        return new JAXBElement<ArrayOfSeasonInfo>(_GetSeasonResponseGetSeasonResult_QNAME, ArrayOfSeasonInfo.class, GetSeasonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdPeriod", scope = StatValueInfo.class)
    public JAXBElement<Integer> createStatValueInfoIdPeriod(Integer value) {
        return new JAXBElement<Integer>(_StatValueInfoIdPeriod_QNAME, Integer.class, StatValueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "EndTime", scope = StatValueInfo.class)
    public JAXBElement<Integer> createStatValueInfoEndTime(Integer value) {
        return new JAXBElement<Integer>(_StatValueInfoEndTime_QNAME, Integer.class, StatValueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "StartTime", scope = StatValueInfo.class)
    public JAXBElement<Integer> createStatValueInfoStartTime(Integer value) {
        return new JAXBElement<Integer>(_StatValueInfoStartTime_QNAME, Integer.class, StatValueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ZoneX1", scope = StatValueInfo.class)
    public JAXBElement<Short> createStatValueInfoZoneX1(Short value) {
        return new JAXBElement<Short>(_StatValueInfoZoneX1_QNAME, Short.class, StatValueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ZoneZ1", scope = StatValueInfo.class)
    public JAXBElement<Integer> createStatValueInfoZoneZ1(Integer value) {
        return new JAXBElement<Integer>(_StatValueInfoZoneZ1_QNAME, Integer.class, StatValueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Value", scope = StatValueInfo.class)
    public JAXBElement<Double> createStatValueInfoValue(Double value) {
        return new JAXBElement<Double>(_StatSeasonValueInfoValue_QNAME, Double.class, StatValueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ZoneX2", scope = StatValueInfo.class)
    public JAXBElement<Integer> createStatValueInfoZoneX2(Integer value) {
        return new JAXBElement<Integer>(_StatValueInfoZoneX2_QNAME, Integer.class, StatValueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ZoneZ2", scope = StatValueInfo.class)
    public JAXBElement<Integer> createStatValueInfoZoneZ2(Integer value) {
        return new JAXBElement<Integer>(_StatValueInfoZoneZ2_QNAME, Integer.class, StatValueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ZoneY2", scope = StatValueInfo.class)
    public JAXBElement<Integer> createStatValueInfoZoneY2(Integer value) {
        return new JAXBElement<Integer>(_StatValueInfoZoneY2_QNAME, Integer.class, StatValueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "ZoneY1", scope = StatValueInfo.class)
    public JAXBElement<Integer> createStatValueInfoZoneY1(Integer value) {
        return new JAXBElement<Integer>(_StatValueInfoZoneY1_QNAME, Integer.class, StatValueInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSeasonInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCompetitionSeasonsResult", scope = GetCompetitionSeasonsResponse.class)
    public JAXBElement<ArrayOfSeasonInfo> createGetCompetitionSeasonsResponseGetCompetitionSeasonsResult(ArrayOfSeasonInfo value) {
        return new JAXBElement<ArrayOfSeasonInfo>(_GetCompetitionSeasonsResponseGetCompetitionSeasonsResult_QNAME, ArrayOfSeasonInfo.class, GetCompetitionSeasonsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatSeasonActorInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStatSeasonActorResult", scope = GetStatSeasonActorResponse.class)
    public JAXBElement<ArrayOfStatSeasonActorInfo> createGetStatSeasonActorResponseGetStatSeasonActorResult(ArrayOfStatSeasonActorInfo value) {
        return new JAXBElement<ArrayOfStatSeasonActorInfo>(_GetStatSeasonActorResponseGetStatSeasonActorResult_QNAME, ArrayOfStatSeasonActorInfo.class, GetStatSeasonActorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfTextInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTextsResult", scope = GetTextsResponse.class)
    public JAXBElement<ArrayOfTextInfo> createGetTextsResponseGetTextsResult(ArrayOfTextInfo value) {
        return new JAXBElement<ArrayOfTextInfo>(_GetTextsResponseGetTextsResult_QNAME, ArrayOfTextInfo.class, GetTextsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "NbActions", scope = StatEncounterInfo.class)
    public JAXBElement<Integer> createStatEncounterInfoNbActions(Integer value) {
        return new JAXBElement<Integer>(_StatEncounterInfoNbActions_QNAME, Integer.class, StatEncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdTeams", scope = GetTeamLogo.class)
    public JAXBElement<ArrayOfint> createGetTeamLogoIdTeams(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatValueTeamIdTeams_QNAME, ArrayOfint.class, GetTeamLogo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdActors", scope = GetStatSeasonActor.class)
    public JAXBElement<ArrayOfint> createGetStatSeasonActorIdActors(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatSeasonActorIdActors_QNAME, ArrayOfint.class, GetStatSeasonActor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdStats", scope = GetStatSeasonActor.class)
    public JAXBElement<ArrayOfint> createGetStatSeasonActorIdStats(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatValueTeamIdStats_QNAME, ArrayOfint.class, GetStatSeasonActor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdSeasons", scope = GetStatSeasonActor.class)
    public JAXBElement<ArrayOfint> createGetStatSeasonActorIdSeasons(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatSeasonValueTeamIdSeasons_QNAME, ArrayOfint.class, GetStatSeasonActor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "idCompetitions", scope = GetCompetition.class)
    public JAXBElement<ArrayOfint> createGetCompetitionIdCompetitions(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetCompetitionIdCompetitions_QNAME, ArrayOfint.class, GetCompetition.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "StatSubCategName", scope = StatSubCategInfo.class)
    public JAXBElement<String> createStatSubCategInfoStatSubCategName(String value) {
        return new JAXBElement<String>(_StatSubCategInfoStatSubCategName_QNAME, String.class, StatSubCategInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdActors", scope = GetActorPhoto.class)
    public JAXBElement<ArrayOfint> createGetActorPhotoIdActors(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatSeasonActorIdActors_QNAME, ArrayOfint.class, GetActorPhoto.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Period3Complete", scope = StatActorEncounterInfo.class)
    public JAXBElement<Boolean> createStatActorEncounterInfoPeriod3Complete(Boolean value) {
        return new JAXBElement<Boolean>(_StatActorEncounterInfoPeriod3Complete_QNAME, Boolean.class, StatActorEncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "PrecentPlayed", scope = StatActorEncounterInfo.class)
    public JAXBElement<Double> createStatActorEncounterInfoPrecentPlayed(Double value) {
        return new JAXBElement<Double>(_StatActorEncounterInfoPrecentPlayed_QNAME, Double.class, StatActorEncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Period4Complete", scope = StatActorEncounterInfo.class)
    public JAXBElement<Boolean> createStatActorEncounterInfoPeriod4Complete(Boolean value) {
        return new JAXBElement<Boolean>(_StatActorEncounterInfoPeriod4Complete_QNAME, Boolean.class, StatActorEncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "TimePlayed", scope = StatActorEncounterInfo.class)
    public JAXBElement<Integer> createStatActorEncounterInfoTimePlayed(Integer value) {
        return new JAXBElement<Integer>(_StatActorEncounterInfoTimePlayed_QNAME, Integer.class, StatActorEncounterInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdActors", scope = GetStatValueActorTrend.class)
    public JAXBElement<ArrayOfint> createGetStatValueActorTrendIdActors(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatSeasonActorIdActors_QNAME, ArrayOfint.class, GetStatValueActorTrend.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdStats", scope = GetStatValueActorTrend.class)
    public JAXBElement<ArrayOfint> createGetStatValueActorTrendIdStats(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatValueTeamIdStats_QNAME, ArrayOfint.class, GetStatValueActorTrend.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Profession", scope = ProfessionInfo.class)
    public JAXBElement<String> createProfessionInfoProfession(String value) {
        return new JAXBElement<String>(_ProfessionInfoProfession_QNAME, String.class, ProfessionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatActorTrendInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStatValueActorTrendResult", scope = GetStatValueActorTrendResponse.class)
    public JAXBElement<ArrayOfStatActorTrendInfo> createGetStatValueActorTrendResponseGetStatValueActorTrendResult(ArrayOfStatActorTrendInfo value) {
        return new JAXBElement<ArrayOfStatActorTrendInfo>(_GetStatValueActorTrendResponseGetStatValueActorTrendResult_QNAME, ArrayOfStatActorTrendInfo.class, GetStatValueActorTrendResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatValueInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStatValueTeamResult", scope = GetStatValueTeamResponse.class)
    public JAXBElement<ArrayOfStatValueInfo> createGetStatValueTeamResponseGetStatValueTeamResult(ArrayOfStatValueInfo value) {
        return new JAXBElement<ArrayOfStatValueInfo>(_GetStatValueTeamResponseGetStatValueTeamResult_QNAME, ArrayOfStatValueInfo.class, GetStatValueTeamResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Category", scope = TextCategoryInfo.class)
    public JAXBElement<String> createTextCategoryInfoCategory(String value) {
        return new JAXBElement<String>(_TextCategoryInfoCategory_QNAME, String.class, TextCategoryInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhotoInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTeamPlayersPhotosResult", scope = GetTeamPlayersPhotosResponse.class)
    public JAXBElement<ArrayOfPhotoInfo> createGetTeamPlayersPhotosResponseGetTeamPlayersPhotosResult(ArrayOfPhotoInfo value) {
        return new JAXBElement<ArrayOfPhotoInfo>(_GetTeamPlayersPhotosResponseGetTeamPlayersPhotosResult_QNAME, ArrayOfPhotoInfo.class, GetTeamPlayersPhotosResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdActors", scope = GetStatSeasonValueActor.class)
    public JAXBElement<ArrayOfint> createGetStatSeasonValueActorIdActors(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatSeasonActorIdActors_QNAME, ArrayOfint.class, GetStatSeasonValueActor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdStats", scope = GetStatSeasonValueActor.class)
    public JAXBElement<ArrayOfint> createGetStatSeasonValueActorIdStats(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatValueTeamIdStats_QNAME, ArrayOfint.class, GetStatSeasonValueActor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdSeasons", scope = GetStatSeasonValueActor.class)
    public JAXBElement<ArrayOfint> createGetStatSeasonValueActorIdSeasons(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatSeasonValueTeamIdSeasons_QNAME, ArrayOfint.class, GetStatSeasonValueActor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdOrganizer", scope = CompetitionInfo.class)
    public JAXBElement<Integer> createCompetitionInfoIdOrganizer(Integer value) {
        return new JAXBElement<Integer>(_CompetitionInfoIdOrganizer_QNAME, Integer.class, CompetitionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "CompetitionName", scope = CompetitionInfo.class)
    public JAXBElement<String> createCompetitionInfoCompetitionName(String value) {
        return new JAXBElement<String>(_EncounterInfoCompetitionName_QNAME, String.class, CompetitionInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdEncounters", scope = GetStatValueActorEncounter.class)
    public JAXBElement<ArrayOfint> createGetStatValueActorEncounterIdEncounters(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatValueTeamIdEncounters_QNAME, ArrayOfint.class, GetStatValueActorEncounter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdActors", scope = GetStatValueActorEncounter.class)
    public JAXBElement<ArrayOfint> createGetStatValueActorEncounterIdActors(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatSeasonActorIdActors_QNAME, ArrayOfint.class, GetStatValueActorEncounter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdEncounters", scope = GetStatValueActor.class)
    public JAXBElement<ArrayOfint> createGetStatValueActorIdEncounters(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatValueTeamIdEncounters_QNAME, ArrayOfint.class, GetStatValueActor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdActors", scope = GetStatValueActor.class)
    public JAXBElement<ArrayOfint> createGetStatValueActorIdActors(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatSeasonActorIdActors_QNAME, ArrayOfint.class, GetStatValueActor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdStats", scope = GetStatValueActor.class)
    public JAXBElement<ArrayOfint> createGetStatValueActorIdStats(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatValueTeamIdStats_QNAME, ArrayOfint.class, GetStatValueActor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "CategName", scope = StatCategInfo.class)
    public JAXBElement<String> createStatCategInfoCategName(String value) {
        return new JAXBElement<String>(_StatCategInfoCategName_QNAME, String.class, StatCategInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdStatCategs", scope = GetStats.class)
    public JAXBElement<ArrayOfint> createGetStatsIdStatCategs(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatSubCategsIdStatCategs_QNAME, ArrayOfint.class, GetStats.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatSeasonValueInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStatSeasonValueTeamResult", scope = GetStatSeasonValueTeamResponse.class)
    public JAXBElement<ArrayOfStatSeasonValueInfo> createGetStatSeasonValueTeamResponseGetStatSeasonValueTeamResult(ArrayOfStatSeasonValueInfo value) {
        return new JAXBElement<ArrayOfStatSeasonValueInfo>(_GetStatSeasonValueTeamResponseGetStatSeasonValueTeamResult_QNAME, ArrayOfStatSeasonValueInfo.class, GetStatSeasonValueTeamResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Text", scope = TextInfo.class)
    public JAXBElement<String> createTextInfoText(String value) {
        return new JAXBElement<String>(_TextInfoText_QNAME, String.class, TextInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCompetitionInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetCompetitionResult", scope = GetCompetitionResponse.class)
    public JAXBElement<ArrayOfCompetitionInfo> createGetCompetitionResponseGetCompetitionResult(ArrayOfCompetitionInfo value) {
        return new JAXBElement<ArrayOfCompetitionInfo>(_GetCompetitionResponseGetCompetitionResult_QNAME, ArrayOfCompetitionInfo.class, GetCompetitionResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "IdStatCateg", scope = StatInfo.class)
    public JAXBElement<Integer> createStatInfoIdStatCateg(Integer value) {
        return new JAXBElement<Integer>(_StatInfoIdStatCateg_QNAME, Integer.class, StatInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "StatName", scope = StatInfo.class)
    public JAXBElement<String> createStatInfoStatName(String value) {
        return new JAXBElement<String>(_StatInfoStatName_QNAME, String.class, StatInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncounterInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetEncountersByIdClientsResult", scope = GetEncountersByIdClientsResponse.class)
    public JAXBElement<EncounterInfo> createGetEncountersByIdClientsResponseGetEncountersByIdClientsResult(EncounterInfo value) {
        return new JAXBElement<EncounterInfo>(_GetEncountersByIdClientsResponseGetEncountersByIdClientsResult_QNAME, EncounterInfo.class, GetEncountersByIdClientsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdEncounters", scope = GetStatValueEncounter.class)
    public JAXBElement<ArrayOfint> createGetStatValueEncounterIdEncounters(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetStatValueTeamIdEncounters_QNAME, ArrayOfint.class, GetStatValueEncounter.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhotoInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTeamLogoResult", scope = GetTeamLogoResponse.class)
    public JAXBElement<ArrayOfPhotoInfo> createGetTeamLogoResponseGetTeamLogoResult(ArrayOfPhotoInfo value) {
        return new JAXBElement<ArrayOfPhotoInfo>(_GetTeamLogoResponseGetTeamLogoResult_QNAME, ArrayOfPhotoInfo.class, GetTeamLogoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatSeasonValueInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStatSeasonValueActorResult", scope = GetStatSeasonValueActorResponse.class)
    public JAXBElement<ArrayOfStatSeasonValueInfo> createGetStatSeasonValueActorResponseGetStatSeasonValueActorResult(ArrayOfStatSeasonValueInfo value) {
        return new JAXBElement<ArrayOfStatSeasonValueInfo>(_GetStatSeasonValueActorResponseGetStatSeasonValueActorResult_QNAME, ArrayOfStatSeasonValueInfo.class, GetStatSeasonValueActorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatActorEncounterInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStatValueActorEncounterResult", scope = GetStatValueActorEncounterResponse.class)
    public JAXBElement<ArrayOfStatActorEncounterInfo> createGetStatValueActorEncounterResponseGetStatValueActorEncounterResult(ArrayOfStatActorEncounterInfo value) {
        return new JAXBElement<ArrayOfStatActorEncounterInfo>(_GetStatValueActorEncounterResponseGetStatValueActorEncounterResult_QNAME, ArrayOfStatActorEncounterInfo.class, GetStatValueActorEncounterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfEncounterInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetEncountersByCompetNameResult", scope = GetEncountersByCompetNameResponse.class)
    public JAXBElement<ArrayOfEncounterInfo> createGetEncountersByCompetNameResponseGetEncountersByCompetNameResult(ArrayOfEncounterInfo value) {
        return new JAXBElement<ArrayOfEncounterInfo>(_GetEncountersByCompetNameResponseGetEncountersByCompetNameResult_QNAME, ArrayOfEncounterInfo.class, GetEncountersByCompetNameResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPlayerInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetActorResult", scope = GetActorResponse.class)
    public JAXBElement<ArrayOfPlayerInfo> createGetActorResponseGetActorResult(ArrayOfPlayerInfo value) {
        return new JAXBElement<ArrayOfPlayerInfo>(_GetActorResponseGetActorResult_QNAME, ArrayOfPlayerInfo.class, GetActorResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatEncounterInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStatValueEncounterResult", scope = GetStatValueEncounterResponse.class)
    public JAXBElement<ArrayOfStatEncounterInfo> createGetStatValueEncounterResponseGetStatValueEncounterResult(ArrayOfStatEncounterInfo value) {
        return new JAXBElement<ArrayOfStatEncounterInfo>(_GetStatValueEncounterResponseGetStatValueEncounterResult_QNAME, ArrayOfStatEncounterInfo.class, GetStatValueEncounterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfint }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdRencontres", scope = GetEncounters.class)
    public JAXBElement<ArrayOfint> createGetEncountersIdRencontres(ArrayOfint value) {
        return new JAXBElement<ArrayOfint>(_GetEncountersIdRencontres_QNAME, ArrayOfint.class, GetEncounters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Day", scope = GetEncounters.class)
    public JAXBElement<Integer> createGetEncountersDay(Integer value) {
        return new JAXBElement<Integer>(_GetEncountersDay_QNAME, Integer.class, GetEncounters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "IdSaison", scope = GetEncounters.class)
    public JAXBElement<Integer> createGetEncountersIdSaison(Integer value) {
        return new JAXBElement<Integer>(_GetEncountersIdSaison_QNAME, Integer.class, GetEncounters.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CompetitionName", scope = GetEncountersByCompetName.class)
    public JAXBElement<String> createGetEncountersByCompetNameCompetitionName(String value) {
        return new JAXBElement<String>(_GetEncountersByCompetNameCompetitionName_QNAME, String.class, GetEncountersByCompetName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Day", scope = GetEncountersByCompetName.class)
    public JAXBElement<Integer> createGetEncountersByCompetNameDay(Integer value) {
        return new JAXBElement<Integer>(_GetEncountersDay_QNAME, Integer.class, GetEncountersByCompetName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SeasonEndYear", scope = GetEncountersByCompetName.class)
    public JAXBElement<Integer> createGetEncountersByCompetNameSeasonEndYear(Integer value) {
        return new JAXBElement<Integer>(_GetEncountersByCompetNameSeasonEndYear_QNAME, Integer.class, GetEncountersByCompetName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SeasonStartYear", scope = GetEncountersByCompetName.class)
    public JAXBElement<Integer> createGetEncountersByCompetNameSeasonStartYear(Integer value) {
        return new JAXBElement<Integer>(_GetEncountersByCompetNameSeasonStartYear_QNAME, Integer.class, GetEncountersByCompetName.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStatsResult", scope = GetStatsResponse.class)
    public JAXBElement<ArrayOfStatInfo> createGetStatsResponseGetStatsResult(ArrayOfStatInfo value) {
        return new JAXBElement<ArrayOfStatInfo>(_GetStatsResponseGetStatsResult_QNAME, ArrayOfStatInfo.class, GetStatsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCustomTeam }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetTeamResult", scope = GetTeamResponse.class)
    public JAXBElement<ArrayOfCustomTeam> createGetTeamResponseGetTeamResult(ArrayOfCustomTeam value) {
        return new JAXBElement<ArrayOfCustomTeam>(_GetTeamResponseGetTeamResult_QNAME, ArrayOfCustomTeam.class, GetTeamResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", name = "Unit", scope = UnitInfo.class)
    public JAXBElement<String> createUnitInfoUnit(String value) {
        return new JAXBElement<String>(_UnitInfoUnit_QNAME, String.class, UnitInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfStatSubCategInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetStatSubCategsResult", scope = GetStatSubCategsResponse.class)
    public JAXBElement<ArrayOfStatSubCategInfo> createGetStatSubCategsResponseGetStatSubCategsResult(ArrayOfStatSubCategInfo value) {
        return new JAXBElement<ArrayOfStatSubCategInfo>(_GetStatSubCategsResponseGetStatSubCategsResult_QNAME, ArrayOfStatSubCategInfo.class, GetStatSubCategsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetMatchEventsResult", scope = GetMatchEventsResponse.class)
    public JAXBElement<String> createGetMatchEventsResponseGetMatchEventsResult(String value) {
        return new JAXBElement<String>(_GetMatchEventsResponseGetMatchEventsResult_QNAME, String.class, GetMatchEventsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfPhotoInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetSeasonPlayersPhotosResult", scope = GetSeasonPlayersPhotosResponse.class)
    public JAXBElement<ArrayOfPhotoInfo> createGetSeasonPlayersPhotosResponseGetSeasonPlayersPhotosResult(ArrayOfPhotoInfo value) {
        return new JAXBElement<ArrayOfPhotoInfo>(_GetSeasonPlayersPhotosResponseGetSeasonPlayersPhotosResult_QNAME, ArrayOfPhotoInfo.class, GetSeasonPlayersPhotosResponse.class, value);
    }

}
