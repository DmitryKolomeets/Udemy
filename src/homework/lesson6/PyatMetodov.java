package homework.lesson6;

public class PyatMetodov {

    int summa () {

        int i1 = 0;
        System.out.println("Summa = " + i1);
        return i1;
    }

    int summa (int i1) {

        int sum1 = i1;
        System.out.println("Summa 0 i odnogo chisla = " + sum1);
        return sum1;
    }


    int summa(int i1, int i2) {
        int sum2 = 0 + i1 +i2;
        System.out.println("Summa 0 i dvuch chisel = " + sum2);
        return sum2;
    }


    int summa(int i1, int i2, int i3) {
        int sum3 = 0 + i1 + i2 + i3;
        System.out.println("Summa 0 i trech chisel = " + sum3);
        return sum3;


    }

    int summa(int i1, int i2, int i3, int i4) {
        int sum4 = 0 + i1 + i2 + i3 + i4;
        System.out.println("Summa 0 i chetjrech chisel = " + sum4);
        return sum4;



    }

}

class PyatMetodovTest {

    public static void main(String[] args) {

        PyatMetodov pM1 = new PyatMetodov();

        pM1.summa();
        pM1.summa(3);
        pM1.summa(3,5);
        pM1.summa(3,5,7);
        pM1.summa(3,5,7,11);


    }
}
