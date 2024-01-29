import java.util.Scanner;

public class Sum_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, sum = 0;

        if (n % 2 == 0) {
            for (i = 0; i <= n; i = i + 2) {
                sum = sum + i;
            }
            System.out.println(sum);
        } else {
            for (i = 1; i <= n; i = i + 2) {
                sum = sum + i;
            }
            System.out.println(sum);
        }

    }
}