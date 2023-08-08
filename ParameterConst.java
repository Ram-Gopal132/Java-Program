
					// Parameterized Constructor

class A
{
	int a; String b;
	A(int x,String y)  //parameter
	{
		a=x; b=y;
	}
	
	A(int n,int l,String k)
	{
		System.out.println (n+" "+l+" "+k);
	}
	void show()
	{
		System.out.println (a+" "+b);
	}
}
class ParameterConst
{
	public static void main (String[] args)
		{
			A obj=new A(1000,"Ram");
			obj.show();
			A obj1= new A(100,200,"Gopal");
		}
}