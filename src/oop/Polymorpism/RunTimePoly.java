package oop.Polymorpism;


//Java Runtime Polymorphism Example
public class RunTimePoly {
    public static void main(String[] args) {
        Anima anima = new Anima();
        anima.animal();
        anima = new Dog();
        anima.animal();
        System.out.println(anima.age);
        anima = new Cat();
        anima.animal();
    }
    
}

class Anima{
    int age = 44;
    void animal(){
        System.out.println("Animal class");
    }
}

class Dog extends Anima{
    //A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.
    int age = 22;
    @Override
    void animal() {
        System.out.println("Dog class");
    }
}

class Cat extends Anima{
    @Override
    void animal() {
        System.out.println("Cat class");
    }
}