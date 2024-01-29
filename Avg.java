import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4   = sc.nextInt();
        int m5 = sc.nextInt();

        int avg = (m1 + m2 + m3 + m4 + m5) / 5;
        System.out.println(avg);
    }
}
