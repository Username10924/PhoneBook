import java.util.Scanner;
public class PhoneBook {
		LinkedListADT<Contact> listC;
		Scanner input;
		//Contact c1 = new Contact("bbb", "01234", "ali@x.x", "address1", "birthday1", "notes1");
		public PhoneBook() {
			Scanner input = new Scanner(System.in);
		}
		public boolean scheduleEvent() {
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
		}
		/*private void Sysout() {
			Sysout(enter title: );
			temptitle
			scheduleEvent(new Event(temptitle, temp))
		}*/
		
}
