
package awdl.history;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MatchState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MatchState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Calculated"/>
 *     &lt;enumeration value="NoActions"/>
 *     &lt;enumeration value="NoStatistics"/>
 *     &lt;enumeration value="JustMatchSheet"/>
 *     &lt;enumeration value="Empty"/>
 *     &lt;enumeration value="Error"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MatchState", namespace = "http://schemas.datacontract.org/2004/07/AmiscoDataAccess2008")
@XmlEnum
public enum MatchState {

    @XmlEnumValue("Calculated")
    CALCULATED("Calculated"),
    @XmlEnumValue("NoActions")
    NO_ACTIONS("NoActions"),
    @XmlEnumValue("NoStatistics")
    NO_STATISTICS("NoStatistics"),
    @XmlEnumValue("JustMatchSheet")
    JUST_MATCH_SHEET("JustMatchSheet"),
    @XmlEnumValue("Empty")
    EMPTY("Empty"),
    @XmlEnumValue("Error")
    ERROR("Error");
    private final String value;

    MatchState(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MatchState fromValue(String v) {
        for (MatchState c: MatchState.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
