import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        //String a = new String("Hello ");
        //String a = "Hello";  //Strings are immutable (cannot be changed)
        // we have to make a copy of that object and then we can
        // change otherwise usually reference variable store
        // permanently in it's memory
        //System.out.print("Rohit ");
//        int a = 6;
//        float b = 5.67986f ;
//        System.out.printf("The values of a is %d and b is %8.2f",a,b);//8 spaces required and .2 decimals taken
//        //System.out.format("The values of a is %d and b is %.2f",a,b);

        Scanner a = new Scanner(System.in);
        String o = a.next();
        String b = a.nextLine();
        System.out.println(o);//Execute this
        System.out.println(b);
    }
}
