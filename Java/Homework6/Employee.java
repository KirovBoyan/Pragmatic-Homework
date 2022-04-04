/*Класът Employee да наследява Person и да дефинира: Полета:
– daySalary показва дневната заплата на работника Конструктор, който инициализира всичките му полета (собствени и наследени)
Методи:
В случай че на работник се наложи да работи извън работно време, на него му се дължи допълнителна сума пари (overtime)
за часовете които е работил. Сумата се пресмята по следния начин: ако работника, няма навършени 18 години, дължимата
сума е 0. В противен случай, за всеки отработен час, на работника се заплаща сумата която получава на час
(зависи от дневната заплата) умножена по 1,5.
– метод calculateOvertime(double hours) който пресмята и връща стойността на сумата която му се дължи при работа
извън работно време
– метод showEmployeeInfo(), който показва информация за човека, както и информация за дневната му заплата*/

package Java.Homework6;

public class Employee extends Person {
    double daySalary;

    public Employee(String name, int age, boolean isMan, double daySalary) {
        super(name, age, isMan);
        this.daySalary = daySalary;
    }

    public double calculateOvertime(double hours) {
        if (age < 18) {
            return 0;
        } else {
            return hours * 1.5 * daySalary / 8;
        }
    }

    public void showEmployeeInfo() {
        showPersonInfo();
        System.out.println("Employee's day salary is: " + daySalary);
    }
}
