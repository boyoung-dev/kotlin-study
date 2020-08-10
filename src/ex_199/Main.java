package ex_199;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println(KotlinObject2.INSTANCE.getNum());
		KotlinObject2.INSTANCE.setNum(0);
		KotlinObject2.INSTANCE.hello();
	}
}
