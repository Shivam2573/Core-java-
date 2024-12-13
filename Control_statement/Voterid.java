import java.util.*;
public class Voterid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age");
        int age= sc.nextInt();
        if(age>=18){
            System.out.println("eligible for voter id");
         }
        else{
            System.out.println("not eligible for voter id");
        }
    }
}