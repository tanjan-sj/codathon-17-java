package cat_task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * @author SJ
 */
public class Cat_task3 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String[] names = new String[5];
        ArrayList a1 = new ArrayList<String>();
        
        names[0] = s.nextLine();
        names[1] = s.nextLine();
        names[2] = s.nextLine();
        names[3] = s.nextLine();
        names[4] = s.nextLine();
        
        
        a1 = parina(names);
        //System.out.println(a1);
        
        System.out.println("foreach loop: ");
        for(Object obj : a1){
            System.out.println(obj);
        }
        
        System.out.println("removed the 2nd item: ");
        a1.remove(1);
        
        Collections.reverse(a1);
        System.out.println("reverse order: ");
        for(Object obj : a1){
            System.out.println(obj);
        }
    }
    
    private static ArrayList<String> parina(String[] strs)
    {
        ArrayList ara = new ArrayList();
        for(int i = 0; i < 5; i++)
        {
            ara.add(strs[i]);
        }
        return ara;
    }
    
}
