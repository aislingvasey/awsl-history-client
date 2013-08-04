
package awdl.history;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatSeasonActorInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatSeasonActorInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatSeasonActorInfo" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}StatSeasonActorInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatSeasonActorInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "statSeasonActorInfo"
})
public class ArrayOfStatSeasonActorInfo {

    @XmlElement(name = "StatSeasonActorInfo", nillable = true)
    protected List<StatSeasonActorInfo> statSeasonActorInfo;

    /**
     * Gets the value of the statSeasonActorInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statSeasonActorInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatSeasonActorInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatSeasonActorInfo }
     * 
     * 
     */
    public List<StatSeasonActorInfo> getStatSeasonActorInfo() {
        if (statSeasonActorInfo == null) {
            statSeasonActorInfo = new ArrayList<StatSeasonActorInfo>();
        }
        return this.statSeasonActorInfo;
    }

}
