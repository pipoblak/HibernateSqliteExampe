
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersistenceTest test = new PersistenceTest();
		test.setup();
		
		test.saveMessage();
		test.readMessage();
	}

}
