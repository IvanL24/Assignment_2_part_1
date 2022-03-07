package utilities;

import java.util.NoSuchElementException;


/**
 * <p>
 * The <code>QueueADT</code> interface is designed to be used as a basis for all
 * queues. The implementors of this interface will be required to add all the 
 * functionality.
 * </p>
 * 
 * @param <E> The type of elements this stack holds.
 */
public interface QueueADT<E> {

	// Core methods
	
	/**
	 * The enqueue method will add an item to the bottom of the queue to be processed when next available (FIFO)
	 * @param item is the entity of type E to add
	 * @return returns True if the item was successfully added, otherwise, False for could not add to the queue
	 */
	public boolean enqueue(E item);
	
	/**
	 * The dequeue method will remove an item from the very front/top of the queue.
	 * @return An element of type E
	 */
	public E dequeue();
	
	/**
	 * The peek method will return the item at the front of the queue without removing it.
	 * @return Item of type E which is at the top of the queue 
	 */
	public E peek();
	
	/**
	 * The size method will return the total number of elements in the queue
	 * @return the total number of elements available in the queue
	 */
	public int size();
	
	/**
	 * The isEmpty method will check to see if the queue is empty or not
	 * @return True if the queue is empty, or false if the 
	 */
	public boolean isEmpty();

	/**
	 * The isFull method will check if the queue has met capacity
	 * @return True if the queue is full, false if the queue is empty
	 */
	public boolean isFull();
	

	/**
	 * The equals method will check to see if two queues match each other
	 * @param that - the queue to compare against
	 * @return True if the queue matches another queue, false if the queue does not match another queue.
	 */
	public boolean equals(QueueADT<E> that);
	
	/**
	 * The toArray method will convert this queue into an array by populating an array
	 * @return Returns an array of objects from this queue
	 */
	Object[] toArray();
	
	/**
	 * The toArray method will convert this queue into an array of type E
	 * @param copy - Place holder variable
	 * @return Returns an array of type E objects from this queue
	 */
	E[] toArray(E[] copy);

	/**
	 * The dequeue all will remove all elements from the queue
	 */
	public void dequeueAll();

	Iterator<E> iterator();
	
}
