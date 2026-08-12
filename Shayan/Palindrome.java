//Write a Java method isPalindrome that takes a string as input and determines whether it is a palindrome.
//  A string is a palindrome if it reads the same forward and backward.
import java.util.*;
class Palindrome
{
    public static boolean isPalindrome(int g)
     {
         Scanner y = new Scanner (System.in);
      int sum=0,a,b,temp;
      System.out.println("Enter any number");
      int k=y.nextInt();
      temp=k;
      while (k>0)
      {
        a=k%10;
        sum = (sum*10)+a;
        k=k/10;
      }
      if (sum==temp)
      System.out.println("palindrome number");
      else
      System.out.println("not a palindrome number");
     
     }
    public static void main(String args[])
    {
        
        System.out.println(isPalindrome(1));
    } 
}