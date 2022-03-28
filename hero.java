import java.util.Scanner;
class hero
{
public static void main(String args[ ])
{
Scanner h=new Scanner(System.in);
int h1,a1,f1,h2,a2,f2,t1,t2;
String hero1,hero2;
hero1=h.nextLine();
h1=h.nextInt();
a1=h.nextInt();
f1=h.nextInt();
hero2=h.nextLine();
h.next();
h2=h.nextInt();
a2=h.nextInt();
f2=h.nextInt();
t1=h1*10+a1*5+f1*(-5);
t2=h2*10+a2*5+f2*(-5);
if(t1>t2)
{
System.out.println(hero1+ " is the best hero " +t1+ " points");
}
else
{
System.out.println(hero2+ " is the best hero " +t2+ " points");
}
}
}
