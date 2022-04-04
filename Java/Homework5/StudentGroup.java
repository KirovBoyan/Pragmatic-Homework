/*Като добавка към решението на домашната от Лекция 4. Да се създаде и клас StudentGroup, репрезентиращ група от
студенти от една и съща специалност. Полета на класа:
groupSubject – специалност на студентите в групата
Student[] students – Студенти в групата(масив от обекти от клас Student)
freePlaces – свободни места в групата
Класът да дефинира следните конструктори:
- конструктор по подразбиране който създава места за 5 студента в групата (инициализира полето students с нов масив от
5 елемента) и задава стойност 5 на полето freePlaces
- констуктор StudentGroup(String subject) които първо извиква конструктора по подразбиране и задава стойност на полето
groupSubject
Класът да дефинира следните методи:
- метод void addStudent(Student s) който добавя студент към групата(добавя го към масива на следващата празна позиция)
ако специалността на студента съвпада с тази на групата, и разбира се, ако има свободни места. След добавяне на студент
към групата да се намалят свободните места в групата.
- метод void emptyGroup() който освобождава всички места в групата (задава нов празен масив за полето students) и
задава стойност 5 за полето freePlaces.
- метод theBestStudent() - Връща името на студента с най-висок успех в групата.
- метод printStudentsInGroup() - Изкарва информация (Име, успех, ...)за всички студент в курса.*/

package Java.Homework5;

public class StudentGroup {
    String groupSubject;
    Student[] students;
    int freePlaces;

    StudentGroup() {
        this.students = new Student[5];
        freePlaces = 5;
    }

    StudentGroup(String subject) {
        this();
        this.groupSubject = subject;
    }

    void addStudent(Student s) {
        if (!s.subject.equals(this.groupSubject)) {
            System.out.println(s.name + " has different subject!");
            return;
        }
        if (freePlaces == 0) {
            System.out.println("Sorry there are no free space.");
            return;
        }
        students[students.length - freePlaces] = s;
        freePlaces--;
    }

    void emptyGroup() {
        students = new Student[5];
        freePlaces = 5;
    }

    String theBestStudent() {
        Student bestStudent = students[0];
        for (int i = 1; i < students.length - freePlaces; i++) {
            if (students[i].grade > bestStudent.grade) {
                bestStudent = students[i];
            }
        }
        return bestStudent.name;
    }

    void printStudentsInGroup() {
        for (int i = 0; i < students.length - freePlaces; i++) {
            System.out.println("Name: " + students[i].name + " age: " + students[i].age);
        }
        if (freePlaces == 5) {
            System.out.println("There are no students in this group!");
        }
    }
}