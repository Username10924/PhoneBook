import java.util.Scanner;
public class Event {
	private String title;
	private String date;
	private String time;
	private String location;
	private Contact contact;
	private Scanner input;
	public Event(String title, String date, String time, String location, Contact contact) {
		super();
		this.title = title;
		this.date = date;
		this.time = time;
		this.location = location;
		this.contact = contact;
		input = new Scanner(System.in);
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
}
