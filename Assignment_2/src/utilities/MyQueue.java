package utilities;

import java.util.NoSuchElementException;

public class MyQueue<E> implements QueueADT<E> {

	//attributes
	MyDLL<E> list = new MyDLL<>();

	@Override
	public boolean enqueue(E toAdd) throws NullPointerException {
		return list.add(toAdd);
	}

	@Override
	public E dequeue() throws NoSuchElementException{
		E dequeuedElement = list.remove(0);
		return dequeuedElement;
	}
	
	public void dequeueAll(){
		list.clear();
	}

	@Override
	public E peek() throws NoSuchElementException{
		if(size() == 0) {
			throw new NoSuchElementException();
		}
		
		E firstElement = list.get(0);
		return firstElement;
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

}
