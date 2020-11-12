package weekTest_1;

public class Overload1 {
	public void HomeNeed(String name, int item){
		System.out.println(name);
		System.out.println(item);
	}
	public void HomeNeed(String name, int item, double amount){
		System.out.println(name+" "+item+" "+amount);
	}
	public void HomeNeed(String name, int item, double amount, float money){
		System.out.println(name+" "+item+" "+amount+""+money);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overload1 o= new Overload1();
o.HomeNeed("rice", 2, 50, 50.00f);
	}

}
