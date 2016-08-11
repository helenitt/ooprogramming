//Message.java
/**/

public class Message {
	
	private String messRecipient, messSender, messMessage;
	
	public Message(String sender, String recipient, String message) {
		this.messRecipient = recipient;
		this.messSender = sender;
		this.messMessage = message;
	}
	
	public Message(String sender, String recipient) {
		this.messRecipient = recipient;
		this.messSender = sender;
		this.messMessage = "";
	}
	public Message() {
		this("Unkown","Unknown");
	}
	
	public String getMessRecipient() {
		return messRecipient;
	}
	public String getMessSender() {
		return messSender;
	}
	public String getMessMessage() {
		return messMessage;
	}
	public void setMessRecipient() {
		this.messRecipient = messRecipient;
	}
	public void setMessSender() {
		this.messSender = messSender;
	}
	public void setMessMessage() {
		this.messMessage = messMessage;
	}
	public String append(String mess) {
		return messMessage += mess; 
	}
	public String toString() {
		return String.format("Recipient: %-20s\nSender: %-20s\nMessage: %-20s\n",
							 getMessRecipient(), getMessSender(), getMessMessage());
	}
}