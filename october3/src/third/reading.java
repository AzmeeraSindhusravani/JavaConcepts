package third;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class reading {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\User\\Desktop\\Test10\\october3\\src\\third\\bcv.txt");
		int i=fr.read();
		while(i!=-1){
			System.out.println((char)i);
			i=fr.read();
			
		}
	}

}
