import java.util.Scanner;

public class SwapIndexs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(n);
        }
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
