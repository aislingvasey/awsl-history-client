
package awdl.history;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfUnitInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfUnitInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UnitInfo" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}UnitInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfUnitInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "unitInfo"
})
public class ArrayOfUnitInfo {

    @XmlElement(name = "UnitInfo", nillable = true)
    protected List<UnitInfo> unitInfo;

    /**
     * Gets the value of the unitInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitInfo }
     * 
     * 
     */
    public List<UnitInfo> getUnitInfo() {
        if (unitInfo == null) {
            unitInfo = new ArrayList<UnitInfo>();
        }
        return this.unitInfo;
    }

}
