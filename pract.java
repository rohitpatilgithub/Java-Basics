import java.util.Scanner;

public class pract {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        float a = i.nextFloat();
        if(a%4==0 || a%400==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}
