
package awdl.history;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProfessionInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProfessionInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfessionInfo" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}ProfessionInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProfessionInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "professionInfo"
})
public class ArrayOfProfessionInfo {

    @XmlElement(name = "ProfessionInfo", nillable = true)
    protected List<ProfessionInfo> professionInfo;

    /**
     * Gets the value of the professionInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the professionInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfessionInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfessionInfo }
     * 
     * 
     */
    public List<ProfessionInfo> getProfessionInfo() {
        if (professionInfo == null) {
            professionInfo = new ArrayList<ProfessionInfo>();
        }
        return this.professionInfo;
    }

}
