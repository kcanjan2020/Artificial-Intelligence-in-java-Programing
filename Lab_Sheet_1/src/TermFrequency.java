
import java.util.Arrays;
import java.util.List;
public class TermFrequency  {
  public void printList(List<String>doc)
  {
    for(String word:doc)
    {
      System.out.print(word+"");
    }
    System.out.print("\n");
  }
  
  public void printListofLists(List<List<String>>docs)
  {
    for(List<String>doc: docs )
    {
      for(String word :doc)
      {
        System.out.print(word+" ");
      }
      System.out.print("\n");
    }
  }
  public int tf(List<String> doc,String Term)
  {
    int count=0;
    for(String w:doc)
    {
      if(w.equals(Term))
      {
        count++;
      }
    }
    return(count);
  }
  
  public static void main(String[] args)
  {
    int cnt;
    TermFrequency  freq = new TermFrequency();
    List<String> doc1 = Arrays.asList("the","sky","is","blue");
    List<String> doc2 = Arrays.asList("the","sun","is","bright");
    List<String> doc3= Arrays.asList("the","sun","in","the","sky","is","bright");
    List<List<String>> corpus = Arrays.asList(doc1,doc2,doc3);
    freq.printList(doc1);
    freq.printList(doc2);
    System.out.println("\nDocument Collection");
    freq.printListofLists(corpus);
    
    TermFrequency object = new TermFrequency();
     cnt=object.tf(doc3, "the");
     System.out.print("THE: "+cnt +"\n" );
    
  }

}
