public class Fibonacci {
    public static void main(String[] args) {
        int start=1;
        int end=1;
        System.out.println(start);
        System.out.println(start+end);
        int newstart=end;
        int newend=start+end;
        System.out.println(newstart+newend);
        start=newend;
        end=newstart+newend;
        System.out.println(start+end);


    }
    
}
