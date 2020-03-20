package org.example;
import java.util.*;
public class App 
{
    public static void main( String[] args ) {
        Scanner s = new Scanner(System.in);
        CorrectString Cstr = new CorrectString();
        System.out.println("Enter a String to be Corrected ...");
        System.out.println(Cstr.remove_a(s.nextLine()));
    }
}
