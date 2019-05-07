package notification;

/*
 * author CJ Angelina Torres
 * 
 */

public class Notification {

	private String message, id, timeStamp;
	private String sender, receiver;
	private NotificationType type;
	private boolean read=false;
	
	public String getDescription() {
		return message;
	}

	public void setDescription(String description) {
		this.message = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public NotificationType getType() {
		return type;
	}

	public void setType(NotificationType type) {
		this.type = type;
	}

	public boolean isRead() {
		return read;
	}

	public void setRead(boolean read) {
		this.read = read;
	}

	@Override
	public String toString() {
		return "\nMessage: " + this.message + "\nSender: " + this.sender + "\nReceiver: " + this.receiver + "\nTimeStamp: " +this.timeStamp;
	}
	
}
