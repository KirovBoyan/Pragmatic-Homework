/*Хванете решението на домашното от предишната лекция и я преправете да е енкапсулирана
(с други думи да не можем да достъпваме където каквото си искаме, а да има ограничена видимост особено, като говорим
на полетата).*/

package Java.Homework7;

public class Employee extends Person {
    private double daySalary;

    protected Employee(String setName, int setAge, boolean isMan, double daySalary) {
        super(setName, setAge, isMan);
        this.daySalary = daySalary;
    }

    protected double calculateOvertime(double hours) {
        if (getAge() < 18) {
            return 0;
        } else {
            return hours * 1.5 * daySalary / 8;
        }
    }

    protected void showEmployeeInfo() {
        showPersonInfo();
        System.out.println("Employee's day salary is: " + daySalary);
    }
}