import java.util.Scanner;
import java.util.Random;
public class B6Test5 {
    public static void main(String[] args)
    {
        Scanner hi = new Scanner(System.in);
        System.out.print("For rock = 1\nFor Scissor = 2\nFor Paper = 3 \nEnter : ");
        int my = hi.nextInt();
        Random ran = new Random();
        int your = ran.nextInt(1,3);
        switch(my){
            case 1-> System.out.println("You choose Rock");
            case 2-> System.out.println("You choose Scissor");
            case 3-> System.out.println("You choose Paper");
            default -> System.out.println("");
        }
        switch (your){
            case 1-> System.out.println("Robot choose Rock");
            case 2-> System.out.println("Robot choose Scissor");
            case 3-> System.out.println("Robot choose Paper");
            default -> System.out.print("");
        }
        if (my==your){
            System.out.println("Tie");
        } else if (my==1 && your==2) {
            System.out.println("You lost");
        }else if (my==1 && your==3){
            System.out.println("You won");
        } else if (my==2 && your==1) {
            System.out.println("You lost");
        } else if (my==2 && your==3) {
            System.out.println("You won");
        } else if (my==3 && your==2) {
            System.out.println("You lost");
        } else if (my==3 && your==1) {
            System.out.println("You won");
        }
        else{
            System.out.println("Choose 1,2,3 for Rock Scissor Paper respectively");
        }
    }

}
