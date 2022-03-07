package utilities;

import java.util.NoSuchElementException;

public interface QueueADT<E> {

	/*
	 * 
	 */
	public boolean enqueue(E item);
	public E dequeue();
	public void Peek();
	public int size();
	public boolean isEmpty();
	
}
