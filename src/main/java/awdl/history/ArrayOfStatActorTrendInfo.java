
package awdl.history;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfStatActorTrendInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfStatActorTrendInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatActorTrendInfo" type="{http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008}StatActorTrendInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfStatActorTrendInfo", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008", propOrder = {
    "statActorTrendInfo"
})
public class ArrayOfStatActorTrendInfo {

    @XmlElement(name = "StatActorTrendInfo", nillable = true)
    protected List<StatActorTrendInfo> statActorTrendInfo;

    /**
     * Gets the value of the statActorTrendInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statActorTrendInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatActorTrendInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatActorTrendInfo }
     * 
     * 
     */
    public List<StatActorTrendInfo> getStatActorTrendInfo() {
        if (statActorTrendInfo == null) {
            statActorTrendInfo = new ArrayList<StatActorTrendInfo>();
        }
        return this.statActorTrendInfo;
    }

}
