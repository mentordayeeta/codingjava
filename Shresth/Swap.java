class Swap{
public static void main(String[] args){
    int a = 67;
    int b = 69;
    int c = 64;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    int d = a;
        a = b;
        b = c;
        c = d;
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}}