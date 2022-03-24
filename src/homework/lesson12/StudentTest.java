package homework.lesson12;
import lessons.lesson11.Student;

public class StudentTest {

    public static void Sravnenie1(Student st1, Student st2) {

        if (st1.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade)

        {
            System.out.println("Студенты " + st1.name + " и " + st2.name + " равны");
        } else {
            System.out.println("Студенты " + st1.name + " и " + st2.name + " не равны");
        }

    }

    public static void Sravnenie2(Student st1, Student st2) {
        if (st1.equals(st2.name)) {

            if (st1.course == st2.course) {

                if (st1.grade == st2.grade) {


                    System.out.println("Студенты " + st1.name + " и " + st2.name + " равны");}

                else
                {System.out.println("Студенты " + st1.name + " и " + st2.name + " не равны." + " У них разный балл");}}

            else
                System.out.println("Студенты " + st1.name + " и " + st2.name + " не равны." + " У них разный курс");}
        else
            System.out.println("Студенты " + st1.name + " и " + st2.name + " не равны." + " У них разные имена");
    }

    public static void main(String[] args) {

        Student st1 = new Student("Sergei", 4, 2.5);
        Student st2 = new Student("Sergei", 4, 4.5);

//		Sravnenie1(st1, st2);
        Sravnenie2(st1, st2);

    }
}
