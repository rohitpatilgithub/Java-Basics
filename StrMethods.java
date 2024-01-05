public class StrMethods {
    public static void main(String[] args) {
        String a = "Rohit";
        System.out.println(a);

        /*
        int value = a.length();
        System.out.print("Length : ");
        System.out.println(value);

        String val = a.toLowerCase();
        System.out.print("Lowercase : ");
        System.out.println(val);

        String v = a.toUpperCase();
        System.out.print("Uppercase : ");
        System.out.println(v);

        String nts = "     Rohit    ";
        System.out.print("Non trimmed : ");
        System.out.println(nts);

        System.out.print("Trimmed : ");
        System.out.println(nts.trim());

        System.out.print("Substring (start excluded): ");
        System.out.println(a.substring(2));

        System.out.print("Substring (start included,end excluded) : ");
        System.out.println(a.substring(1,4));

        System.out.print("Replacing string : ");
        System.out.println(a.replace('R','O'));

        System.out.print("Startwith : ");
        System.out.println(a.startsWith("Roh"));

        System.out.print("Endswith : ");
        System.out.println(a.endsWith("Roh"));

        */
        System.out.print("Char at : ");
        System.out.println(a.charAt(2));

        System.out.print("Index of : ");//starts from 0 searching
        System.out.println(a.indexOf("o"));

        String name = "Haahppyppy";
        System.out.print("Index of (str,from index) : ");
        System.out.println(name.indexOf("pp67",5));//returns -1 if not found

        System.out.print("Last index of : ");
        System.out.println(name.lastIndexOf("pp"));//start from lastmost index

        System.out.print("Last index of(str,from index) : ");
        System.out.println(name.lastIndexOf("pp",6));

        System.out.print("Verifies string : ");//case verification required
        System.out.println(a.equals("Rohit"));

        System.out.print("Verifies string(no case sensitive) : ");//case verification neglected
        System.out.println(a.equalsIgnoreCase("rohit"));

        //escape sequences
        //System.out.println("The (new line) \n name is (tab)\t Rohit\\ (one backslash)");
    }
}
