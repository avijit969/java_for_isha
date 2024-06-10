public class Demo {
    String name="avi"; // instance variable
    static int age=12; // static variable

    void display(){
        String name= "isha"; // local variable 
        System.out.println(name);
    }

    public static void main(String[] args) {
        System.out.println("Hello isha");
        // declare
        int age=21;
        // initialize
        // age = 20;
        age=30;
        System.out.println("my age is" + age);
    }
}
