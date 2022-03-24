package homework.lesson7_1;

public class EmployeeTest {

    public static void main(String[] args) {

        homework.lesson7.Employee emp1 = new homework.lesson7.Employee(32);
//		homework.lesson7.Employee emp2 = new homework.lesson7.Employee("Rediskin");
//		homework.lesson7.Employee emp3 = new homework.lesson7.Employee(754.95);


//		System.out.println(emp1.id);
        System.out.println(emp1.surname);
//		System.out.println(emp1.salary);

        emp1.showId();
        emp1.showSurname();
        emp1.showSalary();
    }
}
