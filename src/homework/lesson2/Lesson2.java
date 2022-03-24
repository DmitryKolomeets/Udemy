package homework.lesson2;

public class Lesson2 {

    public static void main(String[] args) {

        byte b1 = 12;
        byte b2 = 0B1100;
        byte b3 = 0_14;
        byte b4 = 0XC;


        short s1 = -1300;
        short s2 = -0B010100010100;
        short s3 = -0_2424;
        short s4 = -0X514;


        int i1 = 0;
        int i2 = 0B0;
        int i3 = 0_0;
        int i4 = 0X0;


        long l1 = 123456789L;
        long l2 = 0B0111010110111100110100010101L;
        long l3 = 0_726746425L;
        long l4 = 0X75BCD15L;


        System.out.printf("\n 1. Переменная типа byte \n \n" + "b1=%d; b2=%d; b3=%d; b4=%d; \n", b1, b2, b3, b4);

        System.out.printf("\n 2. Переменная типа short \n \n" + "s1=%d; s2=%d; s3=%d; s4=%d; \n", s1, s2, s3, s4);

        System.out.printf("\n 3. Переменная типа int \n \n" + "i1=%d; i2=%d; i3=%d; i4=%d; \n", i1, i2, i3, i4);

        System.out.printf("\n 4. Переменная типа long \n \n" + "l1=%d; l2=%d; l3=%d; l4=%d; \n", l1, l2, l3, l4);


        float f1 = 56.76F;
        float f2 = -43.52F;

        System.out.printf("\n 5. Переменная типа float \n \n" + "f1=%f; f2=%f; \n", f1, f2);

        double d1 = 90.49D;
        double d2 = -6.01D;

        System.out.printf("\n 6. Переменная типа double \n \n" + "d1=%f; d2=%f; \n", d1, d2);

        boolean boolean1 = true;
        boolean boolean2 = false;

        System.out.printf("\n 7. Переменная типа boolean \n \n" + "boolean1=%b; boolean2=%b; \n", boolean1, boolean2);

        char a = 'a';

        char b = 120;

        char c = '\u0067';

        System.out.printf("\n 8. Переменная типа char \n \n" + "a=%c; b=%c; c=%c; \n", a, b, c);

    }
}
