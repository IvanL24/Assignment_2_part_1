package utilities;

import java.io.Serializable;

public interface StackADT<E> extends Serializable{

	/*
	 * method adds element at the top of the stack
	 * 
	 * @param toAdd: to be added at the top of the stack
	 * @return NullPointerException if empty.
	 * @return size of stack
	 */
	public boolean Push(E toAdd) throws NullPointerException;
	
	/*
	 * method removes element from top of the stack
	 * 
	 * @return NoSuchElementException if empty.
	 */
	public E Pop();
	
	/*
	 * method returns value of the last inserted item on the stack
	 * 
	 * @return element value.
	 * 
	 */
	public E Peek();
	
	/*
	 * get the total number of items of the stack
	 * 
	 * @return total number of elements
	 */
	public int size();

	public void clear();
	
}
