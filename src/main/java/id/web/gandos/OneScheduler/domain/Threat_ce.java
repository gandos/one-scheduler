package id.web.gandos.OneScheduler.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by rinow on 9/30/2017.
 */
@Document
public class Threat_ce {
    @Id
    private String id;
    private String Event_ID;
    private String Name;
    private String Message;
    private String End_Time;
    private String Attacker_Address;
    private String Attacker_Port;
    private String Target_Address;
    private String Target_Port;
    private String Event_Annotation_Stage_Name;
    private String Event_Annotation_Stage_User_Name;
    private String Event_Annotation_Comment;
    private String Device_Address;
    private String Device_Vendor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEvent_ID() {
        return Event_ID;
    }

    public void setEvent_ID(String event_ID) {
        Event_ID = event_ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getEnd_Time() {
        return End_Time;
    }

    public void setEnd_Time(String end_Time) {
        End_Time = end_Time;
    }

    public String getAttacker_Address() {
        return Attacker_Address;
    }

    public void setAttacker_Address(String attacker_Address) {
        Attacker_Address = attacker_Address;
    }

    public String getAttacker_Port() {
        return Attacker_Port;
    }

    public void setAttacker_Port(String attacker_Port) {
        Attacker_Port = attacker_Port;
    }

    public String getTarget_Address() {
        return Target_Address;
    }

    public void setTarget_Address(String target_Address) {
        Target_Address = target_Address;
    }

    public String getTarget_Port() {
        return Target_Port;
    }

    public void setTarget_Port(String target_Port) {
        Target_Port = target_Port;
    }

    public String getEvent_Annotation_Stage_Name() {
        return Event_Annotation_Stage_Name;
    }

    public void setEvent_Annotation_Stage_Name(String event_Annotation_Stage_Name) {
        Event_Annotation_Stage_Name = event_Annotation_Stage_Name;
    }

    public String getEvent_Annotation_Stage_User_Name() {
        return Event_Annotation_Stage_User_Name;
    }

    public void setEvent_Annotation_Stage_User_Name(String event_Annotation_Stage_User_Name) {
        Event_Annotation_Stage_User_Name = event_Annotation_Stage_User_Name;
    }

    public String getEvent_Annotation_Comment() {
        return Event_Annotation_Comment;
    }

    public void setEvent_Annotation_Comment(String event_Annotation_Comment) {
        Event_Annotation_Comment = event_Annotation_Comment;
    }

    public String getDevice_Address() {
        return Device_Address;
    }

    public void setDevice_Address(String device_Address) {
        Device_Address = device_Address;
    }

    public String getDevice_Vendor() {
        return Device_Vendor;
    }

    public void setDevice_Vendor(String device_Vendor) {
        Device_Vendor = device_Vendor;
    }

    @Override
    public String toString() {
        return "Threat_ce{" +
                "id='" + id + '\'' +
                ", Event_ID='" + Event_ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Message='" + Message + '\'' +
                ", End_Time='" + End_Time + '\'' +
                ", Attacker_Address='" + Attacker_Address + '\'' +
                ", Attacker_Port='" + Attacker_Port + '\'' +
                ", Target_Address='" + Target_Address + '\'' +
                ", Target_Port='" + Target_Port + '\'' +
                ", Event_Annotation_Stage_Name='" + Event_Annotation_Stage_Name + '\'' +
                ", Event_Annotation_Stage_User_Name='" + Event_Annotation_Stage_User_Name + '\'' +
                ", Event_Annotation_Comment='" + Event_Annotation_Comment + '\'' +
                ", Device_Address='" + Device_Address + '\'' +
                ", Device_Vendor='" + Device_Vendor + '\'' +
                '}';
    }
}
