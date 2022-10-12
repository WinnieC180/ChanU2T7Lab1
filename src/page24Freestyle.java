public class page24Freestyle {
    public static void main(String[] arg) {
        String str1 = "If there a space at the end ";
        String str2 = "If there a space at the end"; //same as str1 but no space at the end
        String str3 = "Ifthereaspaceattheend"; //no space in between
        String str4 = " Space in front";
        String str5 = "Space in front"; //no space in front as words as str4
        String str6 = " A space";
        String str7 = "A space"; //no space in front as words as str6

        System.out.println();
        System.out.println(str1.compareTo(str2)); //str1 is after =  positive

        System.out.println(str2.compareTo(str1)); //str2 is before = negative

        System.out.println(str1.compareTo(str3)); //str1 is before = negative

        System.out.println(str3.compareTo(str1)); //str3 is after =  positive

        System.out.println(str3.compareTo(str4)); //str3 is after =  positive

        System.out.println(str4.compareTo(str5)); //str4 is before = negative

        System.out.println(str4.compareTo(str6)); //str4 is after = positive

        System.out.println(str6.compareTo(str7)); //str6 is before = negative
    }
}
