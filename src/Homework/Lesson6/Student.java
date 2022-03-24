package Homework.Lesson6;

public class Student {

    int nomerStudBileta;
    String name;
    String Surname;
    int yearOfStudy;
    double averageScoreInMath;
    double averageScoreInEconomics;
    double averageGradeInAForeignLanguage;
    double srednyaOcenka;

    double sredneeArifmiti4eskoe(double a, double b, double c) { // Метод считает среднее арифмитическое
        double srednyaOcenka = ((a + b + c)/3);
        System.out.println("Фамилия студента: " + Surname + " Средний балл по трем предметам: " + srednyaOcenka);
        return srednyaOcenka;
    }

    void showInfo() {
        System.out.println("Фамилия студента: " + Surname + " Средний балл по трем предметам: " + srednyaOcenka);
    }



    // ниже создаем три вида конструкторов


    Student (int id, String name1, String surname1, int course, double sredneeMath, double sredneeEcnonomics, double srendeeYazjki) {

        nomerStudBileta = id;
        name = name1;
        Surname = surname1;
        yearOfStudy = course;
        averageScoreInMath = sredneeMath;
        averageScoreInEconomics = sredneeEcnonomics;
        averageGradeInAForeignLanguage = srendeeYazjki;

    }

    Student (int id2, String name2, String surname2, int course2) {

        this (id2,  name2, surname2, course2, 0.0, 0.0, 0.0);


    }

    Student () {

    }
}

class StudentTest {

    public static void main(String[] args) {




//		double srednyaOcenka4 = student4.sredneeArifmiti4eskoe(student4.averageScoreInMath, student4.averageScoreInEconomics, student4.averageGradeInAForeignLanguage);

//		double srednyaOcenka5 = student5.sredneeArifmiti4eskoe(student5.averageScoreInMath, student5.averageScoreInEconomics, student5.averageGradeInAForeignLanguage);

//		double srednyaOcenka6 = student6.sredneeArifmiti4eskoe(student6.averageScoreInMath, student6.averageScoreInEconomics, student6.averageGradeInAForeignLanguage);

        Student st1 = new Student(34, "Alexander", "Glutskij", 4, 9.3, 6.3, 5.4);
        System.out.println(st1.name);
        System.out.println();

        Student st2 = new Student(26, "Ivan", "Korsuncev", 2, 0.0, 0.0, 0.0);
        System.out.println(st2.nomerStudBileta);
        System.out.println();

        Student st3 = new Student();
        System.out.println(st3.Surname);
        System.out.println();


    }
}
