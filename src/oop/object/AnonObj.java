package oop.object;

public class AnonObj {
    public static void main(String[] args) {
        new Factorial().ptn();
        new Factorial().fac(5);
        Factorial f1 = new Factorial(), f2 =  new Factorial(), f3 = new Factorial();

        
    }
    
}

class Factorial{
    void ptn(){
        System.out.println("This is anonymous function");
    }
    void fac(int n){
        int mul =1; // Multiply
        for(int i = 1; i <=n; i++){
            mul = mul*i;
            System.out.println("Output " + mul);
            
        }
        
    }
}
