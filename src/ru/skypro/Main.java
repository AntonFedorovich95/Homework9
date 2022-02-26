package ru.skypro;


public class Main {
    public static void main(String[] args) {
        Book firstBook = new Book("Ono", new Author("Stiven","King"),1986);
        Book secondBook = new Book("Flat World", new Author("Terry","Pratchett"),1983);
        System.out.println("firstBook = " + firstBook);
        System.out.println(secondBook);
        firstBook.setYear(2020);
        System.out.println(firstBook.setYear());
    }
}