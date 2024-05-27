package QA27_6_2_Khramtsova;


import java.io.PrintStream;

class FlatOwner {
    private final int id;
    private  String name;
    private  String contactNumber;

     public FlatOwner(int id, String name, String contactNumber) {
    this.id = id;
    this.name = name;
    this.contactNumber = contactNumber;
}
    public String getInfo() {
        return "Owner ID: " + id + "\nName: " + name + "\nContact Number: " + contactNumber;
    }

    public void printInfo(PrintStream out) {
        out.println(getInfo());
    }
}
