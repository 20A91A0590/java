package hello;

import java.util.Scanner;
import java.io.*;
class student
{
	Scanner s=new Scanner(System.in);
String rollno,name,branch,college;
int year;
float per_marks;
public void getdata()
{
System.out.println("enter rollno,name,branch,college");
rollno=s.nextLine();
name=s.nextLine();
branch=s.nextLine();
college=s.nextLine();
year=s.nextInt();
per_marks=s.nextFloat();
}
public void display()
{
System.out.println("ROLLNO=" +rollno);
System.out.println("NAME=" +name);
System.out.println("BRANCH=" +branch);
System.out.println("COLLEGE=" +college);
System.out.println("YEAR=" +year);
System.out.println("MARKS=" +per_marks);
}
public static void main(String args[])
{
student st=new student();
st.getdata();
st.display();
}
}
