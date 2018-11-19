// Main.java
package lab.pkg1;

/**
 *
 * @author ncc
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Unique application = new Unique();
        application.getNumbers();
    }
    
}

// Unique.java
package lab.pkg1;

// Lab 1: Unique.java
// Reads in 5 unique numbers.
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Unique
{
   // gets 5 unique numbers from the user
   public void getNumbers()
   {
      Scanner input = new Scanner( System.in );

        /* Create an array of five elements*/ 
        //int numbers[] = new int[5];
        int arrSize = 5;
        ArrayList<Integer> arrNum = new ArrayList<>(arrSize);
        int count = 0; // number of uniques read
        int entered = 0; // number of entered numbers
        
        for (int i = 0; i < 5; i++)
        {
            arrNum.add(0);
        }
      
        while( entered < arrSize )
        {
            System.out.print( "Enter number: " );
   
            Integer num = input.nextInt();
         
            // validate the input
            /* Write an if statement that validates the input */  
            if (num >= 10 && num <= 100){
                // flags whether this number already exists
                boolean containsNumber = false;

                // increment number of entered numbers
                entered++;
            
                /* Compare the user input to the unique numbers in the array using a for 
               statement. If the number is unique, store new number */
                for (int i = 0; i < arrSize; i++){
                    if (Objects.equals(num, arrNum.get(i))){
                        containsNumber = true;
                    }  
                }
            
                /* add the user input to the array only if the number is not already 
                in the array */
                if ( !containsNumber ){
                     arrNum.set(count, num);
                     
                    count++;
                } // end if
                
                else {
                    System.out.printf("%d has already been entered\n", num);
                }
                
                
            } // end if
            
         else
            System.out.println( "Number must be between 10 and 100" );
         
         // print the list of unique values
         /* Write code to output the contents of the array */
         

         System.out.print(arrNum);
         System.out.println();
      } // end while      
   } // end method getNumbers
} // end class Unique
