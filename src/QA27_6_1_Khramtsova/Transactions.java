package QA27_6_1_Khramtsova;

public class Transactions {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard(1, "1234", 10);
        CreditCard card2 = new CreditCard(2, "2345", 1234);
        CreditCard card3 = new CreditCard(3, "3456", 1723);

        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
        System.out.println();

        card1.deposit(500.0);
        card2.deposit(1000.0);
        card3.withDraw(1500.0);
        System.out.println();

        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}
