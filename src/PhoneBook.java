import java.util.Scanner;
public class PhoneBook implements Comparable<PhoneBook>{
		LinkedListADT<Contact> listC;
		Scanner input;
		//Contact c1 = new Contact("bbb", "01234", "ali@x.x", "address1", "birthday1", "notes1");
		public PhoneBook() {
			Scanner input = new Scanner(System.in);
		}
		public boolean addContact() {
			Contact c = new Contact();
			System.out.println("Enter the contact's name: ");
			String name = input.nextLine();
			listC.findFirst();
			for(int i = 0; i < listC.size; i++)
				if(listC.retrieve().getName().compareTo(name) == 0)
					return false;
			System.out.println("Enter the contact's phone number: ");
			String phone = input.nextLine();
			for(int i = 0; i < listC.size; i++)
				if(listC.retrieve().getName().compareTo(name) == 0)
					return false;
			
			System.out.println("Enter the contact's email address: ");
			String email = input.nextLine();
			System.out.println("Enter the contact's address: ");
			String address = input.nextLine();
			System.out.println("Enter the contact's birthday: ");
			String bday = input.nextLine();
			System.out.println("Enter any notes for the contact: ");
			String notes = input.nextLine();
			if(search(c))
			listC.insertSort(c);
		}
		/*public boolean scheduleEvent() {
			System.out.println("Enter event title: ");
			e.setTitle(input.nextLine());
			System.out.println("Enter contact name: ");
			String cName = input.nextLine();
			e.getContact().setName(cName);
			System.out.println("Enter event date and time (MM/DD/YYYY HH:MM): ");
			e.setDate(input.next()); e.setTime(input.next());
			System.out.println("Enter event location: ");
			e.setLocation(input.nextLine());
			
			if(!listC.searchName(cName)) {
				System.out.println("Contact doesn't exist");
				return false;
			}
		}*/
		/*private void Sysout() {
			Sysout(enter title: );
			temptitle
			scheduleEvent(new Event(temptitle, temp))
		}*/
		
}
