import java.util.Scanner;


public class encry {

	public static void main(String[] args){
		 int sum=0,sum1=0,num;
				 int a;
				 int total=0;
	        Scanner sc=new Scanner(System.in);
	       
	        num=sc.nextInt();
	       
	        while(num>9)
	        {
	        	sum=sum+(num%10);
	        	num=num/10;
	        	if(num!=0)
	        	{	   a=num;
	        	 
	        	while(a!=0)
	        	{
	        		sum1=sum1+(a%10);
	        		a=a/10;
	        		 
	        	}
	        	
	        	}
	        	
	            } 	        	        
	       System.out.println(total=sum+sum1);
	           
	        }

	}


