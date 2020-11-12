package third;

public class encap {
private String name;
private int age;
public void setName(String newname){
	name=newname;
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
	encap e=new encap();
	e.setName("seshu");
	e.setAge(26);
	System.out.println(e.getName());
	System.out.println(e.getAge());
}

}
