import java.util.Scanner;

public class Input{
    public static void main(String[]args){
        System.out.println("Input");
        Scanner inp = new Scanner(System.in);
        /*System.out.println("number 1");
        float a = inp.nextFloat();
        System.out.println("Number 2");
        boolean b = inp.hasNextFloat();
        float sum = a;
        System.out.println("Sum is : "+sum);
        System.out.println("B is "+b);*/
        String s = inp.next();
        System.out.println("String is : "+s);
        String l = inp.nextLine();
        System.out.println("Long string is : "+l);
    }
}
