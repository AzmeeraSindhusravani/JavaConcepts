package third;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collections {
public static void main(String[] args) {
	List<String> l=new ArrayList<String>();
	l.add("sravani");
	l.add("priyanka");
	l.add("sandhya");
	l.add("shiva");
	
	//Collections.sort(l);
	Comparator d=Collections.reverseOrder();
	Collections.sort(l,d);
	System.out.println(l);
   
}
}
