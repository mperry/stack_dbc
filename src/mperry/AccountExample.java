package mperry;

public class AccountExample {

	
	public static void main(String args[]) {
		new AccountExample();
	}
	
	public AccountExample() {
		test1();
	}

	private void test1() {
		// TODO Auto-generated method stub
		Account a1 = new Account(8);
		Account a2 = new Account(10);
		a1.transferTo(a1,  4);
	}
	
	
	
}
