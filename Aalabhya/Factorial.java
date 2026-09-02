import java.util.Scanner;

public class Factorial {
    public static void factorial(int a,int b) {
        while (b>0){
        a*=b;
        b--;
        }
        System.out.println(a);
        
        
    }
    public static void factorialagain(int b){
        int a=1;
        for (int i=1;i<=b;i++){
            a=a*i;

        }
        System.out.println(a);
    }
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a number!:");
        int var1 = var.nextInt();
        //while (var1>0){
        //a*=var1;
        //var1--;
        //}
        //System.out.println(a);
        factorial(1,var1);
        factorialagain(var1);
    }
}
