package ru.skypro;

public class Book {
    private final String bookname;
    private final Author author;
    private int year;

    public Book (String name, Author author, int year) {
       this.bookname = name;
       this.author = author;
       this.year = year;
    }
    public String getBookname() {
        return bookname;
    }
    public Author getAuthor() {
        return author;
    }
    public int setYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookname='" + bookname + '\'' +
                ", author=" + author +
                ", year=" + year +
                '}';
    }
}
