import java.util.*; //First

public class Input {

    //Methods: details() -> Name, Class, Roll No
    public static void details(){
        Scanner abc = new Scanner(System.in);

        System.out.print("Enter Name:");
        String name = abc.nextLine();

        System.out.print("Enter Class:");
        int grade = abc.nextInt();

        System.out.print("Enter Roll:");
        int roll = abc.nextInt();

        System.out.println(name);
        System.out.println(grade);
        System.out.println(roll);
    }

    public static void main(String[] args) {
            details();
            details();
            details();
    }

    // public static void main(String[] args) {
    //     Scanner y = new Scanner(System.in);
    //     System.out.print("Enter Name:");
    //     String z = y.nextLine();
    //     System.out.println(z);
    // }
}
