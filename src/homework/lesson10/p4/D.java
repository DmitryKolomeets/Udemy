package homework.lesson10.p4;

import homework.lesson10.p1.A;
import homework.lesson10.p1.p2.p3.C;
import homework.lesson10.p4.p5.*;
import static homework.lesson10.p1.p2.B.*;


public class D {

    public static void main(String[] args) {

        C c1 = new C("Ivan", "Loev", 5); // доступ к конструктору класса С
        System.out.println(c1.age);

        System.out.println();

        System.out.println(c1.summaChetjrex(10, 20, 30, 40)); // Доступ к методу из класса С

        A a1 = new A(); // создаем объект класса А
        a1.udvoenie(5); // запускаем метод класса А
        System.out.println(a1.udvoenie(6));
        System.out.println(a1.d1);   // выводим переменную класса А

        E e1 = new E(); // создаем объект класса Е
        System.out.println(e1.summaTrechChisel(4, 6, 7)); // используем метод класса Е
        System.out.println(e1.eTest);


        // создаем объект класса В
        System.out.println(delenie(12.45, 45.93));
        System.out.println(i1);
        System.out.println(d1);
        System.out.println(bTest);
    }
}
