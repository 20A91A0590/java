import java.util.Scanner;
class rectangle
{
Scanner r=new Scanner(System.in);
int l,b,h;
public void getdata()
{
l=r.nextInt();
b=r.nextInt();
h=r.nextInt();
}
public int cal_area()
{
return l*b;
}
public int cal_volume()
{
return l*b*h;
}
public static void main(String args[])
{
rectangle rt=new rectangle();
rt.getdata();
int area=rt.cal_area();
int volume=rt.cal_volume();
rectangle r2=new rectangle();
r2.l=10;
r2.b=20;
r2.h=30;
area=r2.cal_area();
volume=r2.cal_volume();
System.out.println(area);
System.out.println(volume);
}
}
