
package awdl.history;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatActorEncounterInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatActorEncounterInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatActorEncounterInfo" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}StatActorEncounterInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatActorEncounterInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "statActorEncounterInfo"
})
public class ArrayOfStatActorEncounterInfo {

    @XmlElement(name = "StatActorEncounterInfo", nillable = true)
    protected List<StatActorEncounterInfo> statActorEncounterInfo;

    /**
     * Gets the value of the statActorEncounterInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statActorEncounterInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatActorEncounterInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatActorEncounterInfo }
     * 
     * 
     */
    public List<StatActorEncounterInfo> getStatActorEncounterInfo() {
        if (statActorEncounterInfo == null) {
            statActorEncounterInfo = new ArrayList<StatActorEncounterInfo>();
        }
        return this.statActorEncounterInfo;
    }

}
