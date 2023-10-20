package sample;

public class PalindromString {	
	
	public void stringCheck(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		String reverseStr;
		
		sb.reverse();
		reverseStr = sb.toString();
		
		if(str.equalsIgnoreCase(reverseStr))
		{
			System.out.println("String "+str+" is palindrom");
		}
		else
		{
			//System.out.println(temp1 +" "+reverseStr1 );
			System.out.println("String "+str+" is not palindrom");
		}	
	}
	
	public static void main(String[] args) 
	{
		PalindromString str = new PalindromString();
		str.stringCheck("Java");
		str.stringCheck("Malayalam");
	}

}
