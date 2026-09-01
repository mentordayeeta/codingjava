import java.util.Scanner;

public class IFORELSE {
        public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a number!:");
        int var1 = var.nextInt();
        if (var1%2==0){
            System.out.println("ITS EVEN!!!!!!");
        }
        if(var1%2!=0){
            System.out.println("ITS ODD!!!!!!!!!!!!!!!!!!!!!!!!!");
        }
    }
}
