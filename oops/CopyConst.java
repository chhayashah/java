public class CopyConst {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "chhaya";
        s1.roll = 23;
        s1.password = "ascb";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);
        s2.password = "xyz";
        s1.marks[1] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[];

    // copy constructor or shallow copy
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student() {
        marks = new int[3];
        System.out.println("constructor is called...");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
