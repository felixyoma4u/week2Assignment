fun main() {
    val time = 12
    var greeting: String = when {
        time < 12 -> "Good Morning"
        else -> " Good day"
    }
    println(greeting)

    val age = 18
    var isOldEnough: String = when {
        age >= 18 -> "Eligible to Participate"
        else -> " You are less than 18"
    }
    println(isOldEnough)

    var a = 3
    val b = 5
    var result: String = when {
        a > b -> "$a is greater than $b"
        else -> "$b is greater than $a"
    }
    println(result)

    var c = 8
    val d = 8
    var result1: String = when {
        a <= b -> "$c is greater than or equal $d"
        else -> "$d is greater than $c"
    }
    println(result1)


    val x = 2
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // Note the block
            println("x is neither 1 nor 2")
        }

    }

}

