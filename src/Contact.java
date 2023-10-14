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
	}
	public Contact(String name, String phoneNumber, String email, String address, String birthday, String notes) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.notes = notes;
	}
	public boolean addEvent(Event e) {
		if(events.isEmpty()) {
			events.insertSort(e);
			return true;
		}
		events.findFirst();
		for(int i = 0; i < events.size; i++) {
			if(events.retrieve().getDate().compareTo(e.getDate()) == 0)
				if(events.retrieve().getTime().compareTo(e.getTime()) == 0) 
					return false;
				
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
	/////////////////////////////////////////////////////////////////////////
	// Returns 0 if equal
	public int compareToIgnoreCase(Contact contact) {
        return this.name.compareToIgnoreCase(contact.name);
    }
	public int compareToPhone(Contact contact) {
        return this.phoneNumber.compareToIgnoreCase(contact.phoneNumber);
    }
	////////////////////////////////////////////////////////////////////////
	/*  returns 1 if this.name comes BEFORE o.name
	 	returns -1 if this.name comes AFTER o.name
	 	returns 0 if they are the exact same name
	 	returns 2 if a name contains a non-alphabetical character
	 */
	@Override
	public int compareTo(Contact o) {
        try {
            return (this.name.compareTo(o.name));   // big than zero
                                                    //==0

                                                     //less than zero
        }
        catch (Exception e)
        {
            throw new UnsupportedOperationException("Not supported yet.");
        }
        
}}
