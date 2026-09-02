import java.util.Scanner;

public class Digitsum {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a number!:");
        int var1 = var.nextInt();
        int a=0;
        while (var1>0){
            a+=var1%10;
            var1=var1/10;
        }
        System.out.println(a);

    }
}
