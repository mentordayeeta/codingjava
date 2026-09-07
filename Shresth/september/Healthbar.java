import java.util.*;
class Healthbar{
    public static void main(String[] args){
        Scanner x = new Scanner (System.in);
        System.out.println("Enter number to subtract health");
        int y = x.nextInt();
         int r = 100 - y;
        if (r<=0){
            System.out.println("Game over you are dead!");
        }
            else{
            System.out.println("Your"+ r +" hp is left") ;
            }
    }
}