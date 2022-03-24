package homework.lesson5;

public class bankAccount {
    int id = 10;
    String name = "Petr";
    double balance = 100;



    void popolnenieScheta(double money) {     // Метод пополнение счета

        System.out.println("Balance do popolneniya: " + balance);
        System.out.println("Summa popolneniya: " + money);
        balance += money;
        System.out.println("Balance posle popolneniya: " + balance);
        System.out.println();

    }


    void snyatieSoScheta(double money) {      // Метод снятие со счета
        System.out.println("Balance do snyatia: " + balance);
        System.out.println("Balance umenshaetsya na: " + money);
        balance -= money;
        System.out.println("Balance posle snyatia: " + balance);
        System.out.println();
    }

    void showInfo( ) {

        System.out.println("Номер счета клиента: " + id + " " +"Имя клиента: " + name + " Состояние счета: " + balance);
    }

}



class bankAccountTest {

    public static void main(String[] args) {

        bankAccount MyAccount = new bankAccount();

        MyAccount.popolnenieScheta(30.5);
        MyAccount.snyatieSoScheta(20.5);


    }

}
