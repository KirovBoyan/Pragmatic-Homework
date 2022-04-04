/*Класът Student наследяващ Person, репрезентиращ ученик да има Полета:
– score - показва оценката на ученика (число между 2 и 6, не е задължително да е цяло)
Единствен конструктор:
– Student(String name, int age, boolean isMan, double score) задаващ стойности и на наследените полета
Метод showStudentInfo() който показва информация за човека и информация за оценката му (чрез надписи на екрана)*/

package Java.Homework6;

public class Student extends Person {
    double score;

    public Student(String name, int age, boolean isMan, double score) {
        super(name, age, isMan);
        this.score = score;
    }

    public void showStudentInfo() {
        showPersonInfo();
        System.out.println("The student's score is: " + score);
    }
}