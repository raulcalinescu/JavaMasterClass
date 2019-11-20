package section8.arrays_lists_autoboxing;

import java.util.Scanner;

public class Main_MobilePhoneApp {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("0039 233 4444");

    public static void main(String[] args) {
        boolean quit =false;
        startPhone();
        printActions();

        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0: System.out.println("\n Shutting down...");
                quit = true;
                break;

                case 1:  mobilePhone.printContacts();         //think about where code should be, here we created
                        break;              // a print contacts which should belong to the mobilePhone class

                case 2: addNewContact();
                        break;

                case 3: updateContact();
                        break;

                case 4: removeContact();
                        break;

                case 5: queryContact();
                        break;

                case 6: printActions();
                        break;

            }
        }

    }


    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);   // this is possible as we create a static Contact instance
                        // to createContact
        if(mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added: name - " + name + " phone = " + phone);
        } else {
            System.out.println("Could not add the name typed");
        }
    }

    private static void updateContact() {
        System.out.println("Enter the name for contact to update: ");
        String name = scanner.nextLine();
        System.out.println("Enter the old phone number: ");
        String phone = scanner.nextLine();
        Contact oldContact = Contact.createContact(name, phone);   // this is possible as we create a static Contact instance
        // to createContact

        System.out.println("Enter the name for contact to update: ");
        String newName = scanner.nextLine();
        System.out.println("Enter the old phone number: ");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhone);   // this is possible as we create a static Contact instance
        // to createContact

        mobilePhone.updateContact(oldContact,newContact);
    }

    private static void removeContact() {
        System.out.println("Enter the contact name to be removed: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);


        if (existingContactRecord == null) {
            System.out.println("Contact not found !");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Success");
        }
        else {
            System.out.println("Failure");
        }
    }

    private static void queryContact() {
        System.out.println("Enter the contact name to be removed: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);


        if (existingContactRecord == null) {
            System.out.println("Contact not found !");
            return;
        }


        System.out.println("Name" + existingContactRecord.getName() + "and phone " + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\n Available actions: \n press");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add new contact\n +" +
                           "3 - to update existing contact\n" +
                           "4 - to remove a contact\n" +
                           "5 - to query a contact\n" +
                           "6 - to print Actions again\n");
        System.out.println("Choose your action: ");
    }
}
