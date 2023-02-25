
public class Search 
{
	public static void main(String[] args)
	{
		Node n1=new Node(1,"Arad",false);
		Node n2=new Node(2,"Zerind",false);
		Node n3=new Node(3,"Siblu",false);
		Node n4=new Node(4,"Timisara",false);
		Node n5=new Node(5,"Oradea",false);
		Node n6=new Node(6,"Lugoj",false);
		Node n7=new Node(7,"Mehadia",false);
		Node n8=new Node(8,"Dobreta",false);
		Node n9=new Node(9,"Rimnicu Vilcea",false);
		Node n10=new Node(10,"Fagaras",false);
		Node n11=new Node(11,"Pitesti",false);
		Node n12=new Node(12,"Craiova",false);
		Node n13=new Node(13,"Bucharest",false);
		Node n14=new Node(14,"Glurglu",false);
		Node n15=new Node(15,"Urziceni",false);

		
		Graph graph=new Graph(false);
		graph.insertEdge(n1, n2);
		graph.insertEdge(n1, n3);
		graph.insertEdge(n1, n4);

		graph.insertEdge(n2, n1);
		graph.insertEdge(n2, n5);
		
		graph.insertEdge(n3, n1);
		graph.insertEdge(n3, n10);
		graph.insertEdge(n3, n9);
		
		graph.insertEdge(n4, n1);
		graph.insertEdge(n4, n6);
		
		graph.insertEdge(n5, n2);
		graph.insertEdge(n5, n3);
		
		graph.insertEdge(n6, n4);
		graph.insertEdge(n6, n7);
		
		graph.insertEdge(n7, n6);
		graph.insertEdge(n7, n8);
		
		graph.insertEdge(n8, n7);
		graph.insertEdge(n8, n2);
		
		graph.insertEdge(n9, n3);
		graph.insertEdge(n9, n2);
		graph.insertEdge(n9, n11);
		
		graph.insertEdge(n10, n3);
		graph.insertEdge(n10, n13);
		
		graph.insertEdge(n11, n9);
		graph.insertEdge(n11, n13);
		graph.insertEdge(n11, n14);
		
		graph.insertEdge(n12, n8);
		graph.insertEdge(n12, n9);
		graph.insertEdge(n12, n11);
		
		graph.insertEdge(n13, n10);
		graph.insertEdge(n13, n11);
		graph.insertEdge(n13, n14);
		graph.insertEdge(n13, n15);

		
		graph.insertEdge(n14, n13);
		
		
		graph.insertEdge(n15, n13);
	
		
		
		
		//graph.printEdges();
		
		//DFS dfs =new DFS();
		//dfs.dfsSearch(n1, graph);
		
		BFS bfs =new BFS();
		bfs.bfsSearch(n1, graph);

	}


}
