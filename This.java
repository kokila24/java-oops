/*class ClassA
{
String name;
String companyname;
public void employee(String name,String companyname)
{
this.name=name;
this.companyname=companyname;
}
public void display()
{
System.out.println(name);
System.out.println(companyname);
}
}
class ClassB
{
public static void main(String args[])
{
ClassA obj=new ClassA();
obj.employee("kokila","Zoho");
obj.display();
}
}
*/ 

// this keyword to invoke current class instance variable


/*class ClassA
{
String name;
String companyname;
public void employee(String name,String companyname)
{
this.name=name;
this.companyname=companyname;
this.display();
}
public void display()
{
System.out.println(name);
System.out.println(companyname);
}
}
class ClassB
{
public static void main(String args[])
{
ClassA obj=new ClassA();
obj.employee("kokila","Zoho");

}
}

*/
//this is to invoke current class method.

/*class A
{
	A()
	{
		System.out.println("Hello World");
	}
	A(int a,int b)
	{
		this();
		System.out.println(a +" "+b);
	}
}
	class B
	{
		public static void main(String args[])
		{
			A ob=new A(10,20);
		}
	}
	*/
	
//this is used to invoke current class construtor.
//calling default constructor using parameterized constructor.

/*class A
{
	A()
	{
		this(10,20);
		System.out.println("Hello World");
	}
	A(int a,int b)
	{
		
		System.out.println(a +" "+b);
	}
}
	class B
	{
		public static void main(String args[])
		{
			A ob=new A();
		}
	}
	
	*/
	
	//Calling parameterized constructor from default constructor.