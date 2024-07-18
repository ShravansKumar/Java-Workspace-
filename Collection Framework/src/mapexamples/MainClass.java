package mapexamples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

class MainClass {
	public static void main(String[] args) {
		Map <Double,String>m =new LinkedHashMap<Double,String> ();
		
		m.put(2.7,"Tom");
		m.put(3.2,"Alex");
		m.put(3.8,"James");
		
		
		Set<Double>keys=m.keySet();
		
		for( Double k:keys) {
			System.out.println("Salary of "+ m.get(k)+" is "+k+" lpa");
		}
		
	}
	

}
