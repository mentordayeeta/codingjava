import java.util.*;

class Input{
    public static void main(String[] x){
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = ob.nextLine();

        System.out.println("Enter your age: ");
        int age = ob.nextInt();

        System.out.println("Hello, " + name + ". You are " + age + " years old."); //Hello, name
    }
}

// import java.util.*; -> Importing Utils package
// Scanner var = new Scanner(System.in); -> Calls the Scanner class using an object "var" and sends the input in Scanner class
// datatype var1 = var.nextLine();
    // String name = var.nextLine(); -> nextLine() reads the data from terminal and stores in variable "name" using "var" object
    // int age = var.nextInt();