
package awdl.history;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatEncounterInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatEncounterInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatEncounterInfo" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}StatEncounterInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatEncounterInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "statEncounterInfo"
})
public class ArrayOfStatEncounterInfo {

    @XmlElement(name = "StatEncounterInfo", nillable = true)
    protected List<StatEncounterInfo> statEncounterInfo;

    /**
     * Gets the value of the statEncounterInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statEncounterInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatEncounterInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatEncounterInfo }
     * 
     * 
     */
    public List<StatEncounterInfo> getStatEncounterInfo() {
        if (statEncounterInfo == null) {
            statEncounterInfo = new ArrayList<StatEncounterInfo>();
        }
        return this.statEncounterInfo;
    }

}
