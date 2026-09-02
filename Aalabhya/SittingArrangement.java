import java.util.Scanner;

public class SittingArrangement {
    public static void main(String[] args) {
        int benchrow = 4;
        int benchcolumn = 6;
        Scanner start = new Scanner(System.in);
        System.out.println("Enter a starting seat!:");
        int start1 = start.nextInt();
        Scanner end = new Scanner(System.in);
        System.out.println("Enter a ending seat!:");
        int end1 = end.nextInt();
        if (end1 < start1) {
            System.out.println("Starting is larger than ending,try again.");
        } else if (start1 < end1) {
            System.out.println(((end1 - start1) + 1) + " seats are filled out of " + benchrow * benchcolumn);
            if (start1 > 24 || end1 > 24)
                ;
            System.out.println("Too many seats!");
        }
    }
}
