class CheckPrime {
    public static void main(String[] args) {
        int a=5,c=0;
        int y;
        y = obj.check(a);
        print(y)
    }

    public void check(int a){
        for (int i=1;i<=a;i++)
          {
              c++;
          }
          if (c==2)
          System.out.println("Prime");
          else
          System.out.println(" not Prime");

          return c;
    }
}


// Put for loop in a method
// check whether prime is below 50 or above