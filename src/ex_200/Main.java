package ex_200;

public class Main
{
	public static void main(String[] args)
	{
		KotlinClass.Companion.setNum(30);
		System.out.println(KotlinClass.Companion.getNum());
		KotlinClass.Companion.hello();
	}
}
