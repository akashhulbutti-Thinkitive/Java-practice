package collections.practice;

import java.util.ArrayList;
import java.util.List;

public class MyStack<E> {
	List<E> l = new ArrayList<E>();
	public int length = l.size();

	public void push(E data) {
		length++;
		l.add(data);
	}

	public E pop() {
		if (l.size() != 0) {
			length--;
			return l.remove(l.size() - 1);
		}
		return null;
	}

	public void printAllStackData() {
		System.out.println(l);
	}
}
