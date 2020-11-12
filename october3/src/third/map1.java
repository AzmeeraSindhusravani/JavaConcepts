package third;

import java.util.HashMap;
import java.util.Map;

public class map1 {

	public static void main(String[] args) {
		Map m=new HashMap<>();
		m .put(101, "south");
		m.put(103, "north");
		m.put(104, "north");
		m.put(103, "east");
		System.out.println(m.entrySet());
       System.out.println (m.keySet());
       System.out.println(m.values());
        System.out.println(m);
	}

}
