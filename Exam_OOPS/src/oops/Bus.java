package oops;

public class Bus implements Branch1,  Branch2{
	public void CSE(){
		System.out.println("This Branch belongs to CSE");
	}
	public void Mech(){
		System.out.println("Tis Branch belongs to Mech");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bus B= new Bus();
B.CSE();
B.Mech();
	}

}
