package JavaPrograms;

import java.util.Scanner;

public class primeCompositeNumber {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num=sc.nextInt();
		sc.close();
		int flag=0;
		if(num==0 || num==1)
		{
			System.out.println("Not a prime number");
		}
		else
		{
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					System.out.println("Number is not prime");
					flag=1;
					break;
				}
				
			}
				if(flag==0)
				{
					System.out.println("Number is prime");
				}
				
		}

	}

}
