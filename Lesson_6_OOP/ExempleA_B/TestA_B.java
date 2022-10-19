
public class TestA_B 
{
	public static void main(String[] args) 
	{
		A a1=new A();
		B b1=new B();
		
		int n=4;
		double x=2.5;
		
		a1.f(n);// Appelle f de A
		b1.f(n);// Appelle f de A
		b1.f(x);// Appelle f de B
	}
}

