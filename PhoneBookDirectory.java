package first_prg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber;
    }
}

class PhoneBook {
    private List<Contact> contacts;

    public PhoneBook() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
        System.out.println("Contact added: " + contact);
    }

    public void removeContact(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equalsIgnoreCase(name)) {
                System.out.println("Contact removed: " + contacts.get(i));
                contacts.remove(i);
                return;
            }
        }
        System.out.println("Contact not found: " + name);
    }

    public void searchContact(String name) {
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact found: " + contact);
                return;
            }
        }
        System.out.println("Contact not found: " + name);
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Phone book is empty.");
        } else {
            System.out.println("Phone Book Contacts:");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }
}

public class PhoneBookDirectory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        int choice;

        do {
            System.out.println("\nPhone Book Directory");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.addContact(new Contact(name, phoneNumber));
                    break;

                case 2:
                    System.out.print("Enter name of contact to remove: ");
                    String nameToRemove = scanner.nextLine();
                    phoneBook.removeContact(nameToRemove);
                    break;

                case 3:
                    System.out.print("Enter name of contact to search: ");
                    String nameToSearch = scanner.nextLine();
                    phoneBook.searchContact(nameToSearch);
                    break;

                case 4:
                    phoneBook.displayContacts();
                    break;

                case 5:
                    System.out.println("Exiting Phone Book Directory.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
