package oop.constructor;

public class ConsCopy {

    public static void main(String[] args) {

        Trees trees= new Trees(12, "Banan", 11);
        trees.output();
        Trees trees2 = new Trees( trees);
        trees2.output();
    
    }
    
}

class Trees{
    private int id;
    private String name;
    private int age;
    // Default Constructor
Trees(){
    super();
    System.out.println("This is Default Cons");
}

    Trees(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
Trees(Trees t){
id = t.id;
name = t.name;
age =t.age;

}

void output(){
    System.out.println("Id " +id + " " +name + " " +age);
}

}