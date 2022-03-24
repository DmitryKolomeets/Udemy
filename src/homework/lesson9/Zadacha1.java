package homework.lesson9;

public class Zadacha1 {

    public static void abc( ) {

        String s1 = new String("ABC");
        String s2 = new String("DEF");
    }



    public static void main(String[] args) {
        Zadacha1 z1 = new Zadacha1();    // Объект живит до фигурной скобки
        abc();                           // Метод умирает сразу после завершения, т.е. в конце этой строки
        abc();                           // Метод умирает сразу после завершения, т.е. в конце этой строки
        String s1 = new String("ABC");   // Объект живит до фигурной скобки
        abc();                           // Метод умирает сразу после завершения, т.е. в конце этой строки




    }
}
