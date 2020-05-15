package model;

import java.time.LocalDateTime;
import java.util.List;

public class Alert {
    private int id;
    private String subject;
    private String message;
    private LocalDateTime time;
    private Flight concernedFlight;
    private List<User> sendTo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Flight getConcernedFlight() {
        return concernedFlight;
    }

    public void setConcernedFlight(Flight concernedFlight) {
        this.concernedFlight = concernedFlight;
    }

    public List<User> getSendTo() {
        return sendTo;
    }

    public void setSendTo(List<User> sendTo) {
        this.sendTo = sendTo;
    }
}
