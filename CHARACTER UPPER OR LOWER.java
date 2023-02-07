import java.util.Scanner;
import java.lang.*;
public class cases{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char s= sc.next().charAt(0);
        if(Character.isLowerCase(s)){
            System.out.println(s+" is lowercase letter");
        }
        else if(Character.isUpperCase(s)){
            System.out.println(s+" is uppercase letter");
        }
        else{
            System.out.println(s+" is neither an uppercase or lowercase letter");
        }
    }
}
