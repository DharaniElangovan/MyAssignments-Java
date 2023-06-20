 package Sample;

public class StringSpaceJ1 {

	

public static void main(String[] args) {
 //String s = "   fly me   to   the moon  ";
 //String s ="Hello World";
String s ="luffy is still joyboy";
 char ch ='-';
 String strim = s.trim().replace(' ', ch); 
 System.out.println(strim+" "+strim.length());
 char[] strimArray = strim.toCharArray();
 System.out.println(strimArray.length);
 StringBuilder ls= new StringBuilder();

for (int i=strimArray.length-1; i<=strimArray.length;i--) {
	if (strimArray[i]!='-') {
	
		ls.append(strimArray[i]);
	}	 
	if (strimArray[i]=='-') {
		break;
		} System.out.println(ls);}
StringBuilder lf = ls.reverse();
int l = lf.length();
	System.out.println("Length of the last word :"+lf+ " is "+l);
	}}

 



