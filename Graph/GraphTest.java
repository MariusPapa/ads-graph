package Graph;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GraphTest
{

private IGraph g;
   
   @Before
   public void setup()
   {
       g = new Graph();
   }
   
   @Test
   public void addEdgeTest1() {
      g.addEdge("A", "B", 1);
      
      assertTrue(g.containsVertice("A"));
      assertTrue(g.containsVertice("B"));
      assertTrue(g.containsEdge("A", "B"));
      assertTrue(g.getWeight("A", "B") == 1);
   }
   
   @Test
   public void addEdgeTest2()
   {
      g.addEdge("A", "B", 1);
      g.addEdge("A", "B", 2);
      
      assertFalse(g.getWeight("A", "B") == 2);
   }
   @Test
   public void addEdgeTest3()
   {
      g.addEdge("A", "B", 1);
      assertTrue(g.getWeight("A", "B") == g.getWeight("B", "A"));
   }
   @Test
   public void addEdgeTest4()
   {
      g.addEdge("A", "B", 1);
      g.addEdge("A", "C", 4);
      
      assertTrue(g.size() == 3);
   }
   @Test
   public void addVerticeTest1()
   {
      g.addVertice("A");
      
      assertTrue(g.size() == 1);
   }
   @Test
   public void addVerticeTest2()
   {
      g.addVertice("A");
      g.addVertice("A");
      g.addVertice("A");
      
      assertTrue(g.size() == 1); 
   }
   @Test
   public void addVerticeTest3()
   {
      g.addVertice("A");
      g.addVertice("B");
      g.addVertice("C");
      
      assertTrue(g.size() == 3); 
   }
   
   @Test
   public void containsEdgeTest1()
   {
      g.addEdge("A", "B", 1);
      g.addEdge("A", "C", 2);
      g.addEdge("A", "D", 4);
      g.addEdge("D", "B", 5);
      
      assertTrue(g.containsEdge("A", "B"));
      assertTrue(g.containsEdge("A", "C"));
      assertTrue(g.containsEdge("A", "D"));
      assertTrue(g.containsEdge("D", "B"));
      assertTrue(g.containsEdge("D", "A"));
      assertFalse(g.containsEdge("D", "C"));
      assertFalse(g.containsEdge("B", "C"));
   }
   
   @Test
   public void containsEdgeTest2()
   {  
      assertFalse(g.containsEdge("A", "C"));
   }
   
   @Test
   public void containsEdgeTest3()
   {
      g.addEdge("A", "B", 1);
      g.addEdge("A", "C", 2);
      g.addEdge("A", "D", 4);
      g.addEdge("D", "B", 5);
      
      assertFalse(g.containsEdge("D", "M"));
      assertFalse(g.containsEdge("B", "Z"));
   }
   
   
   @Test
   public void getWeightTest1()
   {
      g.addEdge("A", "B", 1);
      
      assertTrue(g.getWeight("A", "B") == 1);
      assertTrue(g.getWeight("B", "A") == 1);
      assertTrue(g.getWeight("A", "B") == g.getWeight("B", "A"));
   }
   
   @Test
   public void getWeightTest2()
   {
      g.addEdge("A", "B", 1);
      
      assertTrue(g.getWeight("A", "Z") == -1);

   }
   
   @Test
   public void getWeightTest3()
   {
      g.addEdge("A", "B", 1);
      g.addEdge("A", "C", 2);
      g.addEdge("A", "D", 4);
      g.addEdge("D", "B", 5);
      
      assertTrue(g.getWeight("D", "C") == -1);
   }
   
   @Test
   public void sizeTest1()
   {
      g.addVertice("A");
      
      assertTrue(g.size() == 1);
   }
   
   @Test
   public void sizeTest2()
   {
      g.addVertice("A");
      g.addVertice("A");
      g.addVertice("A");
      
      assertTrue(g.size() == 1);

   }
   
   @Test
   public void sizeTest3()
   {
      g.addVertice("A");
      g.addVertice("B");
      g.addVertice("C");      
      g.addVertice("D");
      g.addVertice("E");
      g.addVertice("F");      
      g.addVertice("G");
      g.addVertice("H");
      g.addVertice("I");
      g.addVertice("J");
      g.addVertice("K");
      g.addVertice("L");
      g.addVertice("A");
      g.addVertice("A");
      g.addVertice("A");
      
      assertTrue(g.size() == 12);   
   }
   
   @Test
   public void numberOfEdgesTest1()
   {
      g.addEdge("A", "B", 1);
      g.addEdge("A", "C", 2);
      g.addEdge("A", "D", 4);
      g.addEdge("D", "B", 5);
      
      assertTrue(g.numberOfEdges() == 4);
   }
   
   @Test
   public void numberOfEdgesTest2()
   {
      g.addEdge("A", "B", 1);
      g.addEdge("A", "B", 2);
      
      assertTrue(g.numberOfEdges() == 1);
   }
   
   @Test
   public void numberOfEdgesTest3()
   {     
      assertTrue(g.numberOfEdges() == 0);
   }
   
   @Test
   public void containsVerticeTest1()
   {
      g.addVertice("A");
      
      assertTrue(g.containsVertice("A"));
   }
   
   
   @Test
   public void containsVerticeTest2()
   {
      g.addVertice("A");
      
      assertFalse(g.containsVertice("B"));
   }
   
   @Test
   public void removeEdgeTest1()
   {
      g.addEdge("A", "B", 1);
      g.addEdge("A", "C", 2);
      g.addEdge("A", "D", 4);
      g.addEdge("D", "B", 5);
      
      g.removeEdge("A", "B");
      
      assertTrue(g.numberOfEdges() == 3);
   }
   
   @Test
   public void removeEdgeTest2()
   {
      g.addEdge("A", "B", 1);
      g.addEdge("A", "C", 2);
      g.addEdge("A", "D", 4);
      g.addEdge("D", "B", 5);
      
      g.removeEdge("A", "B");
      g.removeEdge("A", "C");
      
     
      g.removeEdge("A", "D");
      g.removeEdge("D", "B");
      
      assertTrue(g.numberOfEdges() == 0);
   }
   
   @Test
   public void removeEdgeTest3()
   {
      g.addEdge("A", "B", 1);
      g.addEdge("A", "C", 2);
      g.addEdge("A", "D", 4);
      g.addEdge("D", "B", 5);
      
      g.removeEdge("A", "B");
      
      assertTrue(g.getWeight("A", "B") == -1);
      assertTrue(g.getWeight("B", "A") == -1);
   }
   
   @Test
   public void removeEdgeTest4()
   {
      g.addEdge("A", "B", 1);
      g.addEdge("A", "C", 2);
      g.addEdge("A", "D", 4);
      g.addEdge("D", "B", 5);
      
      g.removeEdge("D", "B");
      
      assertTrue(g.numberOfEdges() == 3);
   }
   
   @Test
   public void printVerticeTest1()
   {
      g.addVertice("A");
      g.addVertice("B");
      g.addVertice("C");
      g.addVertice("D");
      
      assertTrue(g.size() == 4);
      
      g.removeVertice("A");
      
      assertTrue(g.size() == 3);
   }
   
   @Test
   public void printVerticeTest2()
   {
      g.addVertice("A");
      g.addVertice("B");
      g.addVertice("C");
      g.addVertice("D");
      
      
      g.removeVertice("A");
      g.removeVertice("B");
      g.removeVertice("C");
      g.removeVertice("D");
      
      assertTrue(g.size() == 0);
   }
   
   @Test
   public void printVerticeTest3()
   {
      g.addEdge("A", "B", 1);
      g.addEdge("A", "C", 2);
      g.addEdge("A", "D", 4);
      g.addEdge("D", "B", 5);
      
      assertTrue(g.size() == 4);
      
      g.removeVertice("A");
      
      assertTrue(g.getWeight("A", "B") == -1);
      assertTrue(g.getWeight("B", "A") == -1);
      assertTrue(g.getWeight("A", "C") == -1);
      assertTrue(g.getWeight("C", "A") == -1);
      assertTrue(g.getWeight("A", "D") == -1);
      assertTrue(g.getWeight("D", "A") == -1);
   }
   
   @Test
   public void expandCapacityTest()
   {
      for(int i = 0; i < 1000; i++)
         g.addVertice("A" + i);
      
      assertTrue(g.size() == 1000);
   }
   
}


