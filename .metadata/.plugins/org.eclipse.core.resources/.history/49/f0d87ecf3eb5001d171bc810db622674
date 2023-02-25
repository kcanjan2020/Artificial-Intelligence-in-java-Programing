// node is the starting node in the graph
void breadthFirstSearch(GNode node) {

        // Handle an uninitialized Node
        if (node == null)
            return;

        // Creating the queue, and adding the start node
        LinkedList<GNode> queue = new LinkedList<GNode>();
        queue.add(node);

        while (!queue.isEmpty()) {
            GNode currentFirst = queue.removeFirst();

            // Check and skip that node if we have encountered it before
            if (currentFirst.isVisited())
                continue;

            // Mark the node as visited
            currentFirst.visit();
            System.out.print(currentFirst.getName() + " ");

            LinkedList<GNode> allNeighbors = adjacencyMap.get(currentFirst);

            // We have to check whether the list of neighbors is null before proceeding
            if (allNeighbors == null)
                continue;

            for (GNode neighbor : allNeighbors) {
                // We only add unvisited neighbors
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }