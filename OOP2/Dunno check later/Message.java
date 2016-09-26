//Message.java
/**/

public class Message {
	
	private String messSender, messRecipient, messMessage;
	
	public String getMessSender() {
		return messSender;
	}
	public String getMessRecipient() {
		return messRecipient;
	}
	public String getMessMessage() {
		return messMessage;
	}
	public void setMessSender() {
		this.messSender = messSender;
	}
	public void setMessRecipient() {
		this.messRecipient = messRecipient;
	}
	public void setMessMessage() {
		this.messMessage = messMessage;
	}
	public Message(String messSender, String messRecipient, String messMessage) {
		this.messSender = messSender;
		this.messRecipient = messRecipient;
	}
	public Message() {
		this("Unkown","Unknown","Unknown");
	}
	public String toString() {
		return String.format("Recipient: %-20s\nSender: %-20s\nMessage: %-20s\n");
	}
}