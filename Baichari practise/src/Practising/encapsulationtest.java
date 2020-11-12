package Practising;

public class encapsulationtest {
private String name;
private int age;
public void setName(String originalname){
	name=originalname;}

	public String getName(){
		return name;
	}
	public void  setAge(int newage){
		age=newage;
}
	public int getAge(){
		return age;
	}
	public static void main(String[] args) {
		encapsulation e=new encapsulation();
		e.setName("sravani");
		System.out.println(e.getName());
		e.setAge(25);
		System.out.println(e.getAge());
	}
}

