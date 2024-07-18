package mapexamples;

import java.util.HashMap;
import java.util.Map;

class Demo {
	public static void main(String[] args) {


		Map map=new HashMap(); //Upcasting
		map.put(10, "Java");
		map.put("Python", 3.4);
		map.put(2.1, 55);

		System.out.println(map);//{10=Java, 2.1=55, Python=3.4}
		System.out.println(map.size());  //3
		System.out.println(map.get(10));//Java
		System.out.println(map.get(23)); //null
		System.out.println(map.containsKey(2.1));//true
		System.out.println(map.containsValue("java")); //False
		System.out.println("------------");

		System.out.println(map);  //{10=Java, 2.1=55, Python=3.4}
		map.remove(2.1);
		System.out.println(map); //{10=Java, Python=3.4}

		System.out.println("-------------");


		System.out.println(map.isEmpty());//False
		map.clear();
		System.out.println(map.isEmpty());//true













	}


}
