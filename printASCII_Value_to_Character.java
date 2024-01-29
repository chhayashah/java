import java.util.Scanner;

public class printASCII_Value_to_Character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        int a = ch;
        System.out.println(ch + " is " + a);
    }

}