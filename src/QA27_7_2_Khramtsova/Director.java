package QA27_7_2_Khramtsova;

public class Director implements Position {
    private String name;
    private double salary;

    public Director(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void printPosition() {
        System.out.println("Director " + name + " salary: " + salary);
    }
}
