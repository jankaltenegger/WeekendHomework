/**
 * @class: Methods
 * @author: Jan Kaltenegger
 * @version: 1.0
 * Course: ITEC 2140 - 04
 * Written: March 28, 2023
 *
 * Description: A collection of methods that do different things.
 * All methods have their test cases in the MethodsTest class.
 */

public class Methods {
    public static void main(String[] args) {
        var method = new Methods();

        method.reverseDoubleChar("hello");
        method.sumDigits(123);
        method.birthdayName("Lana");
        method.missingFront("hello");
        method.swapEnds("hello");
        method.everyOther("hello");
        method.nonStart("hello", "david");
        method.fibonacci(3);
        method.luckySum(2, 4, 13);
        method.hasPalindrome("racecar");
        method.powerOfTwo(16);
        
    }

    //Takes the input String and outputs it reversed and with the characters doubled.
    public String reverseDoubleChar(String word) {
        String reverseDoubleWord = "";
        for (int i = word.length() - 1; i >= 0; i--){
            reverseDoubleWord += word.charAt(i);
            reverseDoubleWord += word.charAt(i);
        }
        return reverseDoubleWord;
    }

    //Returns the sum of the digits in n.
    public int sumDigits(int n) {
        int sum = 0;
        int count = 0;
        String stringN = "" + n;

        while (count < stringN.length()) {
            sum += stringN.charAt(count) - '0';
            count++;
        }
        return sum;
    }

    //Returns the String name concatenated with "Happy Birthday" and "!".
    public String birthdayName(String name){
        return "Happy Birthday " + name + "!";
    }

    //Returns the input String missing its first three characters.
    public String missingFront(String str) {
        return str.substring(3);
    }

    //Returns the string with its first and last characters switch positions.
    public String swapEnds(String str) {
        if( str.length() > 1){
            return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
        } else {
            return str;
        }
    }

    //Returns a String with every other character removed from the input string.
    public String everyOther(String str) {
        String substringHolder = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                substringHolder += str.substring(i, i+1);
            }
        }
        return substringHolder;
    }

    //Returns one String made up of concatenated Strings a and b, missing their first characters.
    public String nonStart(String a, String b) {
        if (a.equals("") && b.equals("")){
            return a + b;
        } else if (a.equals("")) {
            return a + b.substring(1);
        } else if (b.equals("")) {
            return a.substring(1) + b;
        }
        return a.substring(1) + b.substring(1);
    }

    //Returns the nth number of the fibonacci sequence.
    public int fibonacci(int n) {
        int fib1 = 0;
        int fib2 = 1;
        int fib3;

        for (int i = 0; i < n; i++) {
            fib3 = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        return fib1;
    }

    //Returns the sum of 3 integers. If one of them is equal to 13, the integers to the right of them
    //are ignored.
    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }

    //Returns whether or not the input string is spelled the same when reversed.
    public boolean hasPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        for (int i = 0; i < str.length(); i++) {
            // check for odd-length palindromes
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
            // check for even-length palindromes
            left = i;
            right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
        }
        return false;
    }

    //Checks if n is a power of 2.
    public boolean powerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else {
            do {
                if (n == 1) {
                    return true;
                } else if (n % 2 != 0) {
                    return false;
                }
                n /= 2;
            } while (true);
        }
    }
}
