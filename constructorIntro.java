/*  Parameterised constructor
class Student{
    String name;
    int age;

    Student(String n, int a) {
        this.name = n;
        this.age = a;
    }

    public void studentInfo() {
        System.out.println("The age of the student "+this.name+" is "+this.age);
    }
}
public class constructorIntro {
    public static void main(String[] args) {
        Student s1 = new Student("Abc", 21);
        s1.studentInfo();

        Student s2 = new Student("Xyz", 20);
        s2.studentInfo();
    }
}           */

// Copy constructor
class Student {
    String name;
    int age;

    Student() {            // also a non-parameteried constructor
    }

    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    public void studentInfo() {
        System.out.println("The age of the student "+this.name+" is "+this.age);
    }

}
public class constructorIntro {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Abc";
        s1.age = 22;

        Student s2 = new Student(s1);
        
        s1.studentInfo();
        s2.studentInfo();
    }
}