package mperry;

import java.util.ArrayList;
import java.util.List;

import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;

public class Stack<T> {

	private List<T> list = new ArrayList<T>();
	
	@Requires({"item != null"})
	public void push(T item) {
		list.add(item);
	}
	
	@Requires({"size() > 0"})
	public void pop() {
		list.remove(index());
	}
	
	@Requires({"size() > 0"})
	@Ensures({"result == list.get(index())"})
	public T top() {
		return list.get(index());
	}
	
	public int size() {
		return list.size();
	}
	
	private int index() {
		return size() - 1;
	}
	
}
