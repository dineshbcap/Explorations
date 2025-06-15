package custom_exception;

public class CustomExceptions extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomExceptions(String message, Throwable cause){
		super("Reach::: "+message);
		
	}

}
