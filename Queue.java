import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Queue with parameterized type.
 * 
 * @author Mr. Chan 
 * @version September 2015
 */
public class Queue<T>
{
    private Node first, last;
    
    /**
     * An inner class
     */
    private class Node {
        private T item;
        private Node next;
    }
    
    /**
     * @return True if this queue is empty
     */
    public boolean isEmpty() {
        return first == null;
    }
    
    /**
     * Enqueues (puts) an item into queue.
     * @param item An object of type T
     */
    public void enqueue(T item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }
    }
    
    /**
     * Returns the first item from the queue
     * @return An item of type T
     */
    public T dequeue() {
        T item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return item;
    }
}