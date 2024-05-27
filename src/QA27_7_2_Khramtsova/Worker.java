package QA27_7_2_Khramtsova;

public class Worker implements Position {
    private String name;
    private double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void printPosition() {
        System.out.println("Worker " + name + " salary: " + salary);
    }
}
