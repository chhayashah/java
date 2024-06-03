import java.util.Scanner;

public class Const {
    public static void main(String[] args) {
        Const outer = new Const();
        Student s1 = outer.new Student("chhaya");
        System.out.print(s1.name);
    }

    class Student {
        String name;
        int roll;

        Student(String name) {
            this.name = name;
        }

    }
}