public class Conditionals {
    public static void main(String[] args) {
        int age = 19;
        boolean cond = (age==18); // boolean
        if(cond){
            System.out.println("You can drive");
        }
        else{
            System.out.println("You cannot drive");
        }
        //relational operators == , != , <= , >= , < , >
        // == to equal
        // = assigned
        boolean a = true;
        boolean b = false;
        System.out.println(!a);
        System.out.println(!b);
        if(a&&b){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
