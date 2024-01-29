import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        // int a = 79;

        // if (a % 2 == 0) {
        //     System.out.println("even no.");
        // } else {
        //     System.out.println("odd no.");
        // }

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("even no.");
        }else{
            System.out.println("odd no.");
        }
    }
}
