package com.bridgelabz.day9;


import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contacts> Book = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public void AddDetails() {

        Scanner scanner = new Scanner(System.in);
        Contacts details = new Contacts();
        System.out.println("Enter the First Name of person");
        details.setFirstName(scanner.nextLine());
        System.out.println("Enter the Last Name of person");
        details.setLastName(scanner.nextLine());
        System.out.println("Enter the Address Name of person");
        details.setAddress(scanner.nextLine());
        System.out.println("Enter the City Name of person");
        details.setCity(scanner.nextLine());
        System.out.println("Enter the State Name of person");
        details.setState(scanner.nextLine());
        System.out.println("Enter the Email of person");
        details.setEmail(scanner.nextLine());
        System.out.println("Enter the Zip code of person");
        details.setZipCode(scanner.nextInt());
        System.out.println("Enter the Phone number of person");
        details.setPhoneNumber(scanner.nextInt());

        Book.add(details);

        System.out.println(Book);
    }


    public void editDetails() {

        System.out.println("Confirm your first name to edit details: ");
        String name = scanner.next();

        for (int i = 0; i < Book.size(); i++) {
            if (Book.get(i).getFirstName().equals(name)) {
                System.out.println("Select form below to change: ");
                System.out.println(
                        "\n1.First Name\n2.Last Name\n3.Address\n4.city\n5.State\n6.Email\n7.Zip\n8.Phone number");
                int check = scanner.nextInt();

                switch (check) {
                    case 1:
                        System.out.println("Enter first name");
                        Book.get(i).setFirstName(scanner.next());
                        break;
                    case 2:
                        System.out.println("Enter Last name");
                        Book.get(i).setLastName(scanner.next());
                        break;
                    case 3:
                        System.out.println("Enter address");
                        Book.get(i).setAddress(scanner.next());
                        break;
                    case 4:
                        System.out.println("Enter city");
                        Book.get(i).setCity(scanner.next());
                        break;
                    case 5:
                        System.out.println("Enter state");
                        Book.get(i).setState(scanner.next());
                        break;
                    case 6:
                        System.out.println("Enter email");
                        Book.get(i).setEmail(scanner.next());
                        break;
                    case 7:
                        System.out.println("Enter Zip");
                        Book.get(i).setZipCode(scanner.nextInt());
                        break;
                    case 8:
                        System.out.println("Enter phone number");
                        Book.get(i).setPhoneNumber(scanner.nextInt());
                        break;
                }

                System.out.println(Book);

            } else
                System.out.println("Enter valid First name");
        }

    }

    /*
     * Purpose : Used output method to display the details
     */
    public void output() {
        // TODO Auto-generated method stub
        System.out.println(Book);
    }

    public static void main(String[] args) {
        int i = 0;

        System.out.println("Welcome to Address Book Management System");

        AddressBook details = new AddressBook();

        while (i == 0) {
            System.out.println("What you want to do: ");
            System.out.println("1.Add details.\n2.Edit details.");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    details.AddDetails();
                    break;
                case 2:
                    details.editDetails();
                    break;
                default:
                    i = 1;
                    System.out.println("Wrong option");
                    details.output();
                    break;
            }
        }

    }
}