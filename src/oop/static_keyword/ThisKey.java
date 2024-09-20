package oop.static_keyword;

public class ThisKey {
    public static void main(String[] args) {
        Thiss thiss = new Thiss(11, "Hasan", 100);
        thiss.result();
        
    }
    
}

class Thiss{

    int id;
    String name;
    float blance;
    // If  here not use this no effect 
    Thiss(int id, String name, float blance){
        this.id = id;
        this.name = name;
        blance = blance;
    
    }

    void result(){
        System.out.println(" Id: "+id+ " Name: "+name+ " Blance: "+blance);
    }
}