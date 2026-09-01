import java.util.Scanner;

public class SimpleIntrest {
public static void formula(int loan,int rate,int time){
    System.out.println(loan*rate/100*time);
}
    public static void main(String[] args){
        Scanner loan = new Scanner(System.in);
        System.out.println("Enter a loan!:");
        int loan1 = loan.nextInt();
        Scanner rate = new Scanner(System.in);
        System.out.println("Enter a rate!:");
        int rate1 = rate.nextInt();
        Scanner time = new Scanner(System.in);
        System.out.println("Enter a time!:");
        int time1 = time.nextInt();
        formula(loan1,rate1,time1);
    }
}
