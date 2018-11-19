// Main.java
package trees;

import java.util.Scanner;

/**
 *
 * @author ncc
 */
public class Trees {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in).useDelimiter("\\n");
        boolean run = true;
        Integer year = 0;
        String make = "", model = "";
        Node<Car> carRoot = new Node();
        
        // Make this menu driven for extra credit.
        do {
            System.out.println("Welcome to the Tree of Cars.\n" 
                + "1. Add a car.\n"
                + "2. Remove a car.\n"
                + "3. Find a car.\n"
                + "4. Exit program.");
            System.out.print("Pick an option: ");
            Integer choice = input.nextInt();
            
            while (choice > 5 && choice < 1){
                System.out.println("Your choice must be between 1 - 4.");
                
                System.out.println("Welcome to the Tree of Cars.\n" 
                + "1. Add a car.\n"
                + "2. Remove a car.\n"
                + "3. Find a car.\n"
                + "4. Exit program.");
                System.out.print("Pick an option: ");
                choice = input.nextInt();
            }
            
            carRoot.add(new Car(1997, "Toyota", "Corolla"));
            carRoot.add(new Car(2000, "Honda", "Accord"));
            carRoot.add(new Car(2001, "Honda", "Accord"));
            carRoot.add(new Car(2002, "Honda", "Accord"));
            carRoot.add(new Car(2003, "Honda", "Accord"));
            carRoot.add(new Car(2004, "Honda", "Accord"));
            carRoot.add(new Car(2005, "Honda", "Accord"));
            carRoot.add(new Car(2006, "Honda", "Accord"));
            carRoot.add(new Car(2007, "Honda", "Accord"));
            
            if (choice == 1){
                System.out.print("What car would you like to add?(Year, Make, Model)\n"
                    + "Year: ");
                year = input.nextInt();
                
                System.out.print("Make: ");
                make = input.next();
                
                System.out.print("Model: ");
                model = input.next();
                
                
                carRoot.add(new Car(year, make, model));
            }
            
            else if (choice == 2){
                // Remove like some cars
                //carRoot.remove(new Car(2004, "Honda", "Accord")
                System.out.print("Which car would you like to remove? (Year, Make, Model)\n"
                    + "Year: ");
                year = input.nextInt();

                Car data = carRoot.remove(new Car(year, make, model)).getData();
                
                System.out.println(data.toString());
            }
            
            else if (choice == 3){
                // Search for a car using a binary search
                // Node<Car> car = carRoot.search(new Car(2004, "Honda", "Accord"));
                // Search for a different car using binary search
                // Node<Car> car2 = carRoot.search(new Car(2001, "Honda", "Accord"));
                
                System.out.print("Which car are you trying to find? (Year, Make, Model)\n"
                    + "Year: ");
               year = input.nextInt();
            
                carRoot.search(new Car(year, make, model));
            }
            
            else if (choice == 4){
                run = false;
            }
            
            else{
                System.out.println("Please enter a number between 1 - 4.");
            }
        } while(run);
    }
    
}

// Node.java
package trees;
import java.lang.Comparable;

/**
 *
 * @author ncc
 */
public class Node<T extends Comparable> {
    private Node<T> left;
    private Node<T> right;
    private Node<T> parent;
    private T data;
    
    public Node () {
        left = null;
        right = null;
        parent = null;
        data = null;
    }
    
    public Node<T> getLeft () {
        return left;
    }
    
    public Node<T> getRight () {
        return right;
    }
    
    public Node<T> add (T toAdd) {
        
        
        return this.parent;
    }
    
    public Node<T> remove (T toRemove) {
        
        
        return this.parent;
    }
    
    public T getData(){
        return this.data;
    }
    
    public Node<T> search (T nodeToFind) {
        // Decide how this search works.
        return null;
    }
}

// Car.java
package trees;

/**
 *
 * @author ncc
 */
public class Car implements Comparable<Car>{
    private Integer year;
    private String make;
    private String model;
    
    public Car(Integer year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }
    
    /**
     * @param year the year to set
     */
    void setYear(Integer year) {
        this.year = year;
    }
    
     /**
     * @param make the make to set
     */
    void setMake(String make) {
        this.make = make;
    }
    
     /**
     * @param model the model to set
     */
    void setModel(String model) {
        this.model = model;
    }
    
    /**
     * @return the year
     */
    Integer getYear() {
        return this.year;
    }
    
     /**
     * @return the make
     */
    String getMake() {
        return this.make;
    }
    
     /**
     * @return the model
     */
    String getModel() {
        return this.model;
    }
    
    @Override
    public String toString() {
        return this.getYear() + " " + this.getMake() + " " + this.getModel();
    }

    // Implement this to compare two cars together.
    @Override
    public int compareTo(Car o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
