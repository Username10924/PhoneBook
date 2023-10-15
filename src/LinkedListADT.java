import java.util.Scanner;
public class LinkedListADT<T extends Comparable<T>>{
	private Node<T> head;
	private Node<T> current;
	private Scanner input;
	public int size;
	public LinkedListADT() {
		head = null;
		current = null;
		size = 0;
		input = new Scanner(System.in);
	}
	public boolean isEmpty() {
		return head == null;
	}
	public void findFirst() {
		current = head;
	}
	public void findNext() {
		current.setNext(current.getNext());
	}
	public void update (T val) {
        current.setData(val);;
}
	public T retrieve() {
		if(current == null)
			return null;
		return current.getData();
	}
	public boolean insertSort (T val) {

        Node<T> tmp;
        if (isEmpty()) {
                current = head = new Node (val);
        }
        else {
            if ( head.getData().compareTo(val) >0)
            {
                tmp = new Node<T>(val);
                tmp.setNext(head);
                head = tmp;
            }
            else
            {
                Node<T> prev = null;
                current = head;

                while (( current != null ) && (current.getData().compareTo(val) <= 0))
                {
                    prev = current;
                    current = current.getNext();
                }
                tmp = new Node<T> (val);
                if ( current != null)
                {
                    tmp.setNext(current);;
                    prev.setNext(tmp);;
                    current = tmp;
                }
                else
                    current = tmp;
                	prev.setNext(tmp);
            }
        }
        size++;
        return true;
}
	public T remove (T val) {

        if (search (val) == false)
         return null;

        T data = current.getData();

        if (current == head) {
                head = head.getNext();
        }
        else {
                Node tmp = head;

                while (tmp.getNext() != current)
                        tmp = tmp.getNext();

               tmp.setNext(current.getNext());;
        }
        if (current.getNext() == null)
                current = head;
        else
                current = current.getNext();
        size -- ;
        return data;
    }
	public boolean search (T val)
    {
        if (head == null)
            return false;

        Node<T> node  = head;
        while ((node != null) && (node.getData().compareTo(val) != 0))
            node = node.getNext();
        if ((node != null) && (node.getData().compareTo(val) == 0))
        {
            current = node;
            return true;
        }
        return false;
    }
	public boolean searchName() {
		Node<Contact> temp = (Node<Contact>) head;
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
	}
	public boolean searchPhone() {
		Node<Contact> temp = (Node<Contact>) head;
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
	}
	public boolean searchEmail() {
		Node<Contact> temp = (Node<Contact>)head;
		boolean flag = false;
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
				flag = true;
			}
			temp = temp.getNext();
		}
		if(!flag) {
			System.out.println("Contact not found.");
			return false;
		}
		return true;
	}
	public boolean searchAddress() {
		Node<Contact> temp = (Node<Contact>) head;
		boolean flag = false;
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
				flag = true;
			}
			temp = temp.getNext();
		}
		if(!flag) {
			System.out.println("Contact not found.");
			return false;
		}
		return true;
	}
	public boolean searchBirthday() {
		Node<Contact> temp = (Node<Contact>) head;
		boolean flag = false;
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
				flag = true;
			}
			temp = temp.getNext();
		}
		if(!flag) {
			System.out.println("Contact not found.");
			return false;
		}
		return true;
	}
	
	
	public void search() {
		System.out.println("Enter search criteria: ");
		System.out.println("1) Name");
		System.out.println("2) Phone number");
		System.out.println("3) Email address");
		System.out.println("4) Address");
		System.out.println("5) Birthday");
		System.out.print("Enter choice: ");
		int entry = input.nextInt();
		input.nextLine();
		switch(entry) {
		case 1:
			searchName();
			break;
		case 2:
			searchPhone();
			break;
		case 3:
			searchEmail();
			break;
		case 4:
			searchAddress();
			break;
		case 5:
			searchBirthday();
			break;
		default:
			System.out.println("Invalid entry!");
			return;
		}
	}


	
	
	public void ssss() {
		Node<T> temp = head;
		while(temp != null) {
			System.out.println(((Contact)temp.getData()).getPhoneNumber());
			temp = temp.getNext();
		}
	}
	}
