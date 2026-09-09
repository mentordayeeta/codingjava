public class StarAndFizzBuzz {
    public static void main(String[] args) {
        int X=10;
        int Y=10;
        while(Y!=0){
        while(X!=0){
            if(X%2==0){
                System.out.print("#");
                X-=1;
            }
            else{
                System.out.print("*");
                X-=1;
            }
            }
            X=10;
            Y-=1;
            System.out.println();
}
}
} 
