package ass1.PQueue;

public class Main2LinearPQ {
	
	public static void main(String[] args) {
		
		LinearPQ<String> p = new LinearPQ<String>();
		
		p.add("A", 1);
		p.add("B", 4);
		p.add("C", 3);
		p.add("E", -1);
		p.add("S", 1);
		p.add("M", -1);
		p.add("f", -1.1);
		p.add("g", 4.0);
		p.add("h", 4.05);
		p.add("b", 4.049);
		p.add("b", -1.099);
		
		p.printPQ();
		p.clear();
		p.printPQ();
	}

}
