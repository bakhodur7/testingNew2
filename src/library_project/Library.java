package library_project;

public class Library {
    Book availableBook; //В библиотеке только одна книга доступна для выдачи
    Book nextAvailableBook;
    Book nextAvailableBook2;
    void lendBook(Student student){
        if(availableBook != null && student.borrowedBook == null){
            student.borrowedBook = availableBook;

            availableBook = null;
        }else{
            System.out.println("Книга уже взята или студент уже взял книгу.");
        }
    }

    void acceptBook(Student student){
        if(availableBook == null && student.borrowedBook !=null){
            availableBook = student.borrowedBook;
            student.borrowedBook = null;
        }else{
            System.out.println("В библиотеке уже есть книга или у студента нет книги!");
        }
    }
}
