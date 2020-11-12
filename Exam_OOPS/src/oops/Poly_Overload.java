package oops;

public class Poly_Overload {
	public void Poly(int i, String name)
	{
		System.out.println(i+" "+name);
		
	}
    public static void Poly(int i, String name, double d){
    	System.out.println(i+" "+name+" "+d);
    }
    public void Poly(int i, String name, double d, float f){
    	System.out.println(i+" "+name+" "+d+" "+f);
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Poly_Overload o= new Poly_Overload();
o.Poly(10, "Shiva", 5000, 5.5f);

	}

}
