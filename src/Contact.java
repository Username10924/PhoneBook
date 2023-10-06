
public class Contact implements Comparable<Contact>{
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
		int size = this.getName().length(); 
		int sizeC = o.getName().length(); 
		int compare = 0;
		int compareC = 0;
		for(int i = 0; i < size || i < sizeC; i++) {
			// if statement to ensure no OutOfBound exceptions occur
			if(i < size)
				compare = (int) this.getName().charAt(i);
			if(i < sizeC)
				compareC = (int) o.getName().charAt(i);
			
			// Checking for non-alphabetical characters
			if((compare < 65 || compareC < 65) || (compare > 122 || compareC > 122))
				return 2;
			if((compare > 90 && compare < 97) || (compareC > 90 && compareC < 97))
				return 2;
			// Changing capital letters into small letters
			if(compare > 64 && compare < 91)
				compare += 32;
			if(compareC > 64 && compareC < 91)
				compareC += 32;
			
			if(compare < compareC)
				return 1;
			else if(compare > compareC)
				return -1;
		}
		if(size < sizeC)
			return 1;
		else if(sizeC > size)
			return -1;
		return 0;
	}
}
