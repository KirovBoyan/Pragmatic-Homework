/*Да се напише клас College (с main метод), който демонстрира използването
на класовете Student и StudentGroup
(Създава няколко студента, добавя стипендия на някои от тях, прехвърля
някои от тях в по-горна година. Създава няколко групи от студенти, добавя
студенти в тях, изкарва името на най-добрия студент от някоя от групите....)*/

package Java.Homework5;

public class College {
    public static void main(String[] args) {
        Student maria = new Student("Maria", "Informatics", 21);
        Student georgi = new Student("Georgi", "Informatics", 23);
        Student petrana = new Student("Petrana", "Mathematics", 24);

        System.out.println("Maria year in college: " + maria.yearInCollege);
        maria.upYear();
        maria.upYear();
        System.out.println("Maria year in college: " + maria.yearInCollege);

        System.out.println("Petrana's money: " + petrana.money);
        petrana.receiveScholarship(3, 200);
        System.out.println("Petrana's money: " + petrana.money);

        StudentGroup informatics = new StudentGroup("Informatics");
        informatics.addStudent(maria);
        informatics.addStudent(georgi);
        informatics.addStudent(petrana);
        System.out.println(informatics.students[1].name);

        String bestStudent = informatics.theBestStudent();
        System.out.println("The best student is: " + bestStudent);
        informatics.printStudentsInGroup();

        informatics.emptyGroup();
        informatics.printStudentsInGroup();
    }
}