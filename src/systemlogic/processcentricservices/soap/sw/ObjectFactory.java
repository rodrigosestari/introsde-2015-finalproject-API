
package systemlogic.processcentricservices.soap.sw;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the systemlogic.processcentricservices.soap.sw package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ReadMeasureTypes_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "readMeasureTypes");
    private final static QName _CreatePerson_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "createPerson");
    private final static QName _ReadMeasureTypesResponse_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "readMeasureTypesResponse");
    private final static QName _SavePersonMeasure_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "savePersonMeasure");
    private final static QName _SavePersonMeasureResponse_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "savePersonMeasureResponse");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "createPersonResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "deletePerson");
    private final static QName _UpdatePerson_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "updatePerson");
    private final static QName _ReadPersonMeasureResponse_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "readPersonMeasureResponse");
    private final static QName _ReadPersonMeasure_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "readPersonMeasure");
    private final static QName _ReadPerson_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "readPerson");
    private final static QName _ReadPersonList_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "readPersonList");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "readPersonResponse");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "deletePersonResponse");
    private final static QName _ReadPersonHistory_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "readPersonHistory");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "updatePersonResponse");
    private final static QName _ReadPersonHistoryResponse_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "readPersonHistoryResponse");
    private final static QName _ReadPersonListResponse_QNAME = new QName("http://sw.soap.processcentricservices.systemlogic/", "readPersonListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: systemlogic.processcentricservices.soap.sw
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PeopleView }
     * 
     */
    public PeopleView createPeople() {
        return new PeopleView();
    }

    /**
     * Create an instance of {@link MeasureHistoryView }
     * 
     */
    public MeasureHistoryView createMeasureHistory() {
        return new MeasureHistoryView();
    }

    /**
     * Create an instance of {@link systemlogic.processcentricservices.soap.sw.PersonDto }
     * 
     */
    public systemlogic.processcentricservices.soap.sw.PersonDto createPerson() {
        return new systemlogic.processcentricservices.soap.sw.PersonDto();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureResponse }
     * 
     */
    public ReadPersonMeasureResponse createReadPersonMeasureResponse() {
        return new ReadPersonMeasureResponse();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureResponse.MeasureProfile }
     * 
     */
    public ReadPersonMeasureResponse.MeasureProfile createReadPersonMeasureResponseMeasureProfile() {
        return new ReadPersonMeasureResponse.MeasureProfile();
    }

    /**
     * Create an instance of {@link systemlogic.processcentricservices.soap.sw.PersonDto.HealthProfile }
     * 
     */
    public systemlogic.processcentricservices.soap.sw.PersonDto.HealthProfile createPersonHealthProfile() {
        return new systemlogic.processcentricservices.soap.sw.PersonDto.HealthProfile();
    }

    /**
     * Create an instance of {@link ReadPersonHistoryResponse }
     * 
     */
    public ReadPersonHistoryResponse createReadPersonHistoryResponse() {
        return new ReadPersonHistoryResponse();
    }

    /**
     * Create an instance of {@link ReadPersonHistoryResponse.MeasureProfile }
     * 
     */
    public ReadPersonHistoryResponse.MeasureProfile createReadPersonHistoryResponseMeasureProfile() {
        return new ReadPersonHistoryResponse.MeasureProfile();
    }

    /**
     * Create an instance of {@link PeopleView.Person }
     * 
     */
    public PeopleView.Person createPeoplePerson() {
        return new PeopleView.Person();
    }

    /**
     * Create an instance of {@link PeopleView.Person.HealthProfile }
     * 
     */
    public PeopleView.Person.HealthProfile createPeoplePersonHealthProfile() {
        return new PeopleView.Person.HealthProfile();
    }

    /**
     * Create an instance of {@link ReadMeasureTypesResponse }
     * 
     */
    public ReadMeasureTypesResponse createReadMeasureTypesResponse() {
        return new ReadMeasureTypesResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link SavePersonMeasure }
     * 
     */
    public SavePersonMeasure createSavePersonMeasure() {
        return new SavePersonMeasure();
    }

    /**
     * Create an instance of {@link SavePersonMeasureResponse }
     * 
     */
    public SavePersonMeasureResponse createSavePersonMeasureResponse() {
        return new SavePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link MeasureTypesView }
     * 
     */
    public MeasureTypesView createMeasureTypes() {
        return new MeasureTypesView();
    }

    /**
     * Create an instance of {@link ReadMeasureTypes }
     * 
     */
    public ReadMeasureTypes createReadMeasureTypes() {
        return new ReadMeasureTypes();
    }

    /**
     * Create an instance of {@link ReadPersonListResponse }
     * 
     */
    public ReadPersonListResponse createReadPersonListResponse() {
        return new ReadPersonListResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonHistory }
     * 
     */
    public ReadPersonHistory createReadPersonHistory() {
        return new ReadPersonHistory();
    }

    /**
     * Create an instance of {@link MeasureHistoryView.Measure }
     * 
     */
    public MeasureHistoryView.Measure createMeasureHistoryMeasure() {
        return new MeasureHistoryView.Measure();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonList }
     * 
     */
    public ReadPersonList createReadPersonList() {
        return new ReadPersonList();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link ReadPersonMeasure }
     * 
     */
    public ReadPersonMeasure createReadPersonMeasure() {
        return new ReadPersonMeasure();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureResponse.MeasureProfile.Measure }
     * 
     */
    public ReadPersonMeasureResponse.MeasureProfile.Measure createReadPersonMeasureResponseMeasureProfileMeasure() {
        return new ReadPersonMeasureResponse.MeasureProfile.Measure();
    }

    /**
     * Create an instance of {@link systemlogic.processcentricservices.soap.sw.PersonDto.HealthProfile.MeasureType }
     * 
     */
    public systemlogic.processcentricservices.soap.sw.PersonDto.HealthProfile.MeasureType createPersonHealthProfileMeasureType() {
        return new systemlogic.processcentricservices.soap.sw.PersonDto.HealthProfile.MeasureType();
    }

    /**
     * Create an instance of {@link ReadPersonHistoryResponse.MeasureProfile.Measure }
     * 
     */
    public ReadPersonHistoryResponse.MeasureProfile.Measure createReadPersonHistoryResponseMeasureProfileMeasure() {
        return new ReadPersonHistoryResponse.MeasureProfile.Measure();
    }

    /**
     * Create an instance of {@link PeopleView.Person.HealthProfile.MeasureType }
     * 
     */
    public PeopleView.Person.HealthProfile.MeasureType createPeoplePersonHealthProfileMeasureType() {
        return new PeopleView.Person.HealthProfile.MeasureType();
    }

    /**
     * Create an instance of {@link ReadMeasureTypesResponse.MeasureProfile }
     * 
     */
    public ReadMeasureTypesResponse.MeasureProfile createReadMeasureTypesResponseMeasureProfile() {
        return new ReadMeasureTypesResponse.MeasureProfile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "readMeasureTypes")
    public JAXBElement<ReadMeasureTypes> createReadMeasureTypes(ReadMeasureTypes value) {
        return new JAXBElement<ReadMeasureTypes>(_ReadMeasureTypes_QNAME, ReadMeasureTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "readMeasureTypesResponse")
    public JAXBElement<ReadMeasureTypesResponse> createReadMeasureTypesResponse(ReadMeasureTypesResponse value) {
        return new JAXBElement<ReadMeasureTypesResponse>(_ReadMeasureTypesResponse_QNAME, ReadMeasureTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "savePersonMeasure")
    public JAXBElement<SavePersonMeasure> createSavePersonMeasure(SavePersonMeasure value) {
        return new JAXBElement<SavePersonMeasure>(_SavePersonMeasure_QNAME, SavePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "savePersonMeasureResponse")
    public JAXBElement<SavePersonMeasureResponse> createSavePersonMeasureResponse(SavePersonMeasureResponse value) {
        return new JAXBElement<SavePersonMeasureResponse>(_SavePersonMeasureResponse_QNAME, SavePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "readPersonMeasureResponse")
    public JAXBElement<ReadPersonMeasureResponse> createReadPersonMeasureResponse(ReadPersonMeasureResponse value) {
        return new JAXBElement<ReadPersonMeasureResponse>(_ReadPersonMeasureResponse_QNAME, ReadPersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "readPersonMeasure")
    public JAXBElement<ReadPersonMeasure> createReadPersonMeasure(ReadPersonMeasure value) {
        return new JAXBElement<ReadPersonMeasure>(_ReadPersonMeasure_QNAME, ReadPersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "readPersonList")
    public JAXBElement<ReadPersonList> createReadPersonList(ReadPersonList value) {
        return new JAXBElement<ReadPersonList>(_ReadPersonList_QNAME, ReadPersonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "readPersonHistory")
    public JAXBElement<ReadPersonHistory> createReadPersonHistory(ReadPersonHistory value) {
        return new JAXBElement<ReadPersonHistory>(_ReadPersonHistory_QNAME, ReadPersonHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "readPersonHistoryResponse")
    public JAXBElement<ReadPersonHistoryResponse> createReadPersonHistoryResponse(ReadPersonHistoryResponse value) {
        return new JAXBElement<ReadPersonHistoryResponse>(_ReadPersonHistoryResponse_QNAME, ReadPersonHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sw.soap.processcentricservices.systemlogic/", name = "readPersonListResponse")
    public JAXBElement<ReadPersonListResponse> createReadPersonListResponse(ReadPersonListResponse value) {
        return new JAXBElement<ReadPersonListResponse>(_ReadPersonListResponse_QNAME, ReadPersonListResponse.class, null, value);
    }

}
