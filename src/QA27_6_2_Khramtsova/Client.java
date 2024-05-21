package QA27_6_2_Khramtsova;


import java.io.PrintStream;

 class Client {
     private final int id;
     private String name;
     private  int age;
     private  boolean registeredInSpace;

     public Client(int id, String name,int age, boolean registeredInSpace) {
         this.id = id;
         this.name = name;
         this.age = age;
         this.registeredInSpace = registeredInSpace;
     }
     

     public String getInfo() {
         return "Client ID: " + id + "\nName: " + name + "\nAge: " + age + "\nResident: " + registeredInSpace;
     }

     public void printInfo(PrintStream out) {
         out.println(getInfo());
     }
}
