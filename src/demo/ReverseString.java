package demo;

public class ReverseString {

	public static void main(String[] args) {
	
		
		String s="Shree";
		String rev="";
		int l=s.length();
		
		for(int i=l-1;i>=0;i-- )
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);

	}

	
	}


