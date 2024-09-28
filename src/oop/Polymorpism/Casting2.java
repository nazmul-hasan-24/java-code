package oop.Polymorpism;

 class Casting2 {
public static void main(String[] args) {
    Interface i = new B();
    // Interface a = new A();
    Casting c = new Casting();
    c.casting(i);
    // c.casting(a);
}
    
} 

 interface  Interface  {

    
}

class A implements Interface{
    public void a(){
        System.out.println("Printing class of a");
    }

}
class B implements Interface{
    void b (){
        System.out.println("Printing of class B");
    }
}

class Casting {
    void casting(Interface i){
        if (i instanceof A) {
            A a = (A) i;
            a.a();
            
        } else{
            System.out.println("Down casting not works");
        }

        if (i instanceof B) {
            B b = (B)i;
            b.b();

        } else{
            System.out.println("B not work");
        }  
       
    }
}