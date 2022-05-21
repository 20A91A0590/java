package hello;
import java.util.Scanner;
public class array{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         // double a[]=new double[101];
         // int a[]={10,20,30,40};
          //System.out.println(a[0]);
          //System.out.println(a[3]);
          /*for(int i=0;i<a.length;i++)
          System.out.println(a[i]);*/
        /*  for(int ele:a)
              System.out.println(ele);*/
		 /* int x[],n,i,sum=0;
          Scanner b=new Scanner(System.in);
          n=b.nextInt();
          x=new int[n];
          System.out.println("enter the "+n+" elements");
          for(i=0;i<n;i++)
          x[i]=b.nextInt();
        	  System.out.println("elements are in the array :");
         
          for(int ele:x)
          {
        	  System.out.println(ele);
          }*/
	/*for(i=0;i<n;i++)
        x[i]=b.nextInt();
           sum=sum+x[i];

System.out.println(sum);*/
         /* int n,x[],o[],e[],j=0,k=0;
          Scanner b=new Scanner(System.in);
          n=b.nextInt();
          x=new int[n];
          o=new int[n];
          e=new int[n];
	  for(int i=0;i<n;i++)
		  x[i]=b.nextInt();
	  for(int ele:x)
		  if(ele%2==0)
			  e[j++]=ele;
		  else
			  o[k++]=ele;
	  for(int i=0;i<j;i++)//it print all even no.
		 System.out.println(e[i]+" "); 
	  System.out.println(); 
	  for(int i=0;i<k;i++)//it print all odd no.
			 System.out.println(o[i]+" "); */
		/*int i,n,sal[],min,max,unq;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		sal=new int[n];
		int f[]=new int[n];
		System.out.println("enter the "+n+" salary");
		/*for( i=0;i<n;i++)
			  sal[i]=s.nextInt();
		min=sal[0];
		max=sal[0];
		unq=sal[0];
		/*for(int ele:sal)
		{
			if(min>ele)
				min=ele;
			else if(max<ele)
				max=ele;
		}*/
		
		/*for( i=0;i<sal[i];i++)
		{
			for(int j=0;j<sal[j];j++)
			{
				if(i==j) continue;
		      if(sal[i]==sal[j])
		         f[i]++;
		      for(i=0;i<sal.length;i++)
		    		if(f[i]==0)
			System.out.println(sal[i]);
		//System.out.println("minimum sal:"+min);
	//	System.out.println("maximum sal:"+max);
		//System.out.println("unique sal:"+unq);
*/

		Scanner s=new Scanner(System.in);
		int a[],n;
		System.out.println("enter n:");
		n=s.nextInt();
		a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=s.nextInt();
		int mx=a[0];
		int mn=a[0];
		int f[]=new int[n];
		for(int ele:a)
		System.out.println(ele);
		for(int ele:a)
		{
		if(ele>mx)
		mx=ele;
		}
		System.out.println("max ele:"+mx);
		for(int ele:a)
		{
		if(ele<mn)
		mn=ele;
		}
		System.out.println("mini ele:"+mn);
		for(int i=0;i<a.length;i++)
		{
		for(int j=0;j<a.length;j++)
		{
		if(i==j) continue;
		if(a[i]==a[j])
		f[i]++;
		}
		}
		for(int i=0;i<a.length;i++)
		{
		if(f[i]==0)
		System.out.print(a[i]+ " ");
		}
		}
	}
