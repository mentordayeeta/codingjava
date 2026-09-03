import java.util.Scanner;

public class SittingArrangement {
    public static void main(String[] args) {
        Scanner start = new Scanner(System.in);
        System.out.println("Enter a starting seat!:");
        int start1 = start.nextInt();
        Scanner end = new Scanner(System.in);
        System.out.println("Enter a ending seat!:");
        int end1 = end.nextInt();
        if (end1 < start1) {
            System.out.println("Starting is larger than ending,try again.");
        } else if (start1 < end1) {
            System.out.println(((end1 - start1) + 1) + " seats are filled out of " +24);
            if (start1 > 24 || end1 > 24) {
                System.out.println("Too many seats!");
            }
            else if (end1-start1==24){
                System.out.println("All seats filled!");

            }
            else{
                if(end1-start1>18){
                    System.out.println("First,Second and Third rows are filled!");
                }
                else if(end1-start1>12){
                    System.out.println("First and Second rows filled!");

                }
                else if(end1-start1>6){
                    System.out.println("First row filled!");
                }
                else{
                    System.out.println("No rows made...");
                }

            }

        }
    }
}
