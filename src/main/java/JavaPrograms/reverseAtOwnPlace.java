package JavaPrograms;

public class reverseAtOwnPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Amit Yadav";
		
		String[] s=a.split(" ");
		
		String rev="";
		
		for(int i=0; i<s.length; i++)
		{
			for(int j=s[i].length()-1; j>=0; j--)
			{
				rev=rev+s[i].charAt(j);
			}
			rev=rev+" ";
		}
		System.out.println(rev);

	}

}
