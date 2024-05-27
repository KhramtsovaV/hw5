package QA27_7_2_Khramtsova;

public class Accountant implements Position {
    private String name;
    private double salary;

    public Accountant(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void printPosition() {
        System.out.println("Accountant " + name + " salary: " + salary);
    }
}