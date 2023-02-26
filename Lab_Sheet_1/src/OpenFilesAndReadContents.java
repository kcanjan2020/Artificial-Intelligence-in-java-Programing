import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OpenFilesAndReadContents 
{
	public static void main(String[] args)
	{
		List<String> doc1 =new ArrayList<>();
		List<String> doc2 =new ArrayList<>();
		List<String> doc3 =new ArrayList<>();

		try
		{
		File file1=new File("D:\\Computer Engineering Note\\7th Sem\\1. Artificial  Intelligence\\Lab_Sheet_Solution\\Lab_Sheet_1\\sports.txt");
		File file2=new File("D:\\Computer Engineering Note\\7th Sem\\1. Artificial  Intelligence\\Lab_Sheet_Solution\\Lab_Sheet_1\\entertainment.txt");
		File file3=new File("D:\\Computer Engineering Note\\7th Sem\\1. Artificial  Intelligence\\Lab_Sheet_Solution\\Lab_Sheet_1\\business.txt");

		BufferedReader reader1 = new BufferedReader(new FileReader(file1));
		BufferedReader reader2 = new BufferedReader(new FileReader(file2));
		BufferedReader reader3 = new BufferedReader(new FileReader(file3));

		String line;
		while((line = reader1.readLine())!= null)
		{
			doc1.add(line);
		}
		reader1.close();
		
		while((line = reader2.readLine())!= null)
		{
			doc2.add(line);
		}
		reader2.close();
		
		while((line = reader3.readLine())!= null)
		{
			doc3.add(line);
		}
		reader3.close();
		
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("doc1:"+doc1);
		System.out.println("doc2:"+doc2);
		System.out.println("doc3:"+doc3);

	}
}
