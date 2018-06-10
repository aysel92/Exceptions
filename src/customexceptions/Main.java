package customexceptions;

public class Main {
// Main method comment add
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			throw new InvalidCardException();
		} catch (InvalidCardException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
