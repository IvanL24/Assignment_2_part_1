package utilities;

import java.io.Serializable;

/**
 * <p>
 * The <code>StackADT</code> interface is designed to be used as a basis for all
 * stacks. The implementors of this interface will be required to add all the 
 * functionality.
 * </p>
 * 
 * @param <E> The type of elements this stack holds.
 */
public interface StackADT<E> extends Serializable, Iterator<E> {

	// ++ Generalized Checks ++
	
	/**
	 * The isEmpty method will return either true or false depending upon if the
	 * stack is empty.
	 * 
	 * @return True if the stack is empty, or false if the stack is occupied.
	 */
	boolean isEmpty();
	
	/**
	 * The clear method will remove all items from the stack
	 */
	void clear();
	
	/**
	 * The search method will loop through all items in the stack in search of an item in the stack matching
	 * the obj parameter.
	 * @param obj is the desired item to locate in the current stack
	 * @return If the requested item has been located, then the appropriate index will be returned.
	 */
	int search(E obj);
	
	/**
	 * The equals method will check to see if two separate stacks match each-other. 
	 * @param that is the stack used to compare against.
	 * @return True if both stacks are equal to each other, otherwise, false if they don't match.
	 */
	boolean equals(StackADT<E> that);
	
	/**
	 * The size method will report the current element count in this stack
	 * 
	 * @return The total numbers of elements in the stack
	 */
	int size();
	
	/**
	 * The toArray method will convert the current stack into an array of Objects
	 * @return An array of objects which correspond to what is found in this stack
	 */
	Object[] toArray();
	
	/**
	 * The toArray method will convert the current stack into an array of E type\
	 * @param copy The desired array to copy
	 * @return An array of objects which correspond to what is passed as parameter copy
	 */
	E[] toArray(E[] copy);
	
	// ++ Core Functionality ++
	
	/**
	 * The push method will add an item to the top of this stack.
	 * @param item the item to add to the top of the stack
	 */
	void push(E item);
	
	/**
	 * The pop method will remove and return the item at the top of the stack
	 * @return item of type E (top of the stack)
	 */
	E pop();
	
	/**
	 * The peek method will return the item at the top of the stack (without removing it)
	 * @return item of type E (top of the stack)
	 */
	E peek();
	
}
