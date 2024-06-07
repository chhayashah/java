
import java.util.*;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks[] = new int[100];

        System.out.println("length of array =" + marks.length);

        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();

        System.out.println("phy:" + marks[1]);
        System.out.println("math:" + marks[2]);
        System.out.println("english:" + marks[3]);
        marks[2] = 50;
        System.out.println("math:" + marks[2]);
        marks[3] = marks[3] + 1;
        System.out.println("english:" + marks[3]);
    }
}