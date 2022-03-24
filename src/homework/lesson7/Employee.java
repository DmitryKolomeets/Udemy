package homework.lesson7;

public class Employee {

    int id;
    public String surname;
    int age;
    private double salary;
    String department;


    public Employee (int id2) {

        id = id2;
    }

    Employee (String surname2) {

        surname = surname2;
    }


    double salaryDouble () {

        salary *= 2;
        return salary;

    }

    public void showSalary() {

        System.out.println(salary);
    }

    public void showSurname () {

        System.out.println(surname);
    }

    public void showId() {

        System.out.println(id);
    }

}

class EmployeeTest {

    public static void main(String[] args) {

    }
}
