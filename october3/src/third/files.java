package third;

import java.io.FileWriter;
import java.io.IOException;

public class files {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("C:\\Users\\User\\Desktop\\Test10\\october3\\src\\third\\bcv.txt");
	String str="File";
	fw.write(str);
	fw.close();
}
	
	
}
	


