/*Да се напише клас Demo (с main метод), който демонстрира използването на класа Student.*/

package Java.Homework4;

public class StudentDemo {
    public static void main(String[] args) {
        Student maria = new Student("Maria", "Informatics", 21);
        Student bogdan = new Student("Bogdan", "History", 25);
        Student stefan = new Student("Stefan", "Law", 31);

        System.out.println("Maria year in college: " + maria.yearInCollege);
        System.out.println("Maria has a degree: " + maria.isDegree);
        maria.upYear();
        maria.upYear();
        maria.upYear();
        System.out.println("Maria year in college: " + maria.yearInCollege);
        System.out.println("Maria has a degree: " + maria.isDegree);

        System.out.println("Bogdan's money: " + bogdan.money);
        System.out.println("Stefan's money: " + stefan.money);
        bogdan.receiveScholarship(3, 600);
        stefan.receiveScholarship(3, 1200);
        System.out.println("Bogdan's money: " + bogdan.money);
        System.out.println("Stefan's money: " + stefan.money);
    }
}