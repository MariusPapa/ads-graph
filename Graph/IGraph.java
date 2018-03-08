package Graph;

public interface IGraph
{
   public void addEdge(String start, String end, double weight);

   public void addVertice(String vertice);

  // public Path computePath(String start, String end);

   public boolean containsEdge(String start, String end);

   public double getWeight(String start, String end);

   public int size();

   public int numberOfEdges();

   public void printGraph();

   public IGraph computeMinSpanningTree();

   public boolean isConnected();

   public boolean containsVertice(String element);

   public void removeEdge(String a, String b);

   public void removeVertice(String element);

   public void clear();

  // void setCollectionsToUse(CollectionFactory.PQType pqType,
   //      CollectionFactory.SetType setType);
}
