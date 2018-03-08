package Graph;

public class Edge
{
private double weight;
private Vertice targetVertice;

public Edge (double weight,Vertice vertice)
{
   this.weight=weight;
   this.targetVertice=vertice;
}

public double getWeight()
{
   return this.weight;
}

public void setWeight(double weight)
{
   this.weight = weight;
}

public Vertice getTargetVertice()
{
   return targetVertice;
}

public void setTargetVertice(Vertice targetVertice)
{
   this.targetVertice = targetVertice;
}
}
