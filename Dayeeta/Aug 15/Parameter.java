import java.util.*;

class Parameter{
    // public static void student(String name, int grade){
    //     System.out.println("My name is "+name+" and I am in grade "+grade+"th");
    // }

    // public static void main(String[] args) {
    //     student("Shayan",10);
    //     student("Shresth", 5);
    // }

    //Check if voter is eligible to vote
    public static String checkEligibility(int age){
        if (age>0 && age<18){
            return "No";
        }
        else {
        return "Yes";
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int a = obj.nextInt();
       System.out.println(checkEligibility(a)); 
    }
}