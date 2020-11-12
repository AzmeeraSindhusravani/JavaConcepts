package third;

public class exception {

	public static void main(String[] args) {
		
		try{
			int num1=20;
			int num2=60;
			int z=num2/num1;
			System.out.println(z);
		}catch(ArithmeticException e){
			e.printStackTrace();
		}finally {
			System.out.println("3");
		}

	}

}
