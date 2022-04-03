/*Създайте клас Student, описващ студент Класът да има следните полета:
name – име на студента
subject - специалност
grade - успех
yearInCollege – курс
age – години на студента
isDegree – дали е завършил или не
money – пари от стипендии
Класът да дефинира следните конструктори:
-конструктор по подразбиране който задава следните стойностите на полетата: grade = 4.0, yearInCollege = 1,
isDegree = false, money = 0
-констуктор с параметри които извиква конструктора по подразбиране и инициализира(задава първоначални стойности)
останалите полета на класа
Класът да дефинира следните методи:
-метод void upYear() който увеличава годината в колежа с единица, ако студента не е завършил, в противен случай
извежда подходящо съобщение. Ако след увеличаването годината стане 4, задава true на полето isDegree
-метод double receiveScholarship(double min, double amount) – добавя сумата amount кум парите на студента, само ако
успеха му е по-висок или равен на минималния успех подаден като параметър (min) и ако възрастта му е под 30 години.
Метода връща текущите пари на студента (след евентуалното им увеличение)*/

package Java.Homework4;

public class Student {
    String name;
    String subject;
    double grade;
    int yearInCollege;
    int age;
    boolean isDegree;
    double money;

    Student() {
        grade = 4;
        yearInCollege = 1;
        isDegree = false;
        money = 0;
    }

    Student(String name, String subject, int age) {
        this();
        this.name = name;
        this.subject = subject;
        this.age = age;
    }

    void upYear() {
        if (isDegree) {
            System.out.println(name + " already has a degree!");
            return;
        }
        yearInCollege++;
        if (yearInCollege == 4) {
            isDegree = true;
        }
    }

    double receiveScholarship(double min, double amount) {
        if (grade > min && age < 30) {
            money += amount;
        }
        return money;
    }
}