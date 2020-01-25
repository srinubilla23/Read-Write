package textFile;

public class Count_Repeated_words {

	public static void main(String[] args) 
	{
		String str="java session srinu srinu java selenium selenium";
		String[] string=str.split("");
		int count = 1;
		
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(string[i].equals(string[j]))
				{
					count=count+1;
					string[j]="0";
				}
			}
			if(string[i]!="0")
			System.out.println(string[i]+"--"+count); 
			count=1;
		}
	}

}
