package JavaPrograms;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Amit";
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			 rev=rev+s.charAt(i);
		}
		System.out.println(rev);

	}

}
