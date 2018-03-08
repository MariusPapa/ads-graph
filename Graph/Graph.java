package Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph implements IGraph
{
   private LinkedList<Vertice> graph;

   private int numOfEdges;

   public Graph()
   {
      this.graph = new LinkedList<Vertice>();

      this.numOfEdges = 0;
   }

   @Override
   public void addEdge(String start, String end, double weight)
   {
      Vertice startV = null;
      Vertice endV = null;
      for (Vertice vertice : graph)
      {

         if (vertice.getName().equals(start))
            startV = vertice;

         if (vertice.getName().equals(end))
            endV = vertice;

         if (startV != null && endV != null)
            break;
      }

      if (startV == null)
      {
         startV = new Vertice(start);
         this.graph.add(startV);

      }
      if (endV == null)
      {
         endV = new Vertice(end);
         this.graph.add(endV);

      }
      if (containsEdge(startV.getName(), endV.getName()) == false)
      {
         startV.addEdge(new Edge(weight, endV));

         // endV.addEdge(new Edge(weight, startV));
         this.numOfEdges++;
      }
      if (containsEdge(endV.getName(), startV.getName()) == false)
      {
         // startV.addEdge(new Edge(weight, endV));

         endV.addEdge(new Edge(weight, startV));
         // this.numOfEdges++;
      }

   }

   @Override
   public void addVertice(String vertice)
   {
      if(containsVertice(vertice)==false)
      this.graph.add(new Vertice(vertice));

   }

   @Override
   public boolean containsEdge(String start, String end)
   {
      for (Vertice vertice : graph)
      {
         if (vertice.getName().equals(start))
         {
            for (Edge edge : vertice.getEdges())
               if (edge.getTargetVertice().getName().equals(end))
                  return true;
         }

      }
      return false;
   }

   @Override
   public double getWeight(String start, String end)
   {

      for (Vertice vertice : graph)
      {
         if (vertice.getName().equals(start))
         {
            for (Edge edge : vertice.getEdges())
               if (edge.getTargetVertice().getName().equals(end))
                  return edge.getWeight();
         }

      }

      return -1;
   }

   @Override
   public int size()
   {
      return graph.size();
   }

   @Override
   public int numberOfEdges()
   {
      return this.numOfEdges;

   }

   @Override
   public void printGraph()
   {

      for (Vertice vertice : graph)
      {
         if (vertice.getEdges().size() == 0)
            System.out.println("{" + vertice.getName() + "}");
         System.out.println(vertice.printEdges() + "\n");

      }

   }

   @Override
   public IGraph computeMinSpanningTree()
   {
      // TODO Auto-generated method stub
      return null;
   }

   @Override
   public boolean isConnected()
   {
      // TODO Auto-generated method stub
      return false;
   }

   @Override
   public boolean containsVertice(String element)
   {
      for (Vertice vertice : graph)
      {
         if (vertice.getName().equals(element))
            return true;
      }
      return false;
   }

   @Override
   public void removeEdge(String a, String b)
   {

      int flag = 0;
      for (Vertice vertice : graph)
      {

         if (vertice.getName().equals(a) || vertice.getName().equals(b))

            for (int i = 0; i < vertice.getEdges().size(); i++)
            {

               if (vertice.getEdges().get(i).getTargetVertice().getName()
                     .equals(a))
               {

                  vertice.getEdges().remove(i);
                  flag++;

               }
               else if (vertice.getEdges().get(i).getTargetVertice().getName()
                     .equals(b))
               {

                  vertice.getEdges().remove(i);
                  flag++;

               }
               if (flag == 2)
               {
                  this.numOfEdges--;
                  break;
               }
            }

      }

   }

   @Override
   public void removeVertice(String element)
   {
      // if(containsVertice(element)==true)
      for (int i=0;i<graph.size();i++)
      {

         for (int j=0;j< graph.get(i).getEdges().size();j++)
            if (graph.get(i).getEdges().get(j).getTargetVertice().getName().equals(element))
               graph.get(i).getEdges().

         if (vertice.getName().equals(element))
            graph.remove(vertice);
      }

   }

   @Override
   public void clear()
   {
      this.graph = new LinkedList<Vertice>();

   }

}
