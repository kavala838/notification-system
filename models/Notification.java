package models;

// SRP: This class has one reason to change: if the structure of a notification changes.
public class Notification {
    private String message;
    private String recipient;

    public Notification(String message, String recipient) {
        this.message = message;
        this.recipient = recipient;
    }

    public String getMessage() { return message; }
    public String getRecipient() { return recipient; }
}
