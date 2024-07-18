package com;

class test {

	public static void main(String[] args) {
		int[]a= {10,20,30};
		for(int i=0;i<a.length;i++) {      //if we give i<2 ,it will be hard coding(i means index value)
			System.out.println(i+"->"+a[i]);
		}
		System.out.println("_________________");
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(i+"->"+a[i]);
		}
	}

}
