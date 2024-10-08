package BasicJavaTekPYRAMID;

 class A 
{
int id;
public A(int id)
{
	this.id=id;
}
}
class B extends A
{
	String name;
	public B(int id,String name)
	{
		super(id);
		this.name=name;
	}
}
 public class C extends B
{
	char greade;
	public C(int id,String name,char gender)
	{
		super(id,name);
		this.greade=gender;
	}
	public static void main(String[] args) {
		C obj=new C(1,"Nage",'D');
		System.out.println(obj.id+"\t"+obj.name+"\t"+obj.greade);
	}
}

