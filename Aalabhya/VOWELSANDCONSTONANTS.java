import java.util.Scanner;

public class VOWELSANDCONSTONANTS {
        public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a letter!:");
        String var1 = var.nextLine();
        if (var1=="a" || var1=="e" || var1=="i" || var1=="o" || var1=="u"){
            System.out.println("ITS A VOWEL!!!!!!!!!!!");
        }
        else{
            System.out.println("ITS A CONSTONANT.........");
        }
    }
}
