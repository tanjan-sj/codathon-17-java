package cat_task2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/*
 * @author SJ
 */
public class Cat_task2 {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner s = new Scanner(System.in);

        String sms = s.nextLine();

        String[] words = sms.split("\\s");
        
        String s1 = String.format("University: %s", words[0]);
        String s2 = String.format("HSC Board: %s", words[1]);
        String s3 = String.format("HSC Roll: %s", words[2]);
        String s4 = String.format("HSC Passing Year: %s", words[3]);
        String s5 = String.format("SSC Board: %s", words[4]);
        String s6 = String.format("SSC Roll: %s", words[5]);
        String s7 = String.format("SSC Passing Year: %s", words[6]);
        String s8 = String.format("Unit: %s", words[7]);
        
        PrintStream out = new PrintStream(new FileOutputStream("out.txt"));
        System.setOut(out);
        
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        
        
    }

}

//SUST DIN 123456 2012 SYL 654321 2010 B1

/* 
output:

University: SUST
HSC Board: DIN
HSC Roll: 123456
HSC Passing Year: 2012
SSC Board: SYL
SSC Roll: 654321
SSC Passing Year: 2010
Unit: B1
*/