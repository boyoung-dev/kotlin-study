package ex_191

class KotlinClass : JavaInterface
{
	override fun trim(str: String?): String =
			str?.trim() ?: ""
}

fun main(args: Array<String>)
{
	val javaInterface: JavaInterface = KotlinClass()
	println(javaInterface.trim(" hi "))
}
