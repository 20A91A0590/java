package hello;
import java.io.*;
import java.util.Scanner;
/*class parent1
	 {
		 int x;
		 public void setx(int p)
		 {
			 x=p;
		 }
		 public int getx()
		 {
			 return x;
		 }
	 }
class child extends parent1
{
	int y;
	public void sety(int p)
	 {
		 y=p;
	 }

	public int gety()
	{
		return y;
	}
}
	 class inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("parent -> parent");	
parent1 p=new parent1();
p.setx(100);
System.out.println(p.getx());
System.out.println();
child c=new child();
c.setx(101);
System.out.println(c.getx());
c.sety(201);
System.out.println(c.gety());
System.out.println("parent -> child");
parent1 p1= new child();
p1.setx(301);
System.out.println(p1.getx());
	}
}*/
/*class grandparent
{
			 int x;
			 public void setx(int p)
			 {
				 x=p;
			 }
			 public int getx()
			 {
				 return x;
			 }
		 }
	class parent extends grandparent
	{
		int y;
		public void sety(int q)
		 {
			 y=q;
		 }

		public int gety()
		{
			return y;
		}
	}
	class child extends parent
	{
		int z;
		public void setz(int r)
		 {
			 z=r;
		 }

		public int getz()
		{
			return z;
		}
	}
		 class inheritance {
		public static void main(String[] args) {
			// TODO Auto-generated method stub	
			child c=new child();
			c.setx(100);
			c.sety(200);
			c.setz(300);
			System.out.println(c.getx());
			System.out.println(c.gety());
			System.out.println(c.getz());
			}
	}*/
/*class par1
{
	int x;
	public void setX(int p)
	{
		x=p;
	}
	public int getX()
	{
		return x;
	}
}
class child1 extends par1
{
	int y;
	public void setY(int p)
	{
		y=p;
	}
	public int getY()
	{
		return y;
	}
}
class child2 extends par1
{
	int z;
	public void setZ(int p)
	{
		z=p;
	}
	public int getZ()
	{
		return z;
	}
}
public class inheritance {

	public static void main(String[] args) {
		child1 c1=new child1();
		c1.setX(100);
		System.out.println(c1.getX());
		child2 c2=new child2();
		c2.setX(1000);
		System.out.println(c2.getX());
		
		// TODO Auto-generated method stub

	}

}*/
/*class  A
{
	public void display()
	{
		System.out.println("parent display method");
	}
	public void msg()
	{
		System.out.println("parent display method");
	}
}
class B extends A
{
	public void show()
	{
		super.display();
		System.out.println("child show method");
	}
	public void msg()
	{
		System.out.println("child msg method");
	}
}
public class inheritance {

	public static void main(String[] args) {
		B b=new B();
		b.display();
		b.msg();
		b.show();
		// TODO Auto-generated method stub

	}
}*/
class gp
{
int x;
gp(int x)
{
this.x=x;
}
void showx()
{
System.out.println("x="+x);
}
}
class cp extends gp
{
int y;
cp(int p,int q)
{
super(p);
y=q;
}
void showy()
{
System.out.println("y="+y);
}
}
class cp2 extends cp
{
int z;
cp2(int p,int q,int r)
{
super(p,q);
z=r;
}
void showz()
{
System.out.println("z="+z);
}
}
class thsu2
{
public static void main(String args[])
{
cp2 c=new cp2(1,2,3);
c.showx();
c.showy();
c.showz();
}
}
