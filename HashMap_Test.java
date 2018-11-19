package HashMap_Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author ncc
 */
public class HashMap_Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<String, String> nasaPicture = new HashMap();
        nasaPicture.put("date", "9-12-1964");
        nasaPicture.put("explanation", "Some Explanation");
        
        System.out.println("Date: " + nasaPicture.get("date"));
        //LinkedList<String> animals = new LinkedList();
        
        //animals.add("Dog");
        //animals.add("Cat");
        //animals.add("Whatever");
        //animals.add("Cat");
        
        //for (int i = 0; i <animals.size(); i++) {
        //    System.out.println(animals.get(i));
        //}
        //System.out.println(animals);
        
        //for (int i = 0; i < animals.size(); i++) {
        //    System.out.println(animals.get(i));
        //}
        
        //for (String s : animals) {
        //    System.out.println(s);
        //}
        
        //int size = animals.size();
        //for (int i = 0; i < size; i++) {
        //    if (animals.get(i).equals("Cat")) {
        //        animals.remove("Cat");
        //    }
        //}
        
        //for (String s : animals) {
        //    System.out.println(s);
        //}
        
        
    }
    
}
