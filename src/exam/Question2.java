package exam;

public class Question2 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
       Dog dog =  new Dog();
       dog.makeSound();
        
    }
    
}

class Animal{
    void makeSound(){
        System.out.println("Animal can make sound......");
    }
}

class Dog extends Animal{
    @Override
    void makeSound( ) {
        System.out.println("Dog can make sound");
    }
}