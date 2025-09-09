// ArrayPractice.java
// Hope Nanthavongdouangsy 9/9/2025


public class ArrayPractice {
    public static void main(String[] args) {
        System.out.println("\n Welcome to my Array Practice program!");
        // Create a String array of four elements
        String[] FourStrings = new String[4];
        FourStrings[0] = "Lexus IS 350";
        FourStrings[1] = "GT 500";
        FourStrings[2] = "Honda Accord";
        FourStrings[3] = "RCF Lexus";
       for (int i=0; i<4; i++) {
           System.out.println("\n i is " + i + " and myFourStrings [" + i + "] is: " + FourStrings[i]);
       }
    }
}