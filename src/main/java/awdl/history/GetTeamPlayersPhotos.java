
package awdl.history;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdSeason" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IdTeam" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "idSeason",
    "idTeam"
})
@XmlRootElement(name = "GetTeamPlayersPhotos")
public class GetTeamPlayersPhotos {

    @XmlElement(name = "IdSeason")
    protected Integer idSeason;
    @XmlElement(name = "IdTeam")
    protected Integer idTeam;

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

}
