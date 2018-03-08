package Graph;

public class MainTest
{

   public static void main(String[] args)
   {
 
     
    Graph G=new Graph();
     G.addEdge("d", "c", 50);
     G.addEdge("d", "x", 33);
     G.addEdge("d","w", 10);
     G.removeEdge("d", "c");
     G.addVertice("d");
     G.addVertice("d");
     G.printGraph();
     System.out.println(G.size());
     System.out.println(G.numberOfEdges());
//     G.addEdge("f","g", 35);
//     G.addEdge("w", "k", 75);
//     G.addEdge("d", "g", 33);
//     G.addVertice("q");
//     G.addVertice("x");
//     G.addEdge("x", "w", 100);
//     
     
     
//    System.out.println("graph size "+G.size());
//     System.out.println("number of edges "+G.numberOfEdges());
//     System.out.println(G.containsVertice("q"));
//     System.out.println(G.containsEdge("d", "g"));
//     System.out.println(G.containsEdge("x", "w"));
//     System.out.println("graph before removing edges");
//     G.printGraph();
//     
//     
//     System.out.println(G.getWeight("f", "g"));
//     System.out.println(G.getWeight("w", "k"));
//     
//     
//     G.removeEdge("w", "x");
//     G.removeEdge("w", "k");
//     G.removeEdge("d", "c");
//     G.removeEdge("g", "f");
//     G.removeEdge("d", "g");
//     G.removeEdge("g", "d");
//     G.removeEdge("d", "c");
//     
//     
//     System.out.println(G.containsEdge("x", "w"));
//     
//     System.out.println(G.getWeight("w", "x"));
//     
//     System.out.println(G.size());
//     System.out.println(G.numberOfEdges());
//     System.out.println(G.getWeight("f", "g"));
//     System.out.println(G.getWeight("w", "k"));
//     System.out.println("graph after removing edges");
//     G.printGraph();
//     G.removeVertice("x");
//     System.out.println("after x was removed");
//     System.out.println(G.size());
//     System.out.println(G.numberOfEdges());
//     G.printGraph();
//     
//    
   
    
     
     

   }

}
