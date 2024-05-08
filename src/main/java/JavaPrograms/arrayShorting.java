package JavaPrograms;

import java.util.Arrays;

public class arrayShorting {

	public static void main(String[] args) 
	{
		int n[]= {2,4,3,1,5,9,8,7,6,10,0};
		
		for(int i=0; i<n.length; i++)
		{
			for(int j=i+1; j<n.length; j++)
			{
				if(n[i]>n[j])
				{
					int temp = n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(n));
		
		System.out.println("Smallest number"+" "+n[0]);
		
		System.out.println("Largest number"+" "+n[n.length-1]);

	}

}
