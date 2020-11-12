package Dummy;

public class StringConcept {
public static void main(String[] args) {
String st="Mummy"; 
String st1="mummy";
st.concat("daddy");
System.out.println(st);
System.out.println(st.toUpperCase());
System.out.println(st.toLowerCase());
System.out.println(st.charAt(1));
System.out.println(st);
System.out.println(st.equalsIgnoreCase(st1));
System.out.println(st.length());
System.out.println(st.replace(st, "daddy"));
/*StringBuffer sb=new StringBuffer("azmeera");
sb.append("sravani");
System.out.println(sb);

StringBuilder SB=new StringBuilder("pavurala");
SB.append("seshu");
System.out.println(SB);*/
}
}