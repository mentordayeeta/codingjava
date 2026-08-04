//Write a Program to Find Sum of Fibonacci Series Number
// Input n or take n
// Fibonacci number at that positon
import java.util.*;
class Fibonacci 
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner (System.in);
        int a=0,b=1,n,sum=0;
        System.out.println("Enter a number");
        n=obj.nextInt();
        for (int i=1;i<=n;i++)
        {
            sum=a+b;
            System.out.println(sum);
            a=b;
            b=a;
        }
        
    }
}