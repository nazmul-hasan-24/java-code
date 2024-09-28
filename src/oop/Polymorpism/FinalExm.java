package oop.Polymorpism;

public  class FinalExm {
    static final int age;
    static{age =33;}

    int res (final int a ){
       
        System.out.println("Res "+a);

return a * a;
    }

    public static void main(String[] args) {
      System.out.println(FinalExm.age);
      FinalExm finalExm = new FinalExm();
      finalExm.res(5);
    }
    
}
