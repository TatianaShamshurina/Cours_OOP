
class Polymorph 
{
    public int somme(int a, int b)
    {
        return a + b;
    }
    
    public int somme(int a, int b, int c)
    {
        return a + b + c;
    }
    
    public int somme(int a, int b, double c)
    {
        return a + b;
    }
    public double somme(double a, double b, double d)
    {
        return a + b;
    }
    
    public double somme(double a, double y)
    {
    	return a+y;
    }

    public static void main(String [] args)
    {
        Polymorph poly = new Polymorph();		//je cree un objet poly
        int x1 = 1, x2 = 2, x3 = 3;
        double x4 = 1.5, x5 = 2.5;

        System.out.println(poly.somme(x1, x2));
        System.out.println(poly.somme(x1, x2, x3));
        System.out.println(poly.somme(x4, x5));
    }
}

