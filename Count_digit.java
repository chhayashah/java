import java.util.Scanner;

public class Count_digit {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;

   while(n>0){
    n=n/10;
    count++;
   } System.out.println(count);
}}
