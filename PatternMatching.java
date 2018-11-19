package patternmatching;

import java.util.Scanner;

/**
 *
 * @author Averex
 */
public class PatternMatching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // take in, as input, a dna sequence (button mash)
        StringBuilder sb = new StringBuilder();
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a DNA sequence: ");
        String sequence = input.nextLine();
        
        // Take in again, as input, a variant
        System.out.println("Enter a genetic variant: ");
        String variant = input.nextLine();
        
        // return true if there's a match and false otherwise
        // Somehow match them
        int variantCounter = 0;
        boolean variantMatches = false;
        int matchCount = 0;
        
        for (int i = 0; i < sequence.length(); i++){
            if (variant.charAt(variantCounter) == sequence.charAt(i)) {
                variantCounter++;
                if (variantCounter == variant.length() - 1) {
                    variantMatches = true;
                    matchCount++;
                    variantCounter = 0;
                }
            }
            
            else {
                variantCounter = 0;
            }
        }
        
        if (variantMatches) {
            System.out.println("Matches " + matchCount + " times.");
        }
        
        else {
            System.out.println("No match found.");
        }
    }
    
}
