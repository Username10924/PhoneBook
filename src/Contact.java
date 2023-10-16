import java.util.Date;
public class Contact implements Comparable<Contact>{
	private String name;
	// phone number is String because 0 is skipped if it's a first integer
	private String phoneNumber;
	private String email;
	private String address;
	private String birthday;
	private String notes;
	public LinkedListADT<Event> events;
	public Contact() {
		this.name = " ";
		this.phoneNumber = " ";
		this.email = " ";
		this.address = " ";
		this.birthday = " ";
		this.notes = " ";
		events = new LinkedListADT<Event>();
	}
	public Contact(String name, String phoneNumber, String email, String address, String birthday, String notes) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.notes = notes;
		events = new LinkedListADT<Event>();
	}
	public boolean addEvent(Event e) {
		if(events.isEmpty()) {
			events.insertSort(e);
			return true;
		}
		events.findFirst();
		while(events.retrieve() != null) {
			if(events.retrieve().getDate().compareTo(e.getDate()) == 0)
				if(events.retrieve().getTime().compareTo(e.getTime()) == 0) 
					return false;
			events.findNext();
		}
		events.insertSort(e);
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}


	@Override
	
	// returns > 0 if o.name becomes BEFORE this.name
	// returns 0 if both are the same
	// returns < 0 if o.name becomes AFTER this.name
	public int compareTo(Contact o) {
       
            return (this.name.compareTo(o.name));   
                                                    

                                                     

        
}}
