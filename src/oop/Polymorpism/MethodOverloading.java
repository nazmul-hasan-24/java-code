package oop.Polymorpism;

 class MethodOverloading {
    public static void main(String[] args) {
        Adder.output();
       System.out.println( Adder.add(2, 30));
       System.out.println( Adder.add(2, 30, 4));
    }
   
    
}


class Adder{
    static int add (int a, int b){
        return a + b;

    }

    static int add (int a, int b, int c){
        return (a + b) * c;
    }
    static double add(double a, double b){
        return a+b;
    }

 static void output(){
    System.out.println(" Two param " + add(10, 20));
    System.out.println(" Three param " + add(10, 20, 5));

 }
}