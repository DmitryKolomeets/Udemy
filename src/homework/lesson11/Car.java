package homework.lesson11;

public class Car {

    public String color;
    public String engine;
    public int doorsNumber;

    Car(String color, String engine, int doorsNumber) {
        this.color = color;
        this.engine = engine;
        this.doorsNumber = doorsNumber;

    }

}


class CarTest {


    void ChangeDoorsNumber(Car c, int doorsNumber) {
        c.doorsNumber = doorsNumber;

    }

    void changeColor(Car c1, Car c2) {

        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }


    public static void main(String[] args) {

        CarTest ct = new CarTest();
        Car c1 = new Car ("black", "V4", 3);
        Car c2 = new Car ("red", "V6", 5);
        ct.ChangeDoorsNumber(c1, 6);
        ct.changeColor(c1, c2);
        System.out.println("Информация о первой машине: Цвет " + c1.color + " Мотор " + c1.engine + " количество дверей " + c1.doorsNumber );
        System.out.println("Информация о второй машине: Цвет " + c2.color + " Мотор " + c2.engine + " количество дверей " + c2.doorsNumber );


    }
}
