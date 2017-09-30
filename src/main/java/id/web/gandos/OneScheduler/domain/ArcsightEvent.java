package id.web.gandos.OneScheduler.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * Created by rinow on 9/30/2017.
 */
@Document(collection = "threat_ce")
public class ArcsightEvent {
    @Id
    private String id;

    @Field( "Event_ID" )
    private String eventId;

    @Field( "Name" )
    private String name;

    @Field( "Message" )
    private String message;

    @Field( "End_Time" )
    private String endTime;

    @Field( "Attacker_Address" )
    private String attackerAddress;

    @Field( "Attacker_Port" )
    private String attackerPort;

    @Field( "Target_Address" )
    private String targetAddress;

    @Field( "Target_Port" )
    private String targetPort;

    @Field( "Event_Annotation_Stage_Name" )
    private String annotationStage;

    @Field( "Event_Annotation_Stage_User_Name" )
    private String annotationUser;

    @Field( "Event_Annotation_Comment" )
    private String annotationComment;

    private String deviceProduct;
    private String managerReceiptTime;
    private String attackerUserName;
    private String attackerUserId;
    private String targetUserName;
    private String targetUserId;
    private String deviceCustomString1="";
    private String deviceCustomString2;
    private String deviceCustomNumber1="";
    private String eventType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getAttackerAddress() {
        return attackerAddress;
    }

    public void setAttackerAddress(String attackerAddress) {
        this.attackerAddress = attackerAddress;
    }

    public String getAttackerPort() {
        return attackerPort;
    }

    public void setAttackerPort(String attackerPort) {
        this.attackerPort = attackerPort;
    }

    public String getTargetAddress() {
        return targetAddress;
    }

    public void setTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress;
    }

    public String getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(String targetPort) {
        this.targetPort = targetPort;
    }

    public String getAnnotationStage() {
        return annotationStage;
    }

    public void setAnnotationStage(String annotationStage) {
        this.annotationStage = annotationStage;
    }

    public String getAnnotationUser() {
        return annotationUser;
    }

    public void setAnnotationUser(String annotationUser) {
        this.annotationUser = annotationUser;
    }

    public String getAnnotationComment() {
        return annotationComment;
    }

    public void setAnnotationComment(String annotationComment) {
        this.annotationComment = annotationComment;
    }

    public String getDeviceProduct() {
        return deviceProduct;
    }

    public void setDeviceProduct(String deviceProduct) {
        this.deviceProduct = deviceProduct;
    }

    public String getManagerReceiptTime() {
        return managerReceiptTime;
    }

    public void setManagerReceiptTime(String managerReceiptTime) {
        this.managerReceiptTime = managerReceiptTime;
    }

    public String getAttackerUserName() {
        return attackerUserName;
    }

    public void setAttackerUserName(String attackerUserName) {
        this.attackerUserName = attackerUserName;
    }

    public String getAttackerUserId() {
        return attackerUserId;
    }

    public void setAttackerUserId(String attackerUserId) {
        this.attackerUserId = attackerUserId;
    }

    public String getTargetUserName() {
        return targetUserName;
    }

    public void setTargetUserName(String targetUserName) {
        this.targetUserName = targetUserName;
    }

    public String getTargetUserId() {
        return targetUserId;
    }

    public void setTargetUserId(String targetUserId) {
        this.targetUserId = targetUserId;
    }

    public String getDeviceCustomString1() {
        return deviceCustomString1;
    }

    public void setDeviceCustomString1(String deviceCustomString1) {
        this.deviceCustomString1 = deviceCustomString1;
    }

    public String getDeviceCustomString2() {
        return deviceCustomString2;
    }

    public void setDeviceCustomString2(String deviceCustomString2) {
        this.deviceCustomString2 = deviceCustomString2;
    }

    public String getDeviceCustomNumber1() {
        return deviceCustomNumber1;
    }

    public void setDeviceCustomNumber1(String deviceCustomNumber1) {
        this.deviceCustomNumber1 = deviceCustomNumber1;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "ArcsightEvent{" +
                "eventId='" + eventId + '\'' +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                ", endTime='" + endTime + '\'' +
                ", attackerAddress='" + attackerAddress + '\'' +
                ", attackerPort='" + attackerPort + '\'' +
                ", targetAddress='" + targetAddress + '\'' +
                ", targetPort='" + targetPort + '\'' +
                ", annotationStage='" + annotationStage + '\'' +
                ", annotationUser='" + annotationUser + '\'' +
                ", annotationComment='" + annotationComment + '\'' +
                ", deviceProduct='" + deviceProduct + '\'' +
                ", managerReceiptTime='" + managerReceiptTime + '\'' +
                ", attackerUserName='" + attackerUserName + '\'' +
                ", attackerUserId='" + attackerUserId + '\'' +
                ", targetUserName='" + targetUserName + '\'' +
                ", targetUserId='" + targetUserId + '\'' +
                ", deviceCustomString1='" + deviceCustomString1 + '\'' +
                ", deviceCustomString2='" + deviceCustomString2 + '\'' +
                ", deviceCustomNumber1='" + deviceCustomNumber1 + '\'' +
                ", eventType='" + eventType + '\'' +
                '}';
    }
}
