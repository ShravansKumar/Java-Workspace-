class Test3 {

public static void main(String[]args)
{

Server s =new Server();
Beer br=s.serve();
System.out.println(br.quantity + +" ml" + br.brand + " beer" );


}