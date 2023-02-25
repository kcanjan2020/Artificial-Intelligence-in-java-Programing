import java.util.HashMap;
import java.util.LinkedList;
public class Graph {
HashMap<Node,LinkedList<Node>>adjacencyMap;
boolean directed;
public void insertEdge(Node source,Node target)
{
 if(!adjacencyMap.keySet().contains(source))
 {
	 LinkedList<Node>tmp=new LinkedList<>();
	 tmp.add(target);
	 adjacencyMap.put(source,tmp);
 }
 else
 {
	 LinkedList<Node>tmp=adjacencyMap.get(source);
	 tmp.add(target);
	 adjacencyMap.put(source, tmp);
 }
}
public Graph(boolean dir)
{
	directed=dir;
	adjacencyMap=new HashMap<>();
}
//Display Graph
public void display()
{
	for(Node citys:adjacencyMap.keySet())
	{
		System.out.print(citys.getName()+":");
	
	for(Node neigh:adjacencyMap.get(citys))
	{
		System.out.print(neigh.getName()+",");
	}
	System.out.print("\n");
	}
}
}