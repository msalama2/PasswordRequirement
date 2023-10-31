package PasswordRequirement;

import java.util.Scanner;

public class password {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        required();
        
        String newpassword = scnr.nextLine();
        scnr.close();

        if (test(newpassword)) {
            System.out.println("Thanks, your password has been successfully changed!");
        } 
        
        else {
            System.out.println("Invalid Password");
        }

    }

    public static void required() {
        System.out.println("\nEnter New Password:");
        System.out.println("*Password Must Include the following*");
        System.out.println("- A Length of 8 to 16 Characters,");
        System.out.println("- At least one Lowercase Letter,");
        System.out.println("- At least one Uppercase Letter,");
        System.out.println("- At least one Number.\n");
    }

    private static boolean test(String newpassword) {

        int minLength = 8;
        int maxLength = 16;

        boolean UpperCase = false;
        boolean LowerCase = false;
        boolean Integer = false;

        if (minLength <= newpassword.length() && newpassword.length() <= maxLength) {
            for (char c : newpassword.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    UpperCase = true;
                } else if (Character.isLowerCase(c)) {
                    LowerCase = true;
                } else if (Character.isDigit(c)) {
                    Integer = true;
                }
            }
        }

        return UpperCase && LowerCase && Integer;
    }
}






        


