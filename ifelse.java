import java.util.*;
public class ifelse{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();

        if((a%2==0) && (a % 3 ==0)){
            System.out.println("divisible");
        }
        else{
            System.out.println("not divisible");
        }
    }
}