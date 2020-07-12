package dodatkowe_zadania.galaxy.rest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {
        String someString = "example";
        String oneCharSting = "e";
        String abcString = "abc";
        String bcd = "bcd";

        String numberString = "k";
        String numberString2 = "8";
        String numberString3 = "4";

        String twoSigns = "4a";
        String twoSigns2 = "5z";

        boolean result = someString.matches(".");


/*        System.out.println(someString + " " + result);
        System.out.println(oneCharSting + " " + oneCharSting.matches("."));
        System.out.println(someString + " " + someString.matches("example"));


        System.out.println(abcString + " " + abcString.matches("[ab][bc][c]"));
        System.out.println(bcd + " " + bcd.matches("[ab][bc][d]"));
        System.out.println(bcd + " " + bcd.matches("[ab][bc][^c]"));*/

/*        System.out.println(numberString + " " + numberString.matches("[a-n1-7]"));
        System.out.println(numberString2 + " " + numberString2.matches("[a-n1-7]"));
        System.out.println(numberString3 + " " + numberString3.matches("[a-n1-7]"));
        */

/*
        System.out.println(numberString + " " + numberString.matches("[k|3]"));
        System.out.println(numberString2 + " " + numberString2.matches("[k|3]"));
*/


/*
        System.out.println(abcString + " " + abcString.matches("\\D\\D\\D"));
        System.out.println("aaa" + " " + "aaa".matches("a*"));
        System.out.println("aaaaaaaa" + " " + "aaaaaaaaa".matches("a*"));

*/

        System.out.println("aaa" + " " + "aaa".matches("\\w{1,8}"));
        System.out.println("aaa123" + " " + "aaa123".matches("\\w{1,8}"));


        Pattern someRegexPattern = Pattern.compile("\\w{1,8}");
        Matcher matcher = someRegexPattern.matcher("aaa123");

        System.out.println(matcher.matches());

    }
}
