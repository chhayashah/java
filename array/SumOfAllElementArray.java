import java.util.Scanner;

public class SumOfAllElementArray {

    // public static int Sum(int arr []){
    // int s um=0;
    // for(in t i = 0 ;i<arr.leng th;i ++){
    // s um= s um+arr[i];
    // }
    // return sum;
    //

    public static void main(String[] args) {
        // int ar r [ ]= {1 ,2 ,3 , 4,5};
        // System.out.println(Sum(arr));

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n;i++){  
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
