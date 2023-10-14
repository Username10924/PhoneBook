
public class testt {

	public static void main(String[] args) {
		Contact c1 = new Contact("bbb", "01234", "ali@x.x", "address1", "birthday1", "notes1");
		Contact c2 = new Contact("bbb", "56789", "ali@x.x", "address2", "birthday2", "notes2");
		Contact c3 = new Contact("ddd", "111111111", "ali@x.x", "address1", "birthday1", "notes1");
		Contact c4 = new Contact("ccc", "5672222289", "ali@x.x", "address2", "birthday2", "notes2");
		Contact c5 = new Contact("fff", "012321434", "ali@x.x", "address1", "birthday1", "notes1");
		Contact c6 = new Contact("aaa", "56742142189", "ali@x.x", "address2", "birthday2", "notes2");
		LinkedListADT<Contact> l = new LinkedListADT<Contact>();
		System.out.println(l.addContact(c1));
		System.out.println(l.addContact(c2));
		System.out.println(l.addContact(c3));
		System.out.println(l.addContact(c4));
		System.out.println(l.addContact(c5));
		System.out.println(l.addContact(c6));
		l.sort();
		l.ssss();
	}

}
