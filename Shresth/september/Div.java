import java.util.*;
class Div{
    public static void main(String[] args){
        Scanner y = new Scanner(System.in);
        System.out.println("Enter divsor");
        float divisor = y.nextFloat();
        System.out.println("Enter dividend");
        float dividend = y.nextFloat();
        System.out.println(dividend%divisor);
        System.out.println(dividend/divisor);
    }
}