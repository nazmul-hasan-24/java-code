package exam;

 class Question1 {
    public static void main(String[] args) {
        Car car = new Car("BMW", "Adkldf", 2001);
       car.display();
System.out.println(" ");
       car.setMake("Audi");
       car.setModel("A33");
       car.setYear(20000);
       car.display();
       car.getMake();
       car.getModel();
       car.display();
    }
    
}

class Car{
   private String make;
  private  String model;
   private int year;
   Car(String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void setMake( String make){
        this.make= make;
    }
    String  getMake(){
       return make.toLowerCase();
    }

    void setModel(String model){
        this.model = model;
    }

    String getModel(){
        return model.toUpperCase();
    }

    void setYear(int year){
        this.year = year;
    }

    int getYear(){
        return year;
    }
void display(){
    System.out.println("Make: "+make);
    System.out.println("Model: "+model);
    System.out.println("Year: "+year);
}


}