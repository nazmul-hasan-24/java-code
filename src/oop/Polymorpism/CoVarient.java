package oop.Polymorpism;

public class CoVarient {
    public static void main(String[] args) {
        A a = new A();
        a.test().output();

        B b = new B();
       b.test().output();

       C c = (C) new C().test();
       c.test().output();
    
       
    }

  
    
}

class A{
    A test(){
        return this;
    }

    void output(){
        System.out.println("Inside of class A");
    }
}

class B extends A{
    @Override
    A test() {
        return this;
    }

    @Override
    void output() {
        System.out.println("Inside of class B");
    }
}

class C extends A{
    @Override
    A test() {
        return this;
    }

    @Override
    void output() {
        System.out.println("Inside of class C");
    }
}
