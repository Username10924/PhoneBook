import java.util.Scanner;
public class PhoneBook{
		LinkedListADT<Contact> listC;
		LinkedListADT<Event> listE;
		static Scanner input;
		//Contact c1 = new Contact("bbb", "01234", "ali@x.x", "address1", "birthday1", "notes1");
		public PhoneBook() {
			input = new Scanner(System.in);
			listC = new LinkedListADT<Contact>();
			listE = new LinkedListADT<Event>();
		}
		public boolean addContact() {
			System.out.println("Enter the contact's name: ");
			String name = input.nextLine();
			listC.findFirst();
			for(int i = 0; i < listC.size; i++) {
				if(listC.retrieve().getName().compareTo(name) == 0) {
					System.out.println("Contact already exists!");
					return false;}
				listC.findNext();
				}
			System.out.println("Enter the contact's phone number: ");
			String phone = input.nextLine();
			listC.findFirst();
			for(int i = 0; i < listC.size; i++) {
				if(listC.retrieve().getPhoneNumber().compareTo(name) == 0) {
					System.out.println("Contact already exists!");
					return false;}
					listC.findNext();
					}
			System.out.println("Enter the contact's email address: ");
			String email = input.nextLine();
			System.out.println("Enter the contact's address: ");
			String address = input.nextLine();
			System.out.println("Enter the contact's birthday: ");
			String bday = input.nextLine();
			System.out.println("Enter any notes for the contact: ");
			String notes = input.nextLine();
			Contact c = new Contact(name, phone, email, address, bday, notes);
			listC.insertSort(c);
			return true;
		}
		public boolean removeContact() {
			System.out.println("Enter contact's name: ");
			String name = input.next();
			Contact c = new Contact();
			c.setName(name);
			c = listC.remove(c);
			if(c != null && c.events != null) {
				c.events.findFirst();
				for(int i = 0; i < c.events.size; i++) {
					if(c.events.retrieve() != null)
						c.events.remove(c.events.retrieve());
					c.events.findNext();
				}
				return true;
			}
			return false;
		}
		public void sss() {
			listC.ssss();
		}
		public boolean scheduleEvent() {
			Event e = new Event();
			System.out.println("Enter event title: ");
			e.setTitle(input.nextLine());
			
			System.out.println("Enter contact name: ");
			String cName = input.nextLine();
			Contact c = new Contact();
			c.setName(cName);
			
			//e.setContact(c);
			System.out.println("Enter event date and time (MM/DD/YYYY HH:MM): ");
			e.setDate(input.next()); e.setTime(input.next());
			input.nextLine();
			
			System.out.println("Enter event location: ");
			e.setLocation(input.nextLine());
			
			if(!listC.search(c)) {
				System.out.println("Contact not found!");
				return false;
			}
			if(listC.retrieve().addEvent(e)) {
				System.out.println("Event scheduled");
				listE.insertSort(e);
				return true;
			}
			System.out.println("Time conflict!");
			return false;
				
		}
	            
		public void printEvents() {
			listE.findFirst();
			for(int i = 0; i < listE.size; i++) {
				System.out.println("Event " + (i+1) + ":");
				System.out.println(listE.retrieve().getTitle());
				listE.findNext();
			}
		}
		public void test() {
			System.out.println(listC.retrieve().events.retrieve().getTitle());
			System.out.println(listC.retrieve().events.retrieve().getDate());
			listC.retrieve().events.findNext();
			System.out.println(listC.retrieve().events.retrieve().getTitle());
			System.out.println(listC.retrieve().events.retrieve().getDate());
		}
		public void eventDetails() {
			System.out.println("Enter search criteria: ");
			System.out.println("1) Contact name: ");
			System.out.println("2) Event title: ");
			int choice = input.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter contact name: ");
				Contact c = new Contact();
				c.setName(input.nextLine());
				boolean found = listC.search(c);
				if(found) {
					System.out.println("Contact found!");
					listC.findFirst();
					for(int i = 0; i < listC.retrieve().events.size; i++) {
						System.out.println("Event " + (i+1) + ":");
						System.out.println(listC.retrieve().events.retrieve().getTitle());
						System.out.println(listC.retrieve().events.retrieve().getContact());
						System.out.println(listC.retrieve().events.retrieve().getDate());
						System.out.println(listC.retrieve().events.retrieve().getTime());
						System.out.println(listC.retrieve().events.retrieve().getLocation());
						listC.findNext();
					}
				}
				else {
					System.out.println("Contact not found");
				}
				break;
			case 2:
				System.out.println("Enter event title: ");
				Event e = new Event();
				e.setTitle(input.nextLine());
				boolean foundE = listE.search(e);
				if(foundE) {
					System.out.println("Event found!");
					System.out.println();
				}
				else {
					System.out.println("Contact not found");
				}
			}
		}
		
}
