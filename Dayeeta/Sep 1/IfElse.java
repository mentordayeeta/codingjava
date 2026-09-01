import java.util.*;

public class IfElse {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = obj.nextInt();

        if (age>18){
            System.out.println("You are eligible to vote");
        }
        else if (age==18) {
            System.out.println("Congratulations! You turned 18! Eligible to vote now!");
        }
        else {
            System.out.println("You are too young to vote");
        }
    }
}
