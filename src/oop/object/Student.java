

package oop.object;

 class StudentInfo {
String name;
int id;

}

public class Student {

    public static void main(String[] args) {

        //Object and Class Example: Initialization through reference
        StudentInfo info = new StudentInfo();

        info.name = "Nazmul Hasan";

        info.id = 122;

        System.out.println("My name is " +(info.name)+ "and id is " +(info.id));

    }

  

}
