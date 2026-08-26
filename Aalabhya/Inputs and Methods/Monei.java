public class Monei {
    public static void change(double inr){
        double usd=inr/100;
        double yen=inr*1.67;
        double euro=inr*0.0090;
        System.out.println("USD:"+usd);
        System.out.println("Yen:"+yen);
        System.out.println("Euro:"+euro);
    }
    public static void main(String[] args) {
        change(999999999);
    }

    
}
