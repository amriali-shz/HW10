package ir.maktabsharif.q6;

import java.util.Scanner;

public class Application {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hi. Welcome to your Contact Management System!");
        printMenu();
        menuSwitch();
    }

    public static void printMenu() {
        System.out.println("""
                Please enter the following numbers to do what you want to do:
                1) Add contact
                2) Edit contact
                3) Show contact List
                4) find contact (by name)
                5) find contact (by phone number)
                6) remove contact
                7) Exit
                """);
    }

    public static void menuSwitch() {
        ContactsManagement contactsManagement = new ContactsManagement();
        while (true) {
            printMenu();
            System.out.println("Choose the number: ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    contactsManagement.addContact();
                    break;
                case 2:
                    contactsManagement.editContact();
                    break;
                case 3:
                    contactsManagement.showContacts();
                    break;
                case 4:
                    contactsManagement.findContactByName();
                    break;
                case 5:
                    contactsManagement.findContactByPhoneNumber();
                    break;
                case 6:
                    contactsManagement.removeContact();
                    break;
                case 7:
                    break;
                default :
                    System.out.println("Invalid choice");
            }
        }
    }

}