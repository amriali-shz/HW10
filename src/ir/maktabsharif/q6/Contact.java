package ir.maktabsharif.q6;

import java.util.HashSet;

public class Contact {
    private String name;
    private HashSet<String> phoneNumbers;

    public Contact(String name) {
        this.name = name;
        this.phoneNumbers = new HashSet<>();
    }

    public void addNumber(String number) {
        phoneNumbers.add(number);
    }


    public String getName() {
        return name;
    }

    public HashSet<String> getNumbers() {
        return phoneNumbers;
    }
}
