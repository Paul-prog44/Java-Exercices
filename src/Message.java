
public class Message {
	private String sender;
	private String content;
	
	public Message(String sender, String content) {
		this.sender = sender;
		this.content = content;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public String getSender() {
		return this.sender;
	}
	
	public String toString() {
		return "Sender: "+ this.sender + "Content: "+ this.content;
	}
}
