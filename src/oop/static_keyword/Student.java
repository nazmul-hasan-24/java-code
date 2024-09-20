package oop.static_keyword;

public class Student {
   public static void main(String[] args) {
    AllStudent s1 = new AllStudent(22, "Hasan");
    AllStudent s2 = new AllStudent(20, "Nazmul");
    // Can also change college name
    s1.ins = "SC";
     s1.display();
     s2.display();

     Count count = new Count();
     Count count2 = new Count();
     Count count3 = new Count();

   }
    
}

class AllStudent{
    String name;
    int roll;
    String ins = "BUET";
    AllStudent(int i, String n){
        roll= i;
        name=n;
    }

    void display(){
        System.out.println("Roll "+roll+ " Name "+name+ " Institute "+ins);
    }
}

class Count{
    static int ct =0;
    Count(){
       ct++;
       System.out.println("Count " +ct);
    }

}
