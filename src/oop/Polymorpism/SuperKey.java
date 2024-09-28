package oop.Polymorpism;

public class SuperKey {

    
    public static void main(String[] args) {
        Child child =  new Child();
        child.method();
    }
    
}

class Men{

    Men(){
        System.out.println("This is default constructro call automaticly");
    }
    int age = 33;
    void output(){
        System.out.println("Age call from method of parent class :" +age);
    }
}

class Child extends Men{

    int age = 22;
    
    void res(){
        System.out.println("Child age: " +age);
        // call parent class variable by super. var name same also method
        System.out.println("This age from parent class: " + super.age);
    }

    void method(){
        res();
        super.output();
    }
}