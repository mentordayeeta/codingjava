import java.util.*;

    
public class Palindrome {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a number!:");
        int var1 = var.nextInt();
        int origin=var1;
        int reversal=0;
        while(var1!=0){
            int digit=var1%10;
            reversal=reversal*10+digit;
            var1=var1/10;
            
        }
        if (origin==reversal){
            System.out.println("ITS A PALINDROME!YAYYYYYY!");
        }
        else{
            System.out.println("ITS NOT A PALINDROME???????WHAT!!!!!!");
        }

        
    }
}
