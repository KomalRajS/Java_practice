package packageA; 
class Student {
    String name;
    int age;

    public void studentInfo(String name) {
        System.out.println("The name of the student is "+name);
    }

    public void studentInfo(int age) {
        System.out.println("The age of the student is "+age);
    }

    public void studentInfo(String name, int age) {
        System.out.println("The age of the student "+name+" is "+age);
    }
}

public class PolyMorphismIntro {
    public static void main(String[] args) {
    Student s1 = new Student();
    s1.name = "Abc";
    s1.age = 22;
    s1.studentInfo(s1.name, s1.age);

    }
}