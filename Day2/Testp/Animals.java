
public class Animals  implements eat, water {
		public void eat1(){
			System.out.println("Animal is eating");
		}
		public void water1(){
			System.out.println("Animal is watering");
		}
		public static void main(String[] args) {
			Animals s=new Animals();
			s.eat1();
			s.water1();
		}
		}
	