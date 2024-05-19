package assign;

public class sumof2 {
	public void sum (int a,int b)
	{
System.out.println(" Sum of two integers = "+(a+b));
	}
	public void sum (float a,float b)
	{
		System.out.println("Sum of two float = "+(a+b));
		
	}
	public void sum (float a)
	{
		sum (a,0.0f);
	}
	public void sum()
	{
		sum (0,0);
	}
	public static void main(String[] args) 
	{
          sumof2 j1=new sumof2();
            j1.sum();
            j1.sum(10);
            j1.sum(25,25);
            j1.sum(45,56);
            j1.sum(25.35f,23.67f);
	}

}