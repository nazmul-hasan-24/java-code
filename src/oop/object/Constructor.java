package oop.object;

public class Constructor {
    public static void main(String[] args) {
        MyInfo myInfo = new MyInfo(23, "Nazmul Hasan", 'A');
        myInfo.output();
     
        new MyInfo(55, null, 'D');
       

    }

}


class MyInfo{
    int age;
    String name;
    char bloodGroup;

    MyInfo(int age, String name, char bloodGroup){
        this.age = age;
        this.name = name;
        this.bloodGroup = bloodGroup;
    }
    void output(){
        System.out.println("Age " +age);
        System.out.println("Name " +name);
        System.out.println("Blood group " +bloodGroup);
    }

}