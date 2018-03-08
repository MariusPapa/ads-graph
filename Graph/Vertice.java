package Graph;

import java.util.LinkedList;
import java.util.List;

public class Vertice
{
   private String name;
   private LinkedList<Edge> edges;

   public Vertice(String name)
   {
      this.name = name;
      this.edges = new LinkedList<>();
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public LinkedList<Edge> getEdges()
   {
      return edges;
   }

   public String printEdges()
   {
      String edges = "";
      for (Edge edge : this.edges)
      {

         edges += "{" + this.name + "," + edge.getTargetVertice().getName()
               + "," + edge.getWeight() + "}";
      }
      return edges;
   }

   public void addEdge(Edge edge)
   {
      this.edges.add(edge);
   }
   public Edge getEdge(String verticeTarget)
   {
      for(int i=0;i<this.edges.size();i++)
         if(edges.get(i).getTargetVertice().equals(verticeTarget))
            return edges.get(i);
      return null;
   }

}
