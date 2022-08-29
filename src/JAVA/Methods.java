package JAVA;

public class Methods {
	
public void m1()
{
	System.out.println("M1 is Executed");
}
public void m2()
{
	System.out.println("M2 is Executed");
}
public void m3()
{
	System.out.println("M3 is Executed");
}
	public static void main(String[] args) {
		System.out.println("Main method  Executed");
		//classname Objectname=new classname();
		Methods m=new Methods();
		m.m1();
		m.m2();
		m.m3();
		
	}

}
