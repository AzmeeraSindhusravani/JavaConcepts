package Projectone;

public class Overloading {
public static void AC(String name,int age){
	System.out.println(name);
	System.out.println(age);
	
}
public static void AC(String name,int age,int pincode){
	System.out.println(name);
	System.out.println(age);
	System.out.println(pincode);
}

public static void AC(String name,int age,String village,int rollnumber){
	System.out.println(name);
	System.out.println(age);
	System.out.println(village);
	System.out.println(rollnumber);
}	
public static void main(String[] args) {
	Overloading.AC("sravani", 26);
}



}
