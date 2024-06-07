
import java.util.Scanner;

public class TwoD {
    public static boolean search(int a[][], int key) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == key) {
                    System.out.println("found at cell ("+ i + ","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String rags[]) {
        int a[][] = new int[3][3];
        // int n=3,m=3;
        int n = a.length, m = a[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        search(a, 5);
    }
}
