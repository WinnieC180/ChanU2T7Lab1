import java.util.Scanner;
public class MainRunner {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        String str1 = "abc";
        String str2 = str1;
        String str3 = str2;

        //using == because str2 is set to str1 which makes them equal
        System.out.println();
        System.out.println(str1 == str2);
        System.out.println(str3 == str2);

        //how not to use ==
        System.out.println(str1 == "abc");
        System.out.println();

        //this will return false even though it is practically the same thing as the code above
        System.out.println("---- This is using == instead of .equal ----");
        System.out.print("What is the first 3 letters of the alphabet: ");
        String abc = scan.nextLine();
        System.out.println(abc == "abc");
        System.out.println();

        //this is also when you use .equal not ==
        System.out.println("---- This is using .equal instead of == ----");
        System.out.print("What is the first 3 letters of the alphabet: ");
        abc = scan.nextLine();
        System.out.println(abc.equals("abc"));

        //this is when you use .equal and not ==
        System.out.println();
        System.out.println(str1.equals("abc"));
    }
}
