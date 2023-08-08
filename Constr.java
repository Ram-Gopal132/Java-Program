
							/* Constructor */

class A{
	int a; String name;
	A()
	{
		a=10; name="ram";
	}
	void show()
	{
		System.out.println (a+" "+name);
	}
}
class Constr{
	public static void main (String[] args)
		 {
		 	
		 	A obj=new A();
		 	obj.show();
			}
}