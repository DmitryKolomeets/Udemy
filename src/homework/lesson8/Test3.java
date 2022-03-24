package homework.lesson8;

public class Test3 {
    public static final double pi = 3.14;

    public double ploshadKruga(double radius) {

        double plKruga = pi * radius * radius;
//		System.out.println("Ploshad kruga = " + plKruga);
        return plKruga;
    }

    static double dlinaOkrugnosti(int radius2) {
        double dlinaKruga = 2 * pi * radius2;
//		System.out.println("Dlina okrugnosti = " + dlinaKruga);
        return dlinaKruga;
    }

    public void infoPoOkrugnosti(int radius3) {
        System.out.println("Radius  kruga = " + radius3);
        System.out.println("Ploshad kruga = " + ploshadKruga(radius3));
        System.out.println("Ploshad kruga = " + dlinaOkrugnosti(radius3));

    }
}

class Test4 {

    public static void main(String[] args) {
        Test3 z = new Test3();
        z.ploshadKruga(5);
        Test3.dlinaOkrugnosti(5);
        z.infoPoOkrugnosti(5);

    }
}
