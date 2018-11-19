// Main.java
package storeapplication;

/**
 *
 * @author ncc
 */
public class StoreApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

//Product.java
package storeapplication;

/**
 *
 * @author ncc
 */
public class Product {
    private String name;
    private double price;
    private String description;
    private String upc;
    private String sku;
}

// Category.java
package storeapplication;

/**
 *
 * @author ncc
 */
public class Category {
    private String name;
    private String classification;
    private double weight;
    private double dimension_x;
    private double dimension_y;
    
}

// ProductCategoryMap.java
package storeapplication;

import java.util.HashMap;

/**
 *
 * @author ncc
 */
public class ProductCategoryMap {
    private HashMap<Product, Category> map;

    /**
     * @return the map
     */
    public HashMap<Product, Category> getMap() {
        return map;
    }

    /**
     * @param map the map to set
     */
    public void setMap(HashMap<Product, Category> map) {
        this.map = map;
    }
    
}
