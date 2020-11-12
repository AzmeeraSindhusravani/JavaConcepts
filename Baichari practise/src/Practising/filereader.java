package Practising;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereader {
/*public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("C:\\Users\\User\\Desktop\\sravs (2).txt");    
    int i;    
    while((i=fr.read())!=-1)    
    System.out.print((char)i);    
    fr.close();    
}*/
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("C:\\Users\\User\\Desktop\\p.txt");
	int i;
	while((i=fr.read())!=-1)
		System.out.println((char)i);
	fr.close();
}
	
	
	
	
	
	
}
