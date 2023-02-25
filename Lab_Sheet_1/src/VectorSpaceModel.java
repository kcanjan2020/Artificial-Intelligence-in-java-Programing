import java.util.Arrays;
import java.util.List;

//package VSM;

public class VectorSpaceModel 
{
	public static void main(String[] args)
	{
		VectorSpaceModel freq =new VectorSpaceModel();
		List<String> doc1 =Arrays.asList("Yesterday","England","defeated","India");
		List<String> doc2 =Arrays.asList("Yesterday","was","a","cold","day");
		List<String> doc3 =Arrays.asList("Yesterday","NepalCongress","organized","Rally");
		List<List<String>> corpus =Arrays.asList(doc1,doc2,doc3);

		/*//term specified count in all docs
		int x=0;
		for(List<String> doc:corpus)
		{
				
				x =x+freq.tf(doc,"Yesterday");	
		}
		System.out.print(x);
		*/
		double x=freq.tf(doc1,"Rally");
		double y=freq.tf(doc2,"Rally");
		double z=freq.tf(doc3,"Rally");
		
		double idf=freq.idf(corpus, "Rally");
		
		double m= freq.tfIdf(x,idf);
		double n= freq.tfIdf(y,idf);
		double o= freq.tfIdf(z,idf);

		//System.out.println(idf);
		//System.out.println(y);
		//System.out.println(z);

		if(m>n && m>o)
		{
			System.out.println("The word is more imp in doc 1");
		}
		else if(n>m && n>o)
		{
			System.out.println("The word is more imp in doc 2");

		}
		else if(o>m && o>n)
		{
			System.out.println("The word is more imp in doc 3");
		}
		else
		{
			System.out.println("The word is not in any documents");

		}

	}
	
	public void printList(List<String> doc)
	{
		for(String word : doc)
		{
			System.out.print(word+"");
		}
		System.out.print("\n");
	}
	
	public double tf(List<String> doc,String term)
	{
		int count=0;
		for(String w:doc)
		{
			if(w.equals(term))
			{
				count++;
			}
		}
		return (double)count/doc.size();
	}
	
	public double idf(List<List<String>> docs,String term)
	{
		double idf=0.0;
		int n=0;
	
		for(List<String> doc:docs)
		{
			
			if(doc.contains(term))
			{
				n++;
			}
			
		}
		idf=Math.log(docs.size()/(n));
		return idf;
	}
	
	public double tfIdf(double a,double b)
	{
		double mul=a*b;
		return mul;
	}
	
		
}
