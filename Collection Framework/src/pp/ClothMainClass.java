package pp;

import java.util.PriorityQueue;
import java.util.Queue;

class ClothMainClass {
	public static void main(String[] args) {

		Cloth c1=new Cloth("Blue");
		Cloth c2=new Cloth("Yellow");
		Cloth c3=new Cloth("Black");
		Cloth c4=new Cloth("Red");


		Queue<Cloth> q = new  PriorityQueue<Cloth>();
		q.add(c1);
		q.add(c2);
		q.add(c3);
		q.add(c4);
		


		for(Cloth c:q) {
			System.out.println(c);
		}

	}

}
