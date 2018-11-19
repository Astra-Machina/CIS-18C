// Main.java
public class ArrayListAndStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayStack s = new ArrayStack();
        ArrayList<String> s2 = new ArrayList();
        //String a = new String();
        
        s.push("Whatever");
        s.push("Whatever2");
        //a = (String)s.pop();
        
        System.out.println("Size is " + s.size());
        System.out.println("Is empty? " + s.isEmpty());
        
        System.out.println(s.pop());
        System.out.println(s.pop());
        
        System.out.println("Size is " + s.size());
        System.out.println("Is empty? " + s.isEmpty());
        
        ArrayQueue q = new ArrayQueue();
        
        q.enqueue("WhateverQ");
        q.enqueue("WhateverQ2");
        q.enqueue("WhateverQ3");
        
        
    }
    
}

// ArrayQueue.java
public class ArrayQueue implements IQueue{
    
    public ArrayQueue() {
        
    }
    
    @Override
    public void enqueue (Object objectToEnqueue) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Object dequeue() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public long size() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }
    
    
    
}

// ArrayStack.java
public class ArrayStack implements IStack {
    private Object[] myData;
    private int index = 0;
    
    public ArrayStack() {
        myData = new Object[5];
    }
    
    @Override
    public void push(Object stringToPush) {
        myData[index++] = stringToPush;
    }
    
    @Override
    public Object pop() {
        //if (index == 0) {
         //   return null;
       // }
        
        return myData[index--];
    }
    
    @Override
    public boolean isEmpty() {
        return index == 0;
    }
    
    @Override
    public long size() {
        return myData.length;
    }
}

// IQueue.java
public interface IQueue {
    public void enqueue(Object objectToEnqueue);
    public Object dequeue();
    public long size();
    public boolean isEmpty();
}

// IStack.java
public interface IStack {
    public void push(Object stringToPush);
    public Object pop();
    public boolean isEmpty();
    public long size();
}

