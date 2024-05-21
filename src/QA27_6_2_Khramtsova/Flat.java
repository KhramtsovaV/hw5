package QA27_6_2_Khramtsova;

import java.io.PrintStream;

public class Flat {
   private final int id;
    private double area;
    private double monthlyCost;
    private Client client;
    private FlatOwner flatOwner;

    public Flat(int id, double area, double monthlyCost) {
        this.id = id;
        this.area = area;
        this.monthlyCost = monthlyCost;
    }

    public Flat(int id, double area, double monthlyCost, Client client, FlatOwner flatOwner) {
        this.id = id;
        this.area = area;
        this.monthlyCost = monthlyCost;
        this.client = client;
        this.flatOwner = flatOwner;
    }

    public String getInfo() {
        String info = "Flat ID: " + id + "\nArea: " + area + " sq.m" + "\nMonthly Cost: $" + monthlyCost;

        if (flatOwner != null) {
            info += "\nOwner Info:\n" + flatOwner.getInfo();
        }

        if (client != null) {
            info += "\nClient Info:\n" + client.getInfo();
        }

        return info;
    }

    public void printInfo(PrintStream out) {
        out.println(getInfo());
    }}


    class Main {
        public static void main(String[] args) {
            Flat flat1 = new Flat(1, 63.0, 450.0);
            flat1.printInfo(System.out);
            System.out.println();

            FlatOwner flatOwner1 = new FlatOwner(1,"Valery","375445348410");
            Client client1 = new Client(1,"Alex",35,true);
            Flat flat2 = new Flat(2, 100.0, 700, client1, flatOwner1);
            flat2.printInfo(System.out);
        }
    }




