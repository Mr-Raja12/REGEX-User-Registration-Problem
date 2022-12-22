//UC - 1 is to As a User need to enter a valid First Name. (First name starts with Cap and has minimum 3 characters)
//UC - 2 is to As a User need to enter a valid Last Name. (Last name starts with Cap and has minimum 3 characters)

package com.bl.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 
 * @author Raja
 *
 */

public class UserRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the User's First Name");
        String firstName = scanner.next();
        System.out.println("Enter the User's Last Name");
        String lastName = scanner.next();
        if (validName(firstName) && validName(lastName))
        {
            System.out.println("Given first name : " + firstName + " & last name : " + lastName + " is valid");
        }
        else
        {
            System.out.println("Given first name : " + firstName + " & last name : " + lastName + " is not valid");
        }
    }

    // Method to check username
    public static boolean validName(String name) {
        boolean flag = false;
        String regex="[A-Z][a-z]{3,}";      // {3,} means above 3 char firstname
        Pattern pattern=Pattern.compile(regex);
        for(int i = 0; i < name.length(); i++)
        {
            Matcher matcher=pattern.matcher(name);
            flag = matcher.matches();
        }
        return flag;
    }
}