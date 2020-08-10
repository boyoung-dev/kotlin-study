package ex_193

fun main(args: Array<String>)
{
	val runnable: Runnable = Runnable { println("SAM") }
	runnable.run()
}
