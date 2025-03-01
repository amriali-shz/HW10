package ir.maktabsharif.q6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactsManagement {
    public static Scanner input = new Scanner(System.in);
    Map<String, Contact> contactList = new HashMap<>();

    public void addContact() {
        System.out.println("please enter the name of the contact: ");
        String name = input.next();
        System.out.println("please enter the phone number of the contact: ");
        String phoneNumber = input.next();
        contactList.putIfAbsent(name, new Contact(name));
        contactList.get(name).addNumber(phoneNumber);
    }

    public void removeContact() {
        System.out.println("please enter the name of the contact you want to remove: ");
        String name = input.next();
        contactList.remove(name);
    }

    public void showContacts() {
        for (Contact contact : contactList.values()) {
            System.out.println(contact.getName() + " -> " + contact.getNumbers());
        }
    }

    public void editContact() {
        System.out.println("please enter the name of the contact to edit the phone number: ");
        String name = input.next();
        System.out.println("please enter the new phone number of the contact you want to edit: ");
        String phoneNumber = input.next();
        contactList.put(name, new Contact(name));
        contactList.get(name).addNumber(phoneNumber);
    }

    public void findContactByName() {
        System.out.println("please enter the name of the contact you want to find: ");
        String name = input.next();
        for (Contact contact : contactList.values()) {
            if (contact.getName().equals(name)) {
                System.out.println(contact.getName() + " -> " + contact.getNumbers());
            }
        }
    }


    public void findContactByPhoneNumber() {
        System.out.println("Please enter the phone number of the contact you want to find: ");
        String phoneNumber = input.next();
        for (Contact contact : contactList.values()) {
            if (contact.getNumbers().contains(phoneNumber)) {
                System.out.println(contact.getName() + " -> " + contact.getNumbers());
            }
        }
    }

}

