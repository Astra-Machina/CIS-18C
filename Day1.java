// Main.java
package day1areyouready;

import java.io.Console;
import java.math.BigDecimal;
/**
 *
 * @author ncc
 */
public class Day1AreYouReady {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello, World!");
//        System.in;
    int x = 0;
    
    Integer x2 = x;
    final boolean y = true;
    double z;
    BigDecimal a;
        
    }
    
}

// Animal.java
package day1areyouready;

/**
 *
 * @author ncc
 */
public class Animal {
    public void makeNoise() {
        System.out.println("Noise from Animal.");
    }
        
}

// Dog.java
package day1areyouready;

/**
 *
 * @author ncc
 */
public class Dog extends Animal {
    private int age;
    private boolean tail;
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public boolean getTail() {
        return this.tail;
    }
    
    public void setTail(boolean tail) {
        this.tail = tail;
    }
//    @Override
//   public void makeNoise() {
//       System.out.println("Bark.");
//   }
    
}

