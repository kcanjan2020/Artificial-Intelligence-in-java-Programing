import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CosineSimilarity 
{
	public static void main(String[] args)
	{
		List<String> doc1= Arrays.asList("Hello","Word");
		List<String> doc2= Arrays.asList("Hello","World");
		
		double similarity = cosineSimilarity(doc1, doc2);
		System.out.println("Similarity between two strings is:" +similarity);
	}
	
	public static double cosineSimilarity(List<String> doc1, List<String> doc2)
	{
		Map<String,Integer> vec1 = getVector(doc1);
		Map<String,Integer> vec2 = getVector(doc2);
		
		return getCosineSim(vec1,vec2);
	}
	
	public static Map<String, Integer> getVector(List<String> doc1)
	{
		Map<String,Integer> vector = new HashMap<String,Integer>();
		
		for(String word :doc1)
		{
			if(!vector.containsKey(word))
			{
				vector.put(word,1);
			}
			else
			{
				vector.put(word, vector.get(word) + 1);
			}
		}
		return vector;
	}
	
	public static double getCosineSim(Map<String,Integer> vec1,Map<String,Integer> vec2)
	{
		double dotProd =0.0;
		double normVec1 =0.0;
		double normVec2 =0.0;
		
		for(String word:vec1.keySet())
		{
			if(vec2.containsKey(word))
			{
				dotProd += vec1.get(word) * vec2.get(word);
			}
			normVec1 += Math.pow(vec1.get(word), 2);
		}
		
		for(String word:vec2.keySet())
		{
			normVec2 += Math.pow(vec2.get(word), 2);
		}

		normVec1 =Math.sqrt(normVec1);
		normVec2 =Math.sqrt(normVec2);
		
		if(normVec1 ==0 || normVec2==0)
		{
			return 0.0;
		}
		else
		{
			return dotProd/(normVec1*normVec2);
		}
	}
}
