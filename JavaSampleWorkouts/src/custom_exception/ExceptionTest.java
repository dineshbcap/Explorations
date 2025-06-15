package custom_exception;

public class ExceptionTest {
	public static void main(String ar[]) throws CustomExceptions{
		try{
			System.out.println(10/0);
		}
		catch (ArithmeticException e) {
			try{
				throw new CustomExceptions("divide by zeero", e);
			}catch(Exception e1){
				System.out.println(e1);
			}
			System.out.println("I will workdddd");
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("I will work");
		}
		
		System.out.println("I will work");
	}
}
