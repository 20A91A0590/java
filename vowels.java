package hello;
import java.util.Scanner;
public class vowels {
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   Scanner br=new Scanner(System.in);
	   string input;
	   int v=0,c=0;
	   input = br.nextLine();
	   char x[]=input.toCharArray();
	   for(int i=0;i<x.length;i++)
	   {
		   if(x[i]=='a' ||x[i]=='e' ||x[i]=='i' ||x[i]=='o' ||x[i]=='u' )
			   v++;
		   else
			   c++;
	   }
	   System.out.println(v+ " ");
	   /
	   Scanner s=new Scanner(System.in);
		 String st1;
		 StringBuffer s1;
		 st1=s.nextLine();
		 String words[]=st1.split(" ");
		 for(int i=0;i<words.length;i++)
		 {
			 s1=new StringBuffer(words[i]);
			System.out.println(s1.reverse()+" ");
		 }
	   
	}

}
