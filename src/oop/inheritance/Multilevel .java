package oop.inheritance;

 class Animal  {
    void eat(){
        System.out.println("Eating");
    }
    
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking");
    }
}

class BabyDog extends Dog{  
    void weep(){System.out.println("weeping...");}  
    }  

/**
 * Multilevel 
 */
 class Multilevel  {
public static void main(String[] args) {
    BabyDog babyDog = new BabyDog();
    babyDog.eat();
    babyDog.bark();
    babyDog.weep();
}
    
}