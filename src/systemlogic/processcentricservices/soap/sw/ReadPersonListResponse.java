
package systemlogic.processcentricservices.soap.sw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readPersonListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readPersonListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://sw.soap.processcentricservices.systemlogic/}people" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonListResponse", propOrder = {
    "people"
})
public class ReadPersonListResponse {

    @XmlElement(namespace = "http://sw.soap.processcentricservices.systemlogic/")
    protected PeopleView people;

    /**
     * Gets the value of the people property.
     * 
     * @return
     *     possible object is
     *     {@link PeopleView }
     *     
     */
    public PeopleView getPeople() {
        return people;
    }

    /**
     * Sets the value of the people property.
     * 
     * @param value
     *     allowed object is
     *     {@link PeopleView }
     *     
     */
    public void setPeople(PeopleView value) {
        this.people = value;
    }

}
