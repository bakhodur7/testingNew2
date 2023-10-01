package library_project;

public class Test {
    public static void main(String[] args) {
        Book book = new Book();
        book.author = "Leo Tolstoy";
        book.title = "War and Peace";
        book.id = 1;

        Student student = new Student();
        student.name = "John";
        student.studentId = 12345;

        Library library = new Library();
        library.availableBook = book;

        student.display();
        library.lendBook(student);
        student.display();

        library.acceptBook(student);
        student.display();


        Teacher teacher = new Teacher();
        teacher.age = 45;
        teacher.name = "Олег";

        teacher.subject = new Subject();
        teacher.subject.title = "Физика";
        teacher.subject.numOfHours = 16;
        teacher.display();
    }
}