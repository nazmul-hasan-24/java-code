package oop.Polymorpism;

public class Overriding1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.run();
        Bike bike = new Bike();
        bike.run();
    }
    
}

class Car{
    void run(){
        System.out.println("Car is running");
    }
}

class Bike extends Car{
    @Override
    void run() {
      System.out.println("Bike is running");
    }
}