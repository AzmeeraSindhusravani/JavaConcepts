package firstPac;

public class Overloading1 {
public static void AB(String name,int age){
	System.out.println(name);
	System.out.println(age);
}	
public static void AB(String name,int age,int pincode){
	System.out.println(name);
	System.out.println(age);
	System.out.println(pincode);
	}
public static void AB(String name,int age,int pincode,String village){
	System.out.println(name+" "+age+" "+pincode+" "+village);
	//System.out.println(age);
	//System.out.println(pincode);
	//System.out.println(village);
	
}
public static void main(String[] args) {
	Overloading1.AB("sravani", 25);
	Overloading1.AB("priyanka", 22, 507122);
}
}
