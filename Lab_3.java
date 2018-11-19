// Main.java
package Lab_3;

/**
 *
 * @author ncc
 */
public class Lab_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}


// CSQuote.java
package Lab_3;

import org.json.JSONObject;

/**
 * Lab 3: ArrayLists, LinkedLists, and HashMaps - Oh My!
 * @author Graeme Gonzales
 * @date 09/25/2018
 */
public class CSQuote {
    /* Create your private member variables here */
    private String author;
    private int id;
    private String quote;
    /* Create your getters and setters here */
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public int getID() {
        return id;
    }
    
    public void setID(int id) {
        this.id = id;
    }
    
    public String getQuote() {
        return quote;
    }
    
    public void setQuote(String quote) {
        this.quote = quote;
    }
    
    @Override
    public String toString() {
        StringBuilder myObject = new StringBuilder();
        myObject.append("author=>")
                .append(this.getAuthor())
                .append(",quote=>")
                .append(this.getQuote());
        return myObject.toString();
    }

   public void fromJSON(JSONObject myObject) {
      // Investigate the JSONObject class to determine how to convert a JSON Object to your CSQuote object
      author = myObject.getString("author");
      id = myObject.getInt("id");
      quote = myObject.getString("quote");
   }

   public JSONObject toJSON() {
      JSONObject myObject = new JSONObject();
      
      myObject.put("author", author);
      myObject.put("id", id);
      myObject.put("quote", quote);
      
      return myObject;
   }
}

//CSQuoteDatabase.java
package Lab_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
//import java.util.Iterator;
//import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Lab 3: ArrayLists, LinkedLists, and HashMaps - Oh My!
 * @author Graeme Gonzales
 * @date 09/25/2018
 */
public class CSQuoteDatabase {
    /* Create your private member variables here */
    LinkedList<CSQuote> csQuotes;
    HashMap<Integer, Integer> idIndex;
    Integer count = 0;
    
   public void addQuote(CSQuote quote) {
      // Add a quote to your arraylist
      csQuotes.add(quote);
      // Don't forget to "index" it by ID
     idIndex.put(quote.getID(), count);
     
     count++;
   }

   public void fromJSON(JSONArray myObject) {
      // Investigate the JSONArray class to determine how to convert a JSON Object to your CSQuote object
      
      JSONObject obj = new JSONObject();
      CSQuote quote = new CSQuote();
      
      while (!myObject.isNull(0)) {
          obj.put("Object", (Object) myObject);
          quote.fromJSON(obj);
          csQuotes.add(quote);
      }
   }

   public JSONArray toJSON() {
      // Investigate the JSONArray class to determine how to build a JSON object from your CSQuote object.
      JSONArray arr = new JSONArray();
      CSQuote quote;
      
      for (int i = 0; i < csQuotes.size(); i++) {
          quote = csQuotes.get(i);
          
          arr.put(quote);
      }
      
      return arr;
   }
}
