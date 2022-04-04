/*Хванете решението на домашното от предишната лекция и я преправете да е енкапсулирана
(с други думи да не можем да достъпваме където каквото си искаме, а да има ограничена видимост особено, като говорим
на полетата).*/

package Java.Homework7;

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
                System.out.println(p.getName() + " 's overtime is: " + overtime + " \n");
            }
        }
    }
}