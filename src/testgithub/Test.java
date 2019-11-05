package testgithub;

public class Test {
	public static void main(String[] args){
		int total = 0 ;
		for (int i=1;i<=100;i++)
		{
		   total+=i;
		}
		System.out.println(total);
		Zi zi = new Zi();
		System.out.println(zi.name);
		System.out.println(zi.age);
		System.out.println(zi.add);
		}
}
