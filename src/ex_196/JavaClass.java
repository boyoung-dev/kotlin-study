package ex_196;

public class JavaClass
{
	public static <T> void printClassInfo(Class<T> clazz)
	{
		System.out.println(clazz.getCanonicalName());
	}
}
