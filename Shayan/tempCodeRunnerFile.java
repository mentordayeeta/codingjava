//ques1
//Find the sum of all digits in a number.
//Example:
//12345
//1+2+3+4+5 = 15
 
 import java.util.*;
 class ques1
 {
    public static void main(String args[])
    {
        Scanner obj= new Scanner (System.in);
        System.out.println("Enter any number: ");
        int n=obj.nextInt();
        int sum=0,d,f;
        while(n!=0)
        {
            d=n%10;
            f=n/10;
            sum=f+d;
        }
        System.out.println("The sum of all digits is : "+sum);
    }
 }