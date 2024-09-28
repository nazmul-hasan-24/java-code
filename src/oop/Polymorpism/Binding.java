package oop.Polymorpism;



class Animal1{
     public static void eat(){
        System.out.println("Animal can eat");
    }
}

class Cat extends Animal1{
 
 public static void eat() {
    System.out.println("Cat drinking milk");
};

    
}

 class Binding {
    //If there is any private, final or static method in a class, there is static binding.
    private void age(){
        System.out.println("Age 12");
    }
    public static void main(String[] args) {
        Animal1 cat = new Cat();
        cat.eat();
        Binding binding = new Binding();
        binding.age();
    }
    
}