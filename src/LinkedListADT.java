import java.util.Scanner;
public class LinkedListADT {
	private Node head;
	private Node current;
	private Scanner input;
	public LinkedListADT() {
		head = null;
		current = null;
		input = new Scanner(System.in);
	}
	// O(n)
	public boolean addContact(Contact c) {
		Node temp = new Node (c);
		// if list is empty, simply add and return
		if(head == null) {
			head = temp;
			current = temp;
			return true;
		}
		else {
			current = head;
			// runs through the entire list to check for common #number / name therefore --> O(n)
			while(current.getNext() != null) {
				if(current.getData().compareToIgnoreCase(c) == 0 || current.getData().compareToPhone(c) == 0)
					return false;
				current = current.getNext();
			}
			// Final check for last element (or in case of only element in list)
			if(current.getData().compareToIgnoreCase(c) == 0 || current.getData().compareToPhone(c) == 0)
				return false;
			current.setNext(temp);
			current = temp;
			return true;
		}
	}
	public boolean search() {
		System.out.println("Enter search criteria: ");
		System.out.println("1) Name");
		System.out.println("2) Phone number");
		System.out.println("3) Email address");
		System.out.println("4) Address");
		System.out.println("5) Birthday");
		System.out.print("Enter choice: ");
		int entry = input.nextInt();
		input.nextLine();
		Node temp;
		switch(entry) {
		case 1:
			temp = head;
			System.out.print("Enter name: ");
			String name = input.nextLine();
			while(temp != null) {
				if(temp.getData().getName().equalsIgnoreCase(name)) {
					System.out.println("Contact found!");
					System.out.println("Name: " + temp.getData().getName());
					System.out.println("Phone number: " + temp.getData().getPhoneNumber());
					System.out.println("Email address: " + temp.getData().getEmail());
					System.out.println("Address: " + temp.getData().getAddress());
					System.out.println("Birthday: " + temp.getData().getBirthday());
					System.out.println("Notes: " + temp.getData().getNotes());
					return true;
				}
				temp = temp.getNext();
			}
			System.out.println("Contact not found.");
			return false;
		case 2:
			temp = head;
			System.out.print("Enter number: ");
			String number = input.next();
			while(temp != null) {
				if(temp.getData().getPhoneNumber().equals(number)) {
					System.out.println("Contact found!");
					System.out.println("Name: " + temp.getData().getName());
					System.out.println("Phone number: " + temp.getData().getPhoneNumber());
					System.out.println("Email address: " + temp.getData().getEmail());
					System.out.println("Address: " + temp.getData().getAddress());
					System.out.println("Birthday: " + temp.getData().getBirthday());
					System.out.println("Notes: " + temp.getData().getNotes());
					return true;
				}
				temp = temp.getNext();
			}
			System.out.println("Contact not found.");
			return false;
		case 3:
			temp = head;
			System.out.print("Enter email: ");
			String email = input.next();
			while(temp != null) {
				if(temp.getData().getEmail().equals(email)) {
					System.out.println("Contact found!");
					System.out.println("Name: " + temp.getData().getName());
					System.out.println("Phone number: " + temp.getData().getPhoneNumber());
					System.out.println("Email address: " + temp.getData().getEmail());
					System.out.println("Address: " + temp.getData().getAddress());
					System.out.println("Birthday: " + temp.getData().getBirthday());
					System.out.println("Notes: " + temp.getData().getNotes());
					return true;
				}
				temp = temp.getNext();
			}
			System.out.println("Contact not found.");
			return false;
		case 4:
			temp = head;
			System.out.print("Enter address: ");
			String address = input.nextLine();
			while(temp != null) {
				if(temp.getData().getAddress().equals(address)) {
					System.out.println("Contact found!");
					System.out.println("Name: " + temp.getData().getName());
					System.out.println("Phone number: " + temp.getData().getPhoneNumber());
					System.out.println("Email address: " + temp.getData().getEmail());
					System.out.println("Address: " + temp.getData().getAddress());
					System.out.println("Birthday: " + temp.getData().getBirthday());
					System.out.println("Notes: " + temp.getData().getNotes());
					return true;
				}
				temp = temp.getNext();
			}
			System.out.println("Contact not found.");
			return false;
		case 5:
			temp = head;
			System.out.print("Enter birthday: ");
			String bday = input.next();
			while(temp != null) {
				if(temp.getData().getBirthday().equals(bday)) {
					System.out.println("Contact found!");
					System.out.println("Name: " + temp.getData().getName());
					System.out.println("Phone number: " + temp.getData().getPhoneNumber());
					System.out.println("Email address: " + temp.getData().getEmail());
					System.out.println("Address: " + temp.getData().getAddress());
					System.out.println("Birthday: " + temp.getData().getBirthday());
					System.out.println("Notes: " + temp.getData().getNotes());
					return true;
				}
				temp = temp.getNext();
			}
			System.out.println("Contact not found.");
			return false;
		default:
			System.out.println("Invalid entry!");
			return false;
		}
	}
	
	// O(n), can be O(1) if changed to double linked list
	public boolean remove(){
		System.out.print("Enter phone number: ");
		String number = input.next();
		if(head == null)
			return false;
		Node temp = head.getNext();
		Node prev = head;
		// Incase contact is in head
		if(head.getData().getPhoneNumber().equals(number)) {
			head = current = head.getNext();
			return true;
		}
		else {
			while(temp != null) {
				if(temp.getData().getPhoneNumber().equals(number)){
					prev.setNext(temp.getNext());
					return true;
				}
				prev = temp;
				temp = temp.getNext();
		}
			}
		return false;
}
	}
