/*Хванете решението на домашното от предишната лекция и я преправете да е енкапсулирана
(с други думи да не можем да достъпваме където каквото си искаме, а да има ограничена видимост особено, като говорим
на полетата).*/

package Java.Homework7;

public class Student extends Person {
    private double score;

    protected Student(String setName, int setAge, boolean isMan, double score) {
        super(setName, setAge, isMan);
        this.score = score;
    }

    protected void showStudentInfo() {
        showPersonInfo();
        System.out.println("The student's score is: " + score);
    }
}