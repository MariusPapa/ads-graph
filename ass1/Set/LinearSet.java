package ass1.Set;

import java.util.Arrays;

import ass1.Set.ISet;

public class LinearSet<T extends Comparable<T>> implements ISet<T> {

	private final int DEFAULT_CAPACITY = 7;
	private T[] content;
	private int count;

	// Constructor
	public LinearSet() {
		count = 0;
		content = (T[]) new Comparable[DEFAULT_CAPACITY];
	}

	// Constructor
	public LinearSet(int initialCapcity) {
		count = 0;
		content = (T[]) new Comparable[initialCapcity];
	}
	

	@Override
	public void add(T element) {
		if(element == null)
			throw new IllegalArgumentException("Null pointer denied!");
		else{
			if (!contains(element)) {

				if(size() == content.length)
					expandCapacity();
				
					content[count++] = element;
			}
		}
		
	}

	@Override
	public boolean contains(T element) {
		
		for (int index = 0; index < size(); index++) 
			if(content[index].compareTo(element) == 0)
				return true;
		
		return false;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public void printSet() {
		System.out.print("{");
		for(int i = 0; i < size(); i++)
		{
			System.out.print(content[i]);
				if(i < size() - 1)
					System.out.print(", ");
		}
		
		System.out.println("}");
	}

	@Override
	public void clear() {
		
		for (int i = 0; i < content.length; i++)
			content[i] = null;
		
		count = 0;
	}

	@Override
	public void addRange(T... range) {
		for (T t : range) {
			add(t);
		}
	}

	private void expandCapacity() {
		T[] temp = (T[])(new Comparable[content.length * 2]);
		
		for (int i = 0; i < size(); i++) 
			temp[i] = content[i];
		
		content = temp;
		
	}
}
