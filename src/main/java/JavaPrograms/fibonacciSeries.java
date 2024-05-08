package JavaPrograms;

public class fibonacciSeries {

	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int n=0;
		
		for(int i=0; i<100; i++)
		{
			System.out.print(a+" ");
			
			n=a+b;
			a=b;
			b=n;
			if(n>100)
			{
				break;
			}
		}	

	}

}
