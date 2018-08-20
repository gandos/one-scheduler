package id.web.gandos.OneScheduler.domain;

import java.time.LocalDateTime;

/**
 * Created by rinow on 8/20/2018.
 */
public class Job {
    private String id;
    private LocalDateTime gmtDateTime;
    private String resultCode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getGmtDateTime() {
        return gmtDateTime;
    }

    public void setGmtDateTime(LocalDateTime gmtDateTime) {
        this.gmtDateTime = gmtDateTime;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }
}
