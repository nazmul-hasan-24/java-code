public class Grabage {
    public static void main(String[] args) {
        GC gc1 = new GC();
        gc1.details("Nazmul Hasan", 22);
      GC  gc2 = gc1;
      gc2.details("Hridoy" , 18);
      gc1 = gc2 = null;
      System.gc();

    }
}


class  GC {
    String name;
    int age;

    public  void  details(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("My name is " +name);
        System.out.println("My age is " +age);
    }
}