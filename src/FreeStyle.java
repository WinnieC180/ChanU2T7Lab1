import java.util.Scanner;
public class FreeStyle {
    public static void main (String[] arg){
        Scanner scan = new Scanner (System.in);

        System.out.println();
        System.out.print("Enter first string (e.g. apple): ");
        String firstString = scan.nextLine();

        System.out.println("String length: " + firstString.length());

        int half = ((firstString.length())/2);
        System.out.println("First half: " + firstString.substring(0,half));

        System.out.println("Second half: " + firstString.substring(half));
        System.out.print("Enter second string (e.g. apple): ");
        String secString = scan.nextLine();

        if (firstString.length() == secString.length()) {
            System.out.println("Both strings have the same length");
        } else if (firstString.length() > secString.length()) {
            System.out.println(firstString + " is longer");
        } else if (secString.length() > firstString.length()) {
            System.out.println(secString + " is longer");
        }

        if (firstString.equals(secString)) {
            System.out.println("Both strings have the exact same characters");
        } else if (firstString.compareTo(secString) < 0) {
            System.out.println(firstString + " is first alphabetically");
        } else if (firstString.compareTo(secString) > 0) {
            System.out.println(secString + " is first alphabetically");
        }

        if (firstString.indexOf(secString) == -1) {
            System.out.println(secString + " is NOT found in " + firstString);
        } else if (firstString.indexOf(secString) != -1) {
            System.out.println(secString + " is found in " + firstString + " at index " + firstString.indexOf(secString));
        }
        scan.close();
    }
}
