import java.util.Scanner;

public class PrintCharacter {
    public static void main(String[] args){
        
        char ch;
        System.out.println("please enter character");
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        System.out.println(ch);

    }
}
