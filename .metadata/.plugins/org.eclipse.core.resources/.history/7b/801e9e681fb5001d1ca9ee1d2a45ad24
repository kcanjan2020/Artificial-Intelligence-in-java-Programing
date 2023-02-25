import java.util.LinkedList;

public class DFS 
{
	public void dfsSearch(Node start,Graph g)
	{
		start.visit();
		LinkedList<Node> neigh= g.getAdjacency().get(start);
		
		for(Node n:neigh)
		{
			if(!n.visited)
			{
				dfsSearch(n,g);
			}
		}
	}
}
