package library_project;

public class Book {
    String author;
    String title;
    String category;
    int id;
    int totalRatings;
    int numberOfRatings;

    //Метод описание выводит инфо о книге
    void displayBook() {
        System.out.println("ID: " + id + " | Book: '" + title + "' by Author: '" + author + "'");
    }
}