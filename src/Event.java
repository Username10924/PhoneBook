import java.util.Date;
import java.util.Scanner;
public class Event implements Comparable<Event>{
	private String title;
	private Date date;
	private String time;
	private String location;
	private String contact;
	private Scanner input;
	
	public Event() {

	}
	public Event(String title, String date, String time, String location, String contact) {
		super();
		this.title = title;
		this.date = new Date(date);
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
	public Date getDate() {
		return date;
	}
	public void setDate(String string) {
		this.date = new Date(string);
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}

	public String toString() {
		return "\nEvent title: " + title +  
		"\nEvent date and time (MM/DD/YYYY HH:MM): " + date + " " + time +  
	   "\nEvent location: " + location +  
		"\nContacts names: " + contact + "\n";  
	}
	
	// returns > 0 if e.title comes BEFORE this.title
	// returns 0 if both are the same
	// returns < 0 if e.title comes AFTER this.title
	public int compareTo(Event e) {
            return (this.title.compareToIgnoreCase(e.title));
        
    }}
