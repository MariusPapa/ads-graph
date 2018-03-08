package ass1.Set;

import ass1.Set.ISet;

public class Main2LinearSet {
	
	public static void main(String[] args) {
		ISet<String> s1 = new LinearSet<String>();
		
	/*	s1.add("a");
		s1.add("b");
		s1.add("c");
		s1.add("a");
		*/
		for(int i = 0 ; i < 1000; i++)
		{
			s1.add(""+i);
			System.out.println(s1.contains("" + i));
		}
		
		System.out.println(s1.contains("c"));
		s1.printSet();
	}

}
