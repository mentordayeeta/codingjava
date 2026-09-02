

import java.util.Scanner;

public class Whilelooping {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a number!:");
        int var1 = var.nextInt();
        while (var1>0){
            System.out.println(var1);
            var1--;
       }
    }
    
}
