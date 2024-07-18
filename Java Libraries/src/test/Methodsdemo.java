package test;

class Methodsdemo {
	public static void main(String[] args) {
		String s="Software Engineer";
		System.out.println(s.length()); //17
		System.out.println(s.toUpperCase());  //SOFTWARE ENGINNER
		System.out.println(s.toLowerCase());  //software engineer
		System.out.println(s.startsWith("soft"));  //false
		System.out.println(s.endsWith("er")); //true
		System.out.println(s.charAt(1)); //0
		System.out.println(s.indexOf('e')); //7
		System.out.println(s.contains("ware")); //true
		System.out.println("-----------------");


		String x="Java";
		String y="Java";
		String z="jAvA";


		System.out.println(x.equals(y)); //true
		System.out.println(x.equals(z)); //false
		System.out.println(x.equalsIgnoreCase(z)); //true
	} 

}
