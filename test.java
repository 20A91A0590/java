package hello;
import java.util.Scanner;
public class test {
public void method(int i)
{
	System.out.println("int-arg method");
}
public void method(float f)
{
	System.out.println("float-arg method");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           test t=new test();
           t.method('r');
           t.method(10.2f);
           t.method(45);
	}

}
