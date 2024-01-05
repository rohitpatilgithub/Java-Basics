import java.util.Scanner;
public class Conditionals2 {
    public static void main(String[] args) {
        //elseif
        Scanner i = new Scanner(System.in);
        System.out.print("Age : ");
        int age = i.nextInt();
//        if(age>56){
//            System.out.println("old");
//        }
//        else if (age>47){
//            System.out.println("still young");
//        }
//        else if (age>36) {
//            System.out.println("Pretty young");
//        }
//        else{
//            System.out.println("young");
//        }
        //switch

//        switch(age){
//            case 18:
//                System.out.println("You will be adult");
//                break;
//            case 21:
//                System.out.println("You are adult");
//                break;
//            default:
//                System.out.println("Live free");
//        }

        //switch case advanced
        switch(age){
        case 18->{
            System.out.println("18 is age");
        }
        }
        System.out.println("code"); //outside conditionals
    }
}
