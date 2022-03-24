package homework.lesson4;

public class Test {
    int sum(int a, int b, int c) {

        int result = a + b + c;

        return result;
    }



}

class lesson4test2 {

    public static void main(String[] args) {

        Test t = new Test();

        int summaTrexChisel = t.sum(93,20,47);

        System.out.println(summaTrexChisel);

    }

}
