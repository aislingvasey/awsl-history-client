
package awdl.history;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatSubCategInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatSubCategInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatSubCategInfo" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}StatSubCategInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatSubCategInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "statSubCategInfo"
})
public class ArrayOfStatSubCategInfo {

    @XmlElement(name = "StatSubCategInfo", nillable = true)
    protected List<StatSubCategInfo> statSubCategInfo;

    /**
     * Gets the value of the statSubCategInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statSubCategInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatSubCategInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatSubCategInfo }
     * 
     * 
     */
    public List<StatSubCategInfo> getStatSubCategInfo() {
        if (statSubCategInfo == null) {
            statSubCategInfo = new ArrayList<StatSubCategInfo>();
        }
        return this.statSubCategInfo;
    }

}
