// Main.java
package binarytree;

/**
 *
 * @author ncc
 */
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Node<Car> carRoot = new Node();
        carRoot.add(new Car(1997, "Honda", "Accord"));
        carRoot.add(new Car(1998, "Honda", "Accord"));
        carRoot.add(new Car(1999, "Honda", "Accord"));
        carRoot.add(new Car(2000, "Honda", "Accord"));
        carRoot.add(new Car(2001, "Honda", "Accord"));
        carRoot.add(new Car(2002, "Honda", "Accord"));
        carRoot.add(new Car(2003, "Honda", "Accord"));
        carRoot.add(new Car(2004, "Honda", "Accord"));
        carRoot.add(new Car(2005, "Honda", "Accord"));
        
        // First we search:
        Node<Car> car = carRoot.search(new Car(2004, "Honda", "Accord"));
        
        // Then we remove
        // Node<Car> carToRemove = carRoot.remove(new Car(2004, "Honda", "Accord"));
        
    }
    
}

// Node.java
package binarytree;

/**
 *
 * @author ncc
 * @param <T>
 */
public class Node<T extends Comparable> {
    private T data;
    private Node<T> left;
    private Node<T> right;
    private Node<T> parent;
    
    public T data() {
        return this.data;
    }
    
    public Node<T> getLeft() {
        return this.left;
    }
    
    public Node<T> getRight() {
        return this.right;
    }
    
    public Node<T> add(T valueToAdd){
        // Check valueToAdd against data
        // If (valueToAdd > data)
            // go right
        if (valueToAdd.compareTo(this.data) > 0) {
            if (this.right == null) {
                this.right = new Node();
                this.right.parent = this;
                this.right.data = valueToAdd;
                return this.right;
            }
            
            else {
                return this.right.add(valueToAdd);
            }
        }
        //if (valueToAdd > data)
            // go left
        else if (valueToAdd.compareTo(this.data) < 0) {
            if (this.left == null) {
                this.left = new Node();
                this.left.parent = this;
                this.left.data = valueToAdd;
                return this.left;
            }
            
            else {
                return this.left.add(valueToAdd);
            }
            
        }
        // if (valueToAdd == data)
            // ignore completely
        else {
            return this;
        }
    }
    
    public Node<T> remove(T valueToRemove) {
        Node<T> removalNode = this.search(valueToRemove);
        
        // if (removalNode != null) {
           // Node<T> left = this.left;
           // Node<T> right = this.right;
            
           // if (this.parent.left == this) {
             //   this.parent.left = null;
                
            // }
            // this.parent.left = this.left;
            // this.parent.right = this.right;
        // }
        
        return null;
    }
    
    public Node<T> search(T valueToFind) {
        if (valueToFind == null)
            return null;
        
        if (this.data.compareTo(valueToFind) == 0) {
            return this;
        }
        
        else if (this.data.compareTo(valueToFind) < 0) {
            if (this.left == null)
                return null;
            else
                return this.left.search(valueToFind);
        }
        
        else if (this.data.compareTo(valueToFind) > 0) {
            if (this.right == null)
                return null;
            else
                return this.right.search(valueToFind);
        }
        
        else {
            return null;
        }
    }
}

// Car.java
package binarytree;

/**
 *
 * @author ncc
 */
public class Car implements Comparable<Car> {
    private Integer year;
    private String make;
    private String model;
    
    public Car() {
        // defaults;
        year = 1;
        make = "DefaultName";
        model = "CustomName";
    }
    
    public Car(Integer year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }
    
    public Integer getYear() {
        return this.year;
    }
    
    public String getMake() {
        return this.make;
    }
    
    public String getModel() {
        return this.model;
    }
    
    @Override
    public int compareTo(Car o) {
        //if (this.year.equals(o.year))
        //    return 0;
        
        //return (this.year - o.year < 0) ? 1 : -1;
        
        throw new UnsupportedOperationException("Not supported");
    }
}
