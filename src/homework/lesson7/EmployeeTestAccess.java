package homework.lesson7;

public class EmployeeTestAccess {

    public static void main(String[] args) {

        Employee emp1 = new Employee(56);
        Employee emp2 = new Employee("Ivanov");
//		Employee emp3 = new Employee(56.78);

        System.out.println(emp1.id);
        System.out.println(emp1.surname);
//	     System.out.println(emp1.salary);

        System.out.println(emp2.id);
        System.out.println(emp2.surname);
//	     System.out.println(emp2.salary);


        emp1.showId();
        emp1.showSurname();
        emp1.showSalary();

        emp2.showId();
        emp2.showSurname();
        emp2.showSalary();


    }
}
