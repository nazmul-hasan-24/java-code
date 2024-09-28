package oop.Polymorpism;

public class SuperExm {
    public static void main(String[] args) {

        Employee employee = new Employee(20000, " Nazmul Hasan ", 20, " Single ");
        System.out.println(employee);
        employee.res();
    }
}

class Person {
    String name;
    int age;
    String relationship;

    Person(String name, int age, String relationship

    ) {
        this.name = name;
        this.age = age;
        this.relationship = relationship;
    }
}

class Employee extends Person {
    float salary;

    Employee(float salary, String name, int age, String rel) {

        super(name, age, rel);
        this.salary = salary;

    }

    void res() {
        System.out.println(name + age + " " + salary + relationship);
    }

    @Override
    public String toString() {
        return " Employee[ name " + name + " Age " + age + " Salary " + salary + " Relationship " + relationship + "]";
    }

}