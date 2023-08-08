/*  class Student {
    String name;
    int age;

    public void studentInfo() {
        System.out.println("The name of the student is "+this.name);
        System.out.println();
        System.out.println("The age of the student is "+this.age);
    }
}
public class objectClassIntro {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abc";
        s1.age = 21;

        Student s2 = new Student();
        s2.name = "Xyz";
        s2.age = 22;

        s1.studentInfo();
        s2.studentInfo();
    }
}              */

class Pen {
    String colour;
    int price;

    public void penInfo() {
        System.out.println("The price of "+this.colour+" pen is Rs."+this.price);
    }
}
public class objectClassIntro {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.colour = "blue";
        p1.price = 10;

        Pen p2 = new Pen();
        p2.colour = "black";
        p2.price = 7;

        Pen p3 = new Pen();
        p3.colour = "red";
        p3.price = 15;

        p1.penInfo();
        p2.penInfo();
        p3.penInfo();
    }
}
