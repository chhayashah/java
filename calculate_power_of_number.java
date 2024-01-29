import java.util.Scanner;

public class calculate_power_of_number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int result = 1;

        for (int i = 1; i <= p; i++) {
            result = n * result;
        }
        System.out.println(result);
    }
}
