package pro;

public class StringReverse {

	public static void main(String[] args) 
	{
		String value="Prakash";
		
		char a[]=value.toCharArray();
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
