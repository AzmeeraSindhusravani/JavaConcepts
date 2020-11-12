package Projectone;

public class Multipleinheritance implements Multiple,Multiple2 {
public  void chair(){
	System.out.println("plastic chair");
}
public  void Sofa(){
	System.out.println("furniture sofa");
}
public static void main(String[] args) {
	Multipleinheritance u=new Multipleinheritance();
	u.chair();
	u.Sofa();
}
}
