/*Да се напише и демонстративен клас с main метод в който:
1. Да се състави масив от 10 елемента от тип Person.
2. Да се създадът по два обекта от тип Person, Student и Employee и да се вкарат в масива от хора.
3. Да се обходим масива и в зависимост от това дали обекта е от тип Person, Student или Employee да се извика
съответно метода showPersonInfo, showStudentInfo или showEmployeeInfo.
4. Да се обходи още веднъж масива с хора и за всеки човек, който е работник, да се изведе на екрана сумата,
която му се дължи при 2 часа работа извън работно време.*/

package Java.Homework6;

public class Demo {
    public static void main(String[] args) {
        Person[] people = new Person[10];

        Person ivan = new Person("Ivan", 25, true);
        Person dragan = new Person("Dragan", 35, true);
        Student ivona = new Student("Ivona", 33, false, 5.5);
        Student gabi = new Student("Gabriela", 19, false, 4.75);
        Employee gogo = new Employee("Georgi", 48, true, 1500);
        Employee beni = new Employee("Albena", 35, false, 780);

        people[0] = ivan;
        people[1] = dragan;
        people[2] = ivona;
        people[3] = gabi;
        people[4] = gogo;
        people[5] = beni;

        for (int i = 0; i < people.length; i++) {
            Person p = people[i];
            if (p != null) {
                System.out.println("");
                if (p instanceof Student) {
                    ((Student) p).showStudentInfo();
                    continue;
                }
                if (p instanceof Employee) {
                    ((Employee) p).showEmployeeInfo();
                    continue;
                }
                p.showPersonInfo();
            }
        }

        System.out.println("---------Overtime----------");
        for (int i = 0; i < people.length; i++) {
            Person p = people[i];
            if (p != null && p instanceof Employee) {
                double overtime = ((Employee) p).calculateOvertime(2);
                System.out.println(p.name + " 's overtime is: " + overtime + " \n");
            }
        }
    }
}
