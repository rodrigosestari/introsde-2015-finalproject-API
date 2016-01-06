
package systemlogic.processcentricservices.soap.sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for savePersonMeasureResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="savePersonMeasureResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://sw.soap.processcentricservices.systemlogic/}measureHistory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "savePersonMeasureResponse", propOrder = {
    "measureHistory"
})
public class SavePersonMeasureResponse {

    @XmlElement(namespace = "http://sw.soap.processcentricservices.systemlogic/")
    protected MeasureHistoryView measureHistory;

    /**
     * Gets the value of the measureHistory property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureHistoryView }
     *     
     */
    public MeasureHistoryView getMeasureHistory() {
        return measureHistory;
    }

    /**
     * Sets the value of the measureHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureHistoryView }
     *     
     */
    public void setMeasureHistory(MeasureHistoryView value) {
        this.measureHistory = value;
    }

}
