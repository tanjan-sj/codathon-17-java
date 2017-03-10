package code.a.thon_1;

import java.util.Scanner;

/**@author SJ
 */
public class CodeAThon_1 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        
        System.out.println("String1: " + s1 + "Length: " + s1.length());
        System.out.println("String2: " + s2 + "Length: " + s2.length());
        
        String cc = s1.concat(s2);
        System.out.println("Concated String: " + cc);
        
        int res = s1.compareTo(s2);
        System.out.println("CompareTo: " + res);
        
        System.out.println("UpperCase: " + s1.toUpperCase());
        System.out.println("UpperCase: " + s2.toUpperCase());
        System.out.println("LowerCase: " + s1.toLowerCase());
        System.out.println("LowerCase: " + s1.toLowerCase());
    }
    
}
