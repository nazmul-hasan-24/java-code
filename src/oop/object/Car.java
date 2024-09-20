package oop.object;


public class Car {
    public static void main(String[] args) {
    
        CarProperties carProperties = new CarProperties();
        carProperties.initValue("Skudo", 52520, "AB33");
        carProperties.output();
        carProperties = new CarProperties();
        // carProperties.initValue("Toyota", 500000, "A30X");
        carProperties.output();
    }

}

class CarProperties {
    private String name;
    private int price;
    private String model;

    void initValue(String n, int p, String m) {
        name = n;
        price = p;
        model = m;
    }

    void output(){
        System.out.println("Car brand name: " +name);
        System.out.println("Car model: " +model);
        System.out.println("Car price: " +price);
       
    }
}

