public class Healthba{
    public static void main(String[] args) {
        int Hp=100;
        int Dmg=20;
        int x=1;
        while(Hp!=0){
            System.out.println("You have "+Hp+" health!");
            System.out.println("You have taken "+x+" hits!");
            Hp-=Dmg;
            x+=1;

        }
        System.out.println("You died...");
    }

}