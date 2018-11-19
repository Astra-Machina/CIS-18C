package lab_2_part_2_queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ncc
 */
public class Lab_2_Part_2_Queue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> waitingQueue = new LinkedList<>();

        waitingQueue.add("Jennifer");
        waitingQueue.add("Angelina");
        waitingQueue.add("Johnny");
        waitingQueue.add("Rachel");

        System.out.println("WaitingQueue : " + waitingQueue);

        // Check is a Queue is empty
        System.out.println("is waitingQueue empty? : " + waitingQueue.isEmpty());

        // Find the size of the Queue
        System.out.println("Size of waitingQueue : " + waitingQueue.size());

        // Check if the Queue has an element
        String name = "Johnny";
        if(waitingQueue.contains(name)) {
            System.out.println("WaitingQueue has " + name);
        } else {
            System.out.println("Waiting Queue doesn't have " + name);
        }

        // Get the person at the front of the Queue without removing it
        // The method throws NoSuchElementException if the Queue is empty
        String firstPersonInTheWaitingQueue =  waitingQueue.element();
        System.out.println("First Person in the Waiting Queue : " + firstPersonInTheWaitingQueue);

        // Get the person at the front of the Queue without removing it using another method()
        // This version returns null if the Queue is empty
        firstPersonInTheWaitingQueue = waitingQueue.poll();
        System.out.println("First Person in the Waiting Queue : " + firstPersonInTheWaitingQueue);

    }
    
}
