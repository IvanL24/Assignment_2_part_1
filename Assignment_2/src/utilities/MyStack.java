package utilities;

import java.util.NoSuchElementException;

public class MyStack<E> implements StackADT<E>  {
	
	
	  private Object[] array;
	  private E top;
	  private int capacity;
	  private int size;

	public MyStack(){
		
	    array = new Object[capacity];
	    top = null;
	    size = 0;
	}

	@Override
	public boolean hasNext() {
		
		return false;
	}

	@Override
	public E next() throws NoSuchElementException {
		
		
		return null;
	}

	@Override
	public boolean isEmpty() {
		
		return this.size == 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int search(E obj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean equals(StackADT<E> that) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		
		return this.size;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E[] toArray(E[] copy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void push(E item) {
		if(isFull()) {
			System.out.println("Stack is Full");
		}
		
		this.size++;
		
	}

	private boolean isFull() {
	
		return size() == capacity;
	}

	@Override
	public E pop() {
		
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		
		}
		
		this.size--;
		return null;
	}

	@Override
	public E peek() {
		
		return top;
	}

	

}
