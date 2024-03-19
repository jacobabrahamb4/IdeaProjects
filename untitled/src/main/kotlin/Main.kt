
class Person() {
    var name = ""
    var age = 27
}

interface MyInterface {
    fun execute(a : Int, b : Int)
}


fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments at Run/Debug configuration
    println("Program arguments: ${args.joinToString()}")

    var person = Person().apply {
        name = "Jacob"
        age = 36
    }
    var hello = with(person) {
        name = "Jacob Abraham"
    }

    val numbersList : MutableList<Int> = mutableListOf(1, 2, 3)

    numbersList.also { it.add(5) }

    person.also { println("helo: $it`") }

    val mod = person?.run { println("$this")
    "Hello"
    }

    val myLambda: (Int) -> Unit = {s -> println(s)}

    val p : Program = Program()
    p.addNumbers(2, 3, object : MyInterface {
        override fun execute(a: Int, b: Int) {
            println(a+b)
        }
    })
}

class Program {

    fun addNumbers(a : Int, b : Int, action: (Int) -> Unit) {
        action(a+b)
    }

    fun addNumbers(a : Int, b : Int, action: MyInterface) {
        action.execute(a, b)
    }









}