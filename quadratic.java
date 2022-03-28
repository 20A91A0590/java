import java.util.Scanner;
class quadratic
{
public static void main (String args[ ])
{
Scanner q=new Scanner(System.in);
double a,b,c,r1,r2,d,e;
a=q.nextDouble( );
b=q.nextDouble( );
c=q.nextDouble( );
d=b*b-4*a*c;
e=2*a;
if(d>0)
{
r1=(-b+Math.sqrt(d))/e;
r2=(-b-Math.sqrt(d))/e;
System.out.printf("r1= %2f and r2=%2f",r1,r2);
}
else if(d==0)
{
r1=r2=-b/e;
System.out.printf("r1=r2=%2f:",r1);
}
else
{
System.out.printf("complex number");
double real=-b/e;
double img=Math.sqrt(-d)/e;
System.out.printf("r1=%2f+%2fi",real,img);
System.out.printf("r1=%2f-%2fi",real,img);
}
}
}




