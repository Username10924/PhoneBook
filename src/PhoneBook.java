import java.util.Scanner;
public class PhoneBook{
		static LinkedListADT<Contact> listC = new LinkedListADT<Contact>();
		static LinkedListADT<Event> listE = new LinkedListADT<Event>();
		static Scanner input = new Scanner(System.in);
		public PhoneBook() {
			input = new Scanner(System.in);
			listC = new LinkedListADT<Contact>();
			listE = new LinkedListADT<Event>();
		}
		public static boolean addContact() {
			System.out.println("Enter the contact's name: ");
			// filler solves java bug of skipping input.nextLine()
			String filler = input.nextLine();
			String name2 = input.nextLine();
			
			listC.findFirst();
			// a loop to check if contact name already exists
			for(int i = 0; i < listC.size; i++) {
				if(listC.retrieve().getName().compareTo(name2) == 0) {
					System.out.println("Contact already exists!");
					return false;}
				listC.findNext();
				}
			System.out.println("Enter the contact's phone number: ");
			String phone = input.nextLine();
			listC.findFirst();
			
			// a loop to check if contact phone number already exists
			for(int i = 0; i < listC.size; i++) {
				if(listC.retrieve().getPhoneNumber().compareTo(phone) == 0) {
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
			Contact c = new Contact(name2, phone, email, address, bday, notes);
			listC.insertSort(c);
			return true;
		}
		
		
		public static boolean removeContact() {
            System.out.println("Enter contact's name: ");
            // filler solves java bug of skipping input.nextLine()
            String filler = input.nextLine();
            String name = input.nextLine();
            Contact c = new Contact();
            c.setName(name);
            c = listC.remove(c);
            
            // Incase contact exists but doesn't have events.
            if(c != null && c.events == null) {
            	System.out.println("Contact removed!");
            	return true;
            }
            // Incase contact exists and has events.
            if(c != null && c.events != null) {
                c.events.findFirst();
                while(c.events.retrieve() != null) {
                	listE.remove(c.events.retrieve());
                    c.events.remove(c.events.retrieve());
                
                }

                System.out.println("Contact removed!");
                return true;
            }
            System.out.println("Contact does not exist");
            return false;
            }
		
		public static boolean scheduleEvent() {
			Event e = new Event();
			System.out.println("Enter event title: ");
			// filler solves java bug of skipping input.nextLine()
			String filler = input.nextLine();
			e.setTitle(input.nextLine());
			
			System.out.println("Enter contact name: ");
			String cName = input.nextLine();
			Contact c = new Contact();
			c.setName(cName);
			e.setContact(cName);
			
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
				// Event added to Contact
				System.out.println("Event scheduled");
				listE.insertSort(e);
				// Event added to list of Events.
				return true;
			}
			System.out.println("Time conflict!");
			return false;
				
		}
	            
		public static void printEvents() {
			listE.findFirst();
			// a flag to check if any event exists and print appropriate message
			boolean flag = true;
			for(int i = 0; i < listE.size; i++) {
				System.out.println("Event " + (i+1) + ":");
				System.out.println(listE.retrieve().getTitle());
				listE.findNext();
				flag = false;
			}
			if(flag)
				System.out.println("No events found");
		}
		public static void printContactFName() {
			System.out.println("Enter first name: ");
			String name = input.next();
			// An array to split the full name into first and last name
			String arrName[];
			listC.findFirst();
			// a flag to check if any contact exists and print appropriate message
			boolean flag = true;
			while(listC.retrieve() != null) {
				arrName = listC.retrieve().getName().split(" ");
				if(name.compareToIgnoreCase(arrName[0]) == 0) {
					System.out.println("Contact found!");
					System.out.println("Contact name: " + listC.retrieve().getName());
					System.out.println("Phone Number: " + listC.retrieve().getPhoneNumber());
					System.out.println("Email Address: " + listC.retrieve().getEmail());
					System.out.println("Address: " + listC.retrieve().getAddress());
					System.out.println("Birthday: " + listC.retrieve().getBirthday());
					System.out.println("Notes: " + listC.retrieve().getNotes());
					System.out.println();
					flag = false;
				}
				listC.findNext();
			}
			if(flag) {
				System.out.println("No contacts found");
			}
		}
		public static void eventDetails() {
			System.out.println("Enter search criteria: ");
			System.out.println("1) Contact name: ");
			System.out.println("2) Event title: ");
			int i = 0;
			int choice = input.nextInt();
			input.nextLine();
			switch(choice) {
			case 1:
				System.out.println("Enter contact name: ");
				Contact c = new Contact();
				c.setName(input.nextLine());
				boolean found = listC.search(c);
				if(found) {
					System.out.println("Contact found!");
					c = listC.retrieve();
					
					// if contact exists but has no events
					if(c.events == null) {
						System.out.println("Contact has no events.");
						return;
					}
					c.events.findFirst();
					// Loop to print event details
					while(c != null && c.events.retrieve() != null) {
						System.out.println("Event " + (i+1) + ":");
						System.out.println(c.events.retrieve().getTitle());
						System.out.println(c.events.retrieve().getContact());
						System.out.println(c.events.retrieve().getDate());
						System.out.println(c.events.retrieve().getTime());
						System.out.println(c.events.retrieve().getLocation());
						c.events.findNext();
						i++;
					}
				}
				else {
					System.out.println("Contact not found");
				}
				break;
			case 2:
				System.out.println("Enter event title: ");
				Event e = new Event();
				
				String title = input.nextLine();
				e.setTitle(title);
				boolean foundE = listE.search(e);
				if(foundE) {
					e = listE.retrieve();
					System.out.println("Event found!");
					System.out.println("Event title: " + e.getTitle());
					System.out.println("Contact name: " + e.getContact());
					System.out.println("Event date/time: " + e.getDate() + " " + e.getTime());
					System.out.println("Event location: " + e.getLocation());
				}
				else {
					System.out.println("Event not found");
				}
			}
			
		}
		public static void mainmenu() {
			System.out.println("Please choose an option: ");
			System.out.println("1. Add a contact");
			System.out.println("2. Search for a contact");
			System.out.println("3. Delete a contact");
			System.out.println("4. Schedule an event");
			System.out.println("5. Print event details");
			System.out.println("6. Print contacts by first name");
			System.out.println("7. Print all events alphabetically");
			System.out.println("8. Exit");
			System.out.print("Enter your choice: ");
			
		}
		public static void main(String[] args) {
			int choice = 0;
			do{mainmenu();
			choice = input.nextInt();
			switch(choice) {
			case 1:
				if(addContact())
					System.out.println("Contact added!");
				else
					System.out.println("Contact not added.");
				break;
			case 2:
				listC.search();
				break;
			case 3:
				removeContact();
				break;
			case 4:
				scheduleEvent();
				break;
			case 5:
				eventDetails();
				break;
			case 6:
				printContactFName();
				break;
			case 7:
				printEvents();
				break;
			case 8:
				System.out.println("Goodbye");
				break;
			default:
				System.out.println("Enter a valid choice");
			}
			System.out.println();
			}while(choice != 8);
		}
		
}
