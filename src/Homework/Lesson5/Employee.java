package Homework.Lesson5;

public class Employee {

    int id;
    String surname;
    int age;
    double salary;
    String department;


    Employee (int id2, String surname2, int age2, double salary2, String department2) {

        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;

    }

    double salaryDouble () {

        salary *= 2;
        return salary;

    }

}

class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee (12, "Kutuzov", 18, 324.19, "IT");
        Employee emp2 = new Employee (75, "Xarlamov", 34, 879.73, "Media");

        emp1.salaryDouble();
        System.out.println(emp1.surname + " New ZP " + emp1.salary);

        emp2.salaryDouble();
        System.out.println(emp2.surname + " New ZP " + emp2.salary);

    }
}
