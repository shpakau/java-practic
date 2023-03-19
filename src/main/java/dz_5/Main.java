package dz_5;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private HashMap<String, ArrayList<String>> contacts;

    public Main() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        if (contacts.containsKey(name)) {
            ArrayList<String> phones = contacts.get(name);
            phones.add(phone);
        } else {
            ArrayList<String> phones = new ArrayList<>();
            phones.add(phone);
            contacts.put(name, phones);
        }
    }

    public ArrayList<String> getPhones(String name) {
        return contacts.get(name);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public void printContacts() {
        ArrayList<String> sortedKeys = new ArrayList<>(contacts.keySet());
        Collections.sort(sortedKeys);
        for (String name : sortedKeys) {
            System.out.print(name + ": ");
            ArrayList<String> phones = contacts.get(name);
            for (String phone : phones) {
                System.out.print(phone + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main phonebook = new Main();
        phonebook.addContact("Иван Иванов", "91546-24-19");
        phonebook.addContact("Светлана Петрова", "91512-34-5678");
        phonebook.addContact("Иван Иванов", "91725-44-4862");
        phonebook.addContact("Иван Иванов", "91545-29-19");
        phonebook.addContact("Кристина Белова", "91517-01-5678");
        phonebook.addContact("Анна Мусина", "91725-44-1594");
        phonebook.addContact("Иван Юрин", "91546-24-1913");
        phonebook.addContact("Анна Крутова", "91519-34-5666");
        phonebook.addContact("Кристина Белова", "91744-44-4444");

        phonebook.printContacts();
    }
}