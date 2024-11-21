
package com.camsys.tds;

import java.math.BigInteger;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.camsys.tds package. 
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

    private final static QName _TripRequest_QNAME = new QName("", "tripRequest");
    private final static QName _ExpeditedTripRequest_QNAME = new QName("", "expeditedTripRequest");
    private final static QName _TripRequestWithRiderInformation_QNAME = new QName("", "tripRequestWithRiderInformation");
    private final static QName _TripRequestResponse_QNAME = new QName("", "tripRequestResponse");
    private final static QName _ClientOrderConfirmation_QNAME = new QName("", "clientOrderConfirmation");
    private final static QName _CustomerInfo_QNAME = new QName("", "customerInfo");
    private final static QName _ProviderOrderConfirmation_QNAME = new QName("", "providerOrderConfirmation");
    private final static QName _VehicleConfirmation_QNAME = new QName("", "vehicleConfirmation");
    private final static QName _Telegram_QNAME = new QName("", "telegram");
    private final static QName _TripTask_QNAME = new QName("", "tripTask");
    private final static QName _TripTaskConfirmation_QNAME = new QName("", "tripTaskConfirmation");
    private final static QName _TripTaskCompletion_QNAME = new QName("", "tripTaskCompletion");
    private final static QName _TripScheduledConfirmation_QNAME = new QName("", "tripScheduledConfirmation");
    private final static QName _TripTaskStatus_QNAME = new QName("", "tripTaskStatus");
    private final static QName _TripCancelRequest_QNAME = new QName("", "tripCancelRequest");
    private final static QName _TripCancelResponse_QNAME = new QName("", "tripCancelResponse");
    private final static QName _RealtimeTripUpdate_QNAME = new QName("", "realtimeTripUpdate");
    private final static QName _RealtimeVehiclePosition_QNAME = new QName("", "realtimeVehiclePosition");
    private final static QName _TripPickupArrivalConfirmation_QNAME = new QName("", "tripPickupArrivalConfirmation");
    private final static QName _ClientOrderConfirmationTypeTripRequestId_QNAME = new QName("", "tripRequestId");
    private final static QName _ClientOrderConfirmationTypePickupAddress_QNAME = new QName("", "pickupAddress");
    private final static QName _ClientOrderConfirmationTypeDropoffAddress_QNAME = new QName("", "dropoffAddress");
    private final static QName _ClientOrderConfirmationTypePickupTime_QNAME = new QName("", "pickupTime");
    private final static QName _ClientOrderConfirmationTypeAppointmentTime_QNAME = new QName("", "appointmentTime");
    private final static QName _ClientOrderConfirmationTypeDropoffTime_QNAME = new QName("", "dropoffTime");
    private final static QName _ClientOrderConfirmationTypePickupWindowStartTime_QNAME = new QName("", "pickupWindowStartTime");
    private final static QName _ClientOrderConfirmationTypePickupWindowEndTime_QNAME = new QName("", "pickupWindowEndTime");
    private final static QName _ClientOrderConfirmationTypeDetoursPermissible_QNAME = new QName("", "detoursPermissible");
    private final static QName _ClientOrderConfirmationTypeNegotiatedPickupTime_QNAME = new QName("", "negotiatedPickupTime");
    private final static QName _ClientOrderConfirmationTypeHardConstraintOnPickupTime_QNAME = new QName("", "hardConstraintOnPickupTime");
    private final static QName _ClientOrderConfirmationTypeHardConstraintOnDropoffTime_QNAME = new QName("", "hardConstraintOnDropoffTime");
    private final static QName _ClientOrderConfirmationTypeDetailedDropoffLocationDescription_QNAME = new QName("", "detailedDropoffLocationDescription");
    private final static QName _ClientOrderConfirmationTypeDetailedPickupLocationDescription_QNAME = new QName("", "detailedPickupLocationDescription");
    private final static QName _ClientOrderConfirmationTypeCustomerName_QNAME = new QName("", "customerName");
    private final static QName _ClientOrderConfirmationTypeCustomerMobilePhone_QNAME = new QName("", "customerMobilePhone");
    private final static QName _ClientOrderConfirmationTypeCustomerLocInDropoffSequence_QNAME = new QName("", "customerLocInDropoffSequence");
    private final static QName _ClientOrderConfirmationTypeNumOtherReservedPassengers_QNAME = new QName("", "numOtherReservedPassengers");
    private final static QName _ClientOrderConfirmationTypeFundingEntityId_QNAME = new QName("", "fundingEntityId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.camsys.tds
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link TripRequestType }
     * 
     */
    public TripRequestType createTripRequestType() {
        return new TripRequestType();
    }

    /**
     * Create an instance of {@link ExpeditedTripRequestType }
     * 
     */
    public ExpeditedTripRequestType createExpeditedTripRequestType() {
        return new ExpeditedTripRequestType();
    }

    /**
     * Create an instance of {@link TripRequestResponseType }
     * 
     */
    public TripRequestResponseType createTripRequestResponseType() {
        return new TripRequestResponseType();
    }

    /**
     * Create an instance of {@link ClientOrderConfirmationType }
     * 
     */
    public ClientOrderConfirmationType createClientOrderConfirmationType() {
        return new ClientOrderConfirmationType();
    }

    /**
     * Create an instance of {@link CustomerInfoType }
     * 
     */
    public CustomerInfoType createCustomerInfoType() {
        return new CustomerInfoType();
    }

    /**
     * Create an instance of {@link ProviderOrderConfirmationType }
     * 
     */
    public ProviderOrderConfirmationType createProviderOrderConfirmationType() {
        return new ProviderOrderConfirmationType();
    }

    /**
     * Create an instance of {@link VehicleConfirmationType }
     * 
     */
    public VehicleConfirmationType createVehicleConfirmationType() {
        return new VehicleConfirmationType();
    }

    /**
     * Create an instance of {@link TelegramMessageType }
     * 
     */
    public TelegramMessageType createTelegramMessageType() {
        return new TelegramMessageType();
    }

    /**
     * Create an instance of {@link TripTaskType }
     * 
     */
    public TripTaskType createTripTaskType() {
        return new TripTaskType();
    }

    /**
     * Create an instance of {@link TripTaskConfirmationType }
     * 
     */
    public TripTaskConfirmationType createTripTaskConfirmationType() {
        return new TripTaskConfirmationType();
    }

    /**
     * Create an instance of {@link TripTaskCompletionType }
     * 
     */
    public TripTaskCompletionType createTripTaskCompletionType() {
        return new TripTaskCompletionType();
    }

    /**
     * Create an instance of {@link TripScheduledConfirmationType }
     * 
     */
    public TripScheduledConfirmationType createTripScheduledConfirmationType() {
        return new TripScheduledConfirmationType();
    }

    /**
     * Create an instance of {@link TripTaskStatusType }
     * 
     */
    public TripTaskStatusType createTripTaskStatusType() {
        return new TripTaskStatusType();
    }

    /**
     * Create an instance of {@link TripCancelRequestType }
     * 
     */
    public TripCancelRequestType createTripCancelRequestType() {
        return new TripCancelRequestType();
    }

    /**
     * Create an instance of {@link TripCancelResponseType }
     * 
     */
    public TripCancelResponseType createTripCancelResponseType() {
        return new TripCancelResponseType();
    }

    /**
     * Create an instance of {@link RealtimeTripUpdateType }
     * 
     */
    public RealtimeTripUpdateType createRealtimeTripUpdateType() {
        return new RealtimeTripUpdateType();
    }

    /**
     * Create an instance of {@link RealtimeVehiclePositionType }
     * 
     */
    public RealtimeVehiclePositionType createRealtimeVehiclePositionType() {
        return new RealtimeVehiclePositionType();
    }

    /**
     * Create an instance of {@link TripPickupArrivalConfirmationType }
     * 
     */
    public TripPickupArrivalConfirmationType createTripPickupArrivalConfirmationType() {
        return new TripPickupArrivalConfirmationType();
    }

    /**
     * Create an instance of {@link GeographicLocation }
     * 
     */
    public GeographicLocation createGeographicLocation() {
        return new GeographicLocation();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link IdType }
     * 
     */
    public IdType createIdType() {
        return new IdType();
    }

    /**
     * Create an instance of {@link ManualDescriptionType }
     * 
     */
    public ManualDescriptionType createManualDescriptionType() {
        return new ManualDescriptionType();
    }

    /**
     * Create an instance of {@link SimpleAddress }
     * 
     */
    public SimpleAddress createSimpleAddress() {
        return new SimpleAddress();
    }

    /**
     * Create an instance of {@link VehicleDistance }
     * 
     */
    public VehicleDistance createVehicleDistance() {
        return new VehicleDistance();
    }

    /**
     * Create an instance of {@link VehicleDescription }
     * 
     */
    public VehicleDescription createVehicleDescription() {
        return new VehicleDescription();
    }

    /**
     * Create an instance of {@link DriverDescription }
     * 
     */
    public DriverDescription createDriverDescription() {
        return new DriverDescription();
    }

    /**
     * Create an instance of {@link ProviderType }
     * 
     */
    public ProviderType createProviderType() {
        return new ProviderType();
    }

    /**
     * Create an instance of {@link AddressType.IdStreet }
     * 
     */
    public AddressType.IdStreet createAddressTypeIdStreet() {
        return new AddressType.IdStreet();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tripRequest")
    public JAXBElement<TripRequestType> createTripRequest(TripRequestType value) {
        return new JAXBElement<TripRequestType>(_TripRequest_QNAME, TripRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpeditedTripRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExpeditedTripRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "expeditedTripRequest")
    public JAXBElement<ExpeditedTripRequestType> createExpeditedTripRequest(ExpeditedTripRequestType value) {
        return new JAXBElement<ExpeditedTripRequestType>(_ExpeditedTripRequest_QNAME, ExpeditedTripRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tripRequestWithRiderInformation")
    public JAXBElement<TripRequestType> createTripRequestWithRiderInformation(TripRequestType value) {
        return new JAXBElement<TripRequestType>(_TripRequestWithRiderInformation_QNAME, TripRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripRequestResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripRequestResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tripRequestResponse")
    public JAXBElement<TripRequestResponseType> createTripRequestResponse(TripRequestResponseType value) {
        return new JAXBElement<TripRequestResponseType>(_TripRequestResponse_QNAME, TripRequestResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClientOrderConfirmationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ClientOrderConfirmationType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "clientOrderConfirmation")
    public JAXBElement<ClientOrderConfirmationType> createClientOrderConfirmation(ClientOrderConfirmationType value) {
        return new JAXBElement<ClientOrderConfirmationType>(_ClientOrderConfirmation_QNAME, ClientOrderConfirmationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CustomerInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "customerInfo")
    public JAXBElement<CustomerInfoType> createCustomerInfo(CustomerInfoType value) {
        return new JAXBElement<CustomerInfoType>(_CustomerInfo_QNAME, CustomerInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProviderOrderConfirmationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProviderOrderConfirmationType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "providerOrderConfirmation")
    public JAXBElement<ProviderOrderConfirmationType> createProviderOrderConfirmation(ProviderOrderConfirmationType value) {
        return new JAXBElement<ProviderOrderConfirmationType>(_ProviderOrderConfirmation_QNAME, ProviderOrderConfirmationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VehicleConfirmationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VehicleConfirmationType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "vehicleConfirmation")
    public JAXBElement<VehicleConfirmationType> createVehicleConfirmation(VehicleConfirmationType value) {
        return new JAXBElement<VehicleConfirmationType>(_VehicleConfirmation_QNAME, VehicleConfirmationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TelegramMessageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TelegramMessageType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "telegram")
    public JAXBElement<TelegramMessageType> createTelegram(TelegramMessageType value) {
        return new JAXBElement<TelegramMessageType>(_Telegram_QNAME, TelegramMessageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripTaskType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripTaskType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tripTask")
    public JAXBElement<TripTaskType> createTripTask(TripTaskType value) {
        return new JAXBElement<TripTaskType>(_TripTask_QNAME, TripTaskType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripTaskConfirmationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripTaskConfirmationType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tripTaskConfirmation")
    public JAXBElement<TripTaskConfirmationType> createTripTaskConfirmation(TripTaskConfirmationType value) {
        return new JAXBElement<TripTaskConfirmationType>(_TripTaskConfirmation_QNAME, TripTaskConfirmationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripTaskCompletionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripTaskCompletionType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tripTaskCompletion")
    public JAXBElement<TripTaskCompletionType> createTripTaskCompletion(TripTaskCompletionType value) {
        return new JAXBElement<TripTaskCompletionType>(_TripTaskCompletion_QNAME, TripTaskCompletionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripScheduledConfirmationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripScheduledConfirmationType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tripScheduledConfirmation")
    public JAXBElement<TripScheduledConfirmationType> createTripScheduledConfirmation(TripScheduledConfirmationType value) {
        return new JAXBElement<TripScheduledConfirmationType>(_TripScheduledConfirmation_QNAME, TripScheduledConfirmationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripTaskStatusType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripTaskStatusType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tripTaskStatus")
    public JAXBElement<TripTaskStatusType> createTripTaskStatus(TripTaskStatusType value) {
        return new JAXBElement<TripTaskStatusType>(_TripTaskStatus_QNAME, TripTaskStatusType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripCancelRequestType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripCancelRequestType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tripCancelRequest")
    public JAXBElement<TripCancelRequestType> createTripCancelRequest(TripCancelRequestType value) {
        return new JAXBElement<TripCancelRequestType>(_TripCancelRequest_QNAME, TripCancelRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripCancelResponseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripCancelResponseType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tripCancelResponse")
    public JAXBElement<TripCancelResponseType> createTripCancelResponse(TripCancelResponseType value) {
        return new JAXBElement<TripCancelResponseType>(_TripCancelResponse_QNAME, TripCancelResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealtimeTripUpdateType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealtimeTripUpdateType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "realtimeTripUpdate")
    public JAXBElement<RealtimeTripUpdateType> createRealtimeTripUpdate(RealtimeTripUpdateType value) {
        return new JAXBElement<RealtimeTripUpdateType>(_RealtimeTripUpdate_QNAME, RealtimeTripUpdateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RealtimeVehiclePositionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RealtimeVehiclePositionType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "realtimeVehiclePosition")
    public JAXBElement<RealtimeVehiclePositionType> createRealtimeVehiclePosition(RealtimeVehiclePositionType value) {
        return new JAXBElement<RealtimeVehiclePositionType>(_RealtimeVehiclePosition_QNAME, RealtimeVehiclePositionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripPickupArrivalConfirmationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripPickupArrivalConfirmationType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tripPickupArrivalConfirmation")
    public JAXBElement<TripPickupArrivalConfirmationType> createTripPickupArrivalConfirmation(TripPickupArrivalConfirmationType value) {
        return new JAXBElement<TripPickupArrivalConfirmationType>(_TripPickupArrivalConfirmation_QNAME, TripPickupArrivalConfirmationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "tripRequestId", scope = ClientOrderConfirmationType.class)
    public JAXBElement<String> createClientOrderConfirmationTypeTripRequestId(String value) {
        return new JAXBElement<String>(_ClientOrderConfirmationTypeTripRequestId_QNAME, String.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "pickupAddress", scope = ClientOrderConfirmationType.class)
    public JAXBElement<AddressType> createClientOrderConfirmationTypePickupAddress(AddressType value) {
        return new JAXBElement<AddressType>(_ClientOrderConfirmationTypePickupAddress_QNAME, AddressType.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dropoffAddress", scope = ClientOrderConfirmationType.class)
    public JAXBElement<AddressType> createClientOrderConfirmationTypeDropoffAddress(AddressType value) {
        return new JAXBElement<AddressType>(_ClientOrderConfirmationTypeDropoffAddress_QNAME, AddressType.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Time }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Time }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "pickupTime", scope = ClientOrderConfirmationType.class)
    public JAXBElement<Time> createClientOrderConfirmationTypePickupTime(Time value) {
        return new JAXBElement<Time>(_ClientOrderConfirmationTypePickupTime_QNAME, Time.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Time }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Time }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "appointmentTime", scope = ClientOrderConfirmationType.class)
    public JAXBElement<Time> createClientOrderConfirmationTypeAppointmentTime(Time value) {
        return new JAXBElement<Time>(_ClientOrderConfirmationTypeAppointmentTime_QNAME, Time.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Time }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Time }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dropoffTime", scope = ClientOrderConfirmationType.class)
    public JAXBElement<Time> createClientOrderConfirmationTypeDropoffTime(Time value) {
        return new JAXBElement<Time>(_ClientOrderConfirmationTypeDropoffTime_QNAME, Time.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Time }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Time }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "pickupWindowStartTime", scope = ClientOrderConfirmationType.class)
    public JAXBElement<Time> createClientOrderConfirmationTypePickupWindowStartTime(Time value) {
        return new JAXBElement<Time>(_ClientOrderConfirmationTypePickupWindowStartTime_QNAME, Time.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Time }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Time }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "pickupWindowEndTime", scope = ClientOrderConfirmationType.class)
    public JAXBElement<Time> createClientOrderConfirmationTypePickupWindowEndTime(Time value) {
        return new JAXBElement<Time>(_ClientOrderConfirmationTypePickupWindowEndTime_QNAME, Time.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "detoursPermissible", scope = ClientOrderConfirmationType.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Boolean> createClientOrderConfirmationTypeDetoursPermissible(Boolean value) {
        return new JAXBElement<Boolean>(_ClientOrderConfirmationTypeDetoursPermissible_QNAME, Boolean.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Time }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Time }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "negotiatedPickupTime", scope = ClientOrderConfirmationType.class)
    public JAXBElement<Time> createClientOrderConfirmationTypeNegotiatedPickupTime(Time value) {
        return new JAXBElement<Time>(_ClientOrderConfirmationTypeNegotiatedPickupTime_QNAME, Time.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "hardConstraintOnPickupTime", scope = ClientOrderConfirmationType.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Boolean> createClientOrderConfirmationTypeHardConstraintOnPickupTime(Boolean value) {
        return new JAXBElement<Boolean>(_ClientOrderConfirmationTypeHardConstraintOnPickupTime_QNAME, Boolean.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "hardConstraintOnDropoffTime", scope = ClientOrderConfirmationType.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    public JAXBElement<Boolean> createClientOrderConfirmationTypeHardConstraintOnDropoffTime(Boolean value) {
        return new JAXBElement<Boolean>(_ClientOrderConfirmationTypeHardConstraintOnDropoffTime_QNAME, Boolean.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "detailedDropoffLocationDescription", scope = ClientOrderConfirmationType.class)
    public JAXBElement<String> createClientOrderConfirmationTypeDetailedDropoffLocationDescription(String value) {
        return new JAXBElement<String>(_ClientOrderConfirmationTypeDetailedDropoffLocationDescription_QNAME, String.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "detailedPickupLocationDescription", scope = ClientOrderConfirmationType.class)
    public JAXBElement<String> createClientOrderConfirmationTypeDetailedPickupLocationDescription(String value) {
        return new JAXBElement<String>(_ClientOrderConfirmationTypeDetailedPickupLocationDescription_QNAME, String.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "customerName", scope = ClientOrderConfirmationType.class)
    public JAXBElement<String> createClientOrderConfirmationTypeCustomerName(String value) {
        return new JAXBElement<String>(_ClientOrderConfirmationTypeCustomerName_QNAME, String.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "customerMobilePhone", scope = ClientOrderConfirmationType.class)
    public JAXBElement<BigInteger> createClientOrderConfirmationTypeCustomerMobilePhone(BigInteger value) {
        return new JAXBElement<BigInteger>(_ClientOrderConfirmationTypeCustomerMobilePhone_QNAME, BigInteger.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "customerLocInDropoffSequence", scope = ClientOrderConfirmationType.class)
    public JAXBElement<BigInteger> createClientOrderConfirmationTypeCustomerLocInDropoffSequence(BigInteger value) {
        return new JAXBElement<BigInteger>(_ClientOrderConfirmationTypeCustomerLocInDropoffSequence_QNAME, BigInteger.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "numOtherReservedPassengers", scope = ClientOrderConfirmationType.class)
    public JAXBElement<BigInteger> createClientOrderConfirmationTypeNumOtherReservedPassengers(BigInteger value) {
        return new JAXBElement<BigInteger>(_ClientOrderConfirmationTypeNumOtherReservedPassengers_QNAME, BigInteger.class, ClientOrderConfirmationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fundingEntityId", scope = ClientOrderConfirmationType.class)
    public JAXBElement<String> createClientOrderConfirmationTypeFundingEntityId(String value) {
        return new JAXBElement<String>(_ClientOrderConfirmationTypeFundingEntityId_QNAME, String.class, ClientOrderConfirmationType.class, value);
    }

}
