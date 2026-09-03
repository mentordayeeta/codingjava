import java.util.*;

public class MagicSquare {
    public static void main(String[] args) {
        Scanner start=new Scanner(System.in);
        System.out.println("Enter your starting!");
        int start1=start.nextInt();
        int end=start1+8;
        int middle=(start1+end)/2;
        int magicsum=start1+end+middle;
        System.out.println("The End is "+end);
        System.out.println("The Middle is "+middle);
        System.out.println("The Magic Sum is "+magicsum);
        System.out.println("The full magic square is");
        System.out.println((middle+3)+"+"+(start1)+"+"+(middle+1));
        System.out.println((middle-2)+"+"+(middle)+"+"+(middle+2));
        System.out.println((middle+1)+"+"+(end)+"+"+(middle-3));



    }
}
