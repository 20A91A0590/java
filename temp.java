import java.util.Scanner;
class temp
{
public static void main(String args[ ])
{
Scanner t= new Scanner(System.in);
int temp;
temp=t.nextInt( );
if(temp<0)
{
System.out.println("frezing point");
}
else if(temp>0 && temp<10)
{
System.out.println("cold");
}
else if(temp>10 && temp<20)
{
System.out.println("average");
}
else if(temp>20 && temp<30)
{
System.out.println("normal");
}
else if(temp>30 && temp<40)
{
System.out.println("hot");
}
else
{
System.out.println("very hot");
}
}
}

