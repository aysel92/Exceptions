package customexceptions;

public class InvalidPincodeException extends RuntimeException {

	
	public InvalidPincodeException() {
		super();
		
	}
	
	public InvalidPincodeException(String message) {
		super(message);
	}
	
	
	public static void main(String[] args) {
		
		throw new InvalidPincodeException("Cotco card not accepted");
		
		
		
		
	}
	
	
}
