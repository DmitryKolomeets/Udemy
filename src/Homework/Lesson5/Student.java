package Homework.Lesson5;

public class Student {

    int nomerStudBileta;
    String name;
    String Surname;
    int yearOfStudy;
    // Оценки по 10-бальной системе
    double averageScoreInMath;
    double averageScoreInEconomics;
    double averageGradeInAForeignLanguage;
    double srednyaOcenka;


}

class StudentTest {


    double sredneeArifmiti4eskoe(Student st) { // Метод считает среднее арифмитическое с типом данных Student имя переменной stur

        double srednyaOcenka = (st.averageScoreInMath + st.averageScoreInEconomics + st.averageGradeInAForeignLanguage)/3;

        System.out.println("Srednyaya Arifmiticheskaya Ocenka Studenta: " + st.name +" "+ st.Surname +  " : " + srednyaOcenka);

        return srednyaOcenka;

    }

    public static void main(String[] args) {



        Student st1 = new Student();

        st1.nomerStudBileta = 1;
        st1.name = "Dmitry";
        st1.Surname = "Kolomeets";
        st1.yearOfStudy = 2;
        st1.averageScoreInMath = 3.2D;
        st1.averageScoreInEconomics = 4.5D;
        st1.averageGradeInAForeignLanguage = 3.7;



        Student st2 = new Student();

        st2.nomerStudBileta = 2;
        st2.name = "Ivan";
        st2.Surname = "Petrov";
        st2.yearOfStudy = 3;
        st2.averageScoreInMath = 4.1D;
        st2.averageScoreInEconomics = 4.8D;
        st2.averageGradeInAForeignLanguage = 3.2;


        Student st3 = new Student();

        st3.nomerStudBileta = 3;
        st3.name = "Sergey";
        st3.Surname = "Sidorov";
        st3.yearOfStudy = 5;
        st3.averageScoreInMath = 4.8D;
        st3.averageScoreInEconomics = 4.1D;
        st3.averageGradeInAForeignLanguage = 3.9;


        StudentTest stTest = new StudentTest();

        stTest.sredneeArifmiti4eskoe(st1);
        stTest.sredneeArifmiti4eskoe(st2);
        stTest.sredneeArifmiti4eskoe(st3);




    }
}
