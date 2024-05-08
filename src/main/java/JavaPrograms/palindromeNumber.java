package JavaPrograms;

public class palindromeNumber {

	public static void main(String[] args) {


        int n=1311;
        int temp=n;
		int r=0;
		int rev=0;
		
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}

	}

}
