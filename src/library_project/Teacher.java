package library_project;

public class Teacher {
    Subject subject;
    String name; // имя преподавателя
    int age; // возраст

    void display(){
        System.out.println("Название предмета: " + subject.title + ". Количество часов: " + subject.numOfHours);
        System.out.println("Преподавателя зовут: " + name + ". Возраст преподавателя: " + age + " лет");
    }
}
