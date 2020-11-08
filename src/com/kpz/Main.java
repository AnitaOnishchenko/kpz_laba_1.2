package com.kpz;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        var contact = new Contact("Sona", "0986205859", DateHelper.getCurrentDate());
        var copy = (Contact)contact.clone();

        System.out.println("Original " + contact);
        System.out.println("Copy  " + copy);

        System.out.printf("\nReferences are equal: %s%n", copy == contact);
        System.out.printf("Contents are equal: %s%n", copy.equals(contact));

        var date = contact.getCreationDate();
        date.setYear(1900);
        System.out.println("\nOriginal contact date after changing to 1900 \n" + contact.getCreationDate());
    }
}
