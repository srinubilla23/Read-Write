package textFile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fblogin_via_textFile_Data //Text File Reading
{
	public static void main(String[] args) throws Exception
	{
		File file1=new File("E:\\Download\\SCH\\Textfile.txt");
		FileReader fr=new FileReader(file1);
		BufferedReader br=new BufferedReader(fr);
		File file2=new File("E:\\Download\\SCH\\Textfile_copy.txt");
		FileWriter fw=new FileWriter(file2);
		BufferedWriter bw=new BufferedWriter(fw);		
		Pattern p=Pattern.compile("[\"a-z A-Z\"]");		
		String l="";		
		while((l=br.readLine()) != null)
		{
			Matcher m=p.matcher(l);
			while(m.find())
			{
				bw.write(m.group());
				bw.newLine();
			}
		}
		bw.close();
		fw.close();
		br.close();
		fr.close();
		
		System.out.println(bw);
	}
}
