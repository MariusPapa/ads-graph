package ass1.PQueue;

import ass1.PQueue.IPriorityQueue;
import ass1.PQueue.PQNode;

public class LinearPQ<T> implements IPriorityQueue<T> {

	private PQNode<T> front;
	private int size;
	private int running = 0;

	public LinearPQ() {
		this.front = null;
		this.size = 0;
	}


	
	@Override
	public void add(T element, double priority) {
		
		if(element == null)
			throw new IllegalArgumentException("Null pointer denied!");
		else
		{
			PQNode<T> n = new PQNode<T>(element, priority, ++running);
			PQNode<T> current = front;
			
			if (size == 0) // if the queue is empty then the first element inserted will be the front one
				front = n;
			else {
				if (current.getPriority() > n.getPriority()) { // if the priority of the item to be inserted is less than the first element in
					n.setNext(front);							// the queue then the item will be placed in the front
					front = n;
				} else {
					
					// all magic stuff happens here :D 
					
					// find the right position where the new item should pe placed;
					while (current.getPriority() <= n.getPriority()
							&& current.getNext() != null)
					{
						if(current.getNext().getPriority() <= n.getPriority())
							current = current.getNext();
						else
							break;
					}
					
						// place the element in the queue
						n.setNext(current.getNext());
						current.setNext(n);
						
					// magic stuff ends here :D 
				}
			}	
			size++; //increment the size of the priority queue;
		}
	}

	@Override
	public T getNext() {
		T temp = null;
		
		if(size > 0)
		{
			temp = front.getElement();
			front = front.getNext();
			size--;
		}
			
		return temp;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public void printPQ() {
		
		PQNode<T> current = front;
		
		while(current != null)
		{
			System.out.print("(" + current.getElement() + ", " + current.getPriority() + ")");
				if(current.getNext() != null)
					System.out.print(" ");
				else
					System.out.print(";");
				System.out.println();
				current = current.getNext();
		}

	}

	@Override
	public boolean contains(T element) {
		if (element == null)
			throw new IllegalArgumentException("Null pointer is not allowed");
		else {
			PQNode<T> current = front;

			while (current != null) {
				if (current.getElement().equals(element))
					return true;
				current = current.getNext();
			}
			return false;
		}
	}

	@Override
	public void clear() {
		front = null;
		size = 0;
		running = 0;
	}
}
