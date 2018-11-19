package lab_2_part_1_stack;

import java.util.Stack;

/**
 *
 * @author ncc
 */
public class Lab_2_Part_1_Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a Stack
        Stack<String> stackOfCards = new Stack<>();

        // Add new items to the Stack
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");

        System.out.println("Stack => " + stackOfCards);

        String cardAtTop = stackOfCards.pop();
        System.out.println("Card At Top => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);
        System.out.println();

        // Get the item at the top of the stack without removing it
        cardAtTop = stackOfCards.peek();
        System.out.println("Card At Top => " + cardAtTop);
        System.out.println("Current Stack => " + stackOfCards);
        
        System.out.println("Queen is at location => " + stackOfCards.search("Queen"));

    }

    
}
