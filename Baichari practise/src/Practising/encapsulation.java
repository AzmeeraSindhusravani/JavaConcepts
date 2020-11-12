package Practising;

public class encapsulation {
private String name;
private int age;
private int rollnumber;
public void setName(String originalname){
 name=originalname;
}
 public String getName(){
	 return name;
 
}
 public void setAge(int newage){
	 age=newage;
 }
 public int getAge(){
	 return age;
 }
 public static void main(String[] args) {
	encapsulation encap=new encapsulation();
	encap.setName("shiva");
	encap.getName();
	System.out.println(encap.getName());
	encap.setAge(23);
	encap.getAge();
	System.out.println(encap.getAge());
}
}