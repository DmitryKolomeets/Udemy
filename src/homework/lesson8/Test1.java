package homework.lesson8;

public class Test1 {

    static int umnogenie(int a, int b, int c) {
        return a * b * c;


    }


    static  void delenie(int d, int e) {
        int celayaChastOtDeleniya = d / e;
        int drobnayaChastOtDeleniya = d % e;
        System.out.println("Celaya chast ot deleinya = " + celayaChastOtDeleniya + " Ostatok ot deleniya = " + drobnayaChastOtDeleniya);

    }
}



class Test2 {
    public static void main(String[] args) {

        System.out.println(Test1.umnogenie(5, 3, 8));
        Test1.delenie(10, 3);
        System.out.println(Test1.umnogenie(15, 6, 12));
        Test1.delenie(15, 7);
    }
}
