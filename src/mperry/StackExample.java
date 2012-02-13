package mperry;

public class StackExample {
	
	public static void main(String args[]) {
		new StackExample();
	}
	
	public StackExample() {
		test1();
	}

	private void test1() {
		Stack<Integer> s = new Stack<Integer>();
		s.push(-1);
		s.push(5);
		s.push(6);
		System.out.println("stack size: " + s.size() + " top: " + s.top());
	}
	
}
