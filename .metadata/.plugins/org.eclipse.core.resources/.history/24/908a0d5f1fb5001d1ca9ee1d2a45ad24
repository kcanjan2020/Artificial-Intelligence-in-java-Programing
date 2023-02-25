import java.util.HashMap;
import java.util.LinkedList;

public class Graph 
{
	HashMap<Node,LinkedList<Node>> adjacencyMap;
	boolean directed;
	
	public Graph(boolean dir)
	{
		adjacencyMap=new HashMap<>();
		directed=dir;
	}
	
	public void insertEdge(Node source,Node target)
	{
		if(! adjacencyMap.keySet().contains(source))
		{
			LinkedList<Node> tmp=new LinkedList<>();
			tmp.add(target);
			adjacencyMap.put(source, tmp);
		}
		else
		{
			LinkedList<Node> tmp=adjacencyMap.get(source);
			tmp.add(target);
			adjacencyMap.put(source, tmp);
		}
	}
	
	public void printEdges()
	{
		for(Node n:adjacencyMap.keySet())
		{
			LinkedList<Node> tmp=adjacencyMap.get(n);
			System.out.print(n.getname()+": ");
			String coll="";
			for(Node n1 :tmp)
			{
				 coll+=n1.getname()+",";
					
				//System.out.print(n1.getname()+",");
			}
			coll=coll.substring(0, coll.length()-1);
			System.out.print(coll);
			System.out.println();
		}
	}
	public HashMap<Node,LinkedList<Node>> getAdjacency()
	{
		return adjacencyMap;
	}
	

}
