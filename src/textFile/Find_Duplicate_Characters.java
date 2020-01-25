package textFile;

public class Find_Duplicate_Characters {

	public static void main(String[] args) 
	{
		String str="java session srinu srinu java selenium selenium";
		String in="";
		
		for(int i=0; i<str.length()-1; i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(str.charAt(i)==str.charAt(j) && !in.contains(str.charAt(j)+""))
				{
					in=in+str.charAt(i);
				}
			}
		}
		System.out.println(in);
	}
}
