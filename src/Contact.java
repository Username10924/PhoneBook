
public class Contact implements Comparable{
	private String name;
	// phone number is String because 0 is skipped if it's a first integer
	private String phoneNumber;
	private String email;
	private String address;
	//birthday string??
	private String birthday;
	private String notes;
	public Contact(String name, String phoneNumber, String email, String address, String birthday, String notes) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
		this.birthday = birthday;
		this.notes = notes;
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
	
	// Returns 0 if equal
	public int compareToIgnoreCase(Contact contact) {
        return this.name.compareToIgnoreCase(contact.name);
    }
	public int compareToPhone(Contact contact) {
        return this.phoneNumber.compareToIgnoreCase(contact.phoneNumber);
    }
}
