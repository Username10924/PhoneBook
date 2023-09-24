
public class testt {

	public static void main(String[] args) {
		Contact c1 = new Contact("c1", "01234", "ali@x.x", "address1", "birthday1", "notes1");
		Contact c2 = new Contact("c2", "56789", "ali@x.x", "address2", "birthday2", "notes2");
		LinkedListADT l = new LinkedListADT();
		l.addContact(c1);
		l.addContact(c2);
		if(l.remove())
			System.out.println("Contact removed successfully.");
		l.search();
	}

}
