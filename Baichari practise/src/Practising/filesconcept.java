package Practising;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filesconcept {
	public static void main(String[] args) throws IOException {

   /* { 

        // Accept a string  

        String str = "Filee";

  

        // attach a file to FileWriter  

        FileWriter fw=new FileWriter("C:\\Users\\User\\Desktop\\sravs (2).txt");
      
        fw.write(str);

        System.out.println("Writing successful"); 

        //close the file  

       fw.close(); 

    }*/
	FileWriter fw=new FileWriter("C:\\Users\\User\\Desktop\\p.txt");
	String str="im priyanka from khammam";
	fw.write(str);
	System.out.println("writing is successfull");
	fw.close();
}}
