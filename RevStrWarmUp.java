//RevStrWarmUp.java
// Hope Nanthavongdouangsy 9/9/2025

// References:
// This is what I used to do the reverse sting
// https://www.w3schools.com/java/java_howto_reverse_string.asp
public class RevStrWarmUp {
    public static void main(String[] args) {
        System.out.println("\n Welcome to my Reverse String Warm Up program!\n");
        // Create a program that reverse a string using a for loop
        // define this program in terms of input/processing/output

        // there is no input in this program, everything is hard coded
        // processing is: Decrementing a for loop, finding the length,
        // create a new string
        // with the end characters at the end of the string

        // Create a couple of strings variables
        String myStr = "abcdefghijk";
        String reversedStr = "";
        // Create a for loop and use it to get each char from the str and use it
        // I know how to decrement a loop

        int strLength = myStr.length();
        System.out.println("\n strLength is " + strLength);
        System.out.println("\n char at index 11 is " + myStr.charAt(10));
        for (int i = strLength; i >= 0; i--) {

            System.out.println("\n the char at " + i + " is " + myStr.charAt(i));
            reversedStr += myStr.charAt(i);

        }
        System.out.println("\n The reverseStr is: " + reversedStr);

    }
}








