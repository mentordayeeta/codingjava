import java.util.*;

    
public class Palindrome {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a number!:");
        int var1 = var.nextInt();
        int lapseblue=var1;
        int reversalred=0;
        while(var1!=0){
            int digitend=var1%10;
            reversalred=reversalred*10+digitend;
            var1=var1/10;
            
        }
        if (lapseblue==reversalred){
            System.out.println("ITS A PALINDROME!YAYYYYYY!");
        }
        else{
            System.out.println("ITS NOT A PALINDROME???????WHAT!!!!!!");
        }

        
    }
}
