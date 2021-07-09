																			qaA	1// Time complexity: O(|V|+|E|) BB-QUEUE
// Space complexity: O(|V|)

static class Graph{
  HashMap<Integer,ArrayList<Integer>> adjList;

  Graph(){
    this.adjList = new HashMap<>();
  }
  Graph(HashMap<Integer,ArrayList<Integer>> adjList){
    this.adjList = adjList;
  }
}

static void bfs(Graph graph, int root){
  ArrayList<Integer> queue = new ArrayList<>();
  queue.add(root);
  Set<Integer> visited = new HashSet<>();
  visited.add(root);
  int i = 0;
  while(i < queue.size()){
    int current = queue.get(i++);
    System.out.println(current);
    for(int neighbor : graph.adjList.get(current)){
      if(!visited.contains(neighbor){
        queue.add(neighbor);
        visited.add(neighbor);
      }
    }
  }
}





















GRAPH-BFS