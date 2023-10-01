package library_project;

public class Student {
    String name;
    int studentId; // Номер зачетки
    Book borrowedBook; //каждый студент может взять только одну книгу

    void display() {
        System.out.println("Student: " + name + " | Student ID: " + studentId);
        if (borrowedBook != null) {
            System.out.println("Borrowed Book: ");
            borrowedBook.displayBook();
        } else {
            System.out.println("No book borrowed.");
        }
    }
}