

fun main() {
    fun part1(input: List<String>): Int {
        val x = input.map { it.toInt() }

        return x
            .zipWithNext()
            .count { (x, y) -> y > x }
    }

    fun part2(input: List<String>): Int {
        val x = input.map { it.toInt() }

        return x
            .windowed(3)
            .map {it.sum() }
            .zipWithNext()
            .count { (x,y) -> y > x }
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("./Inputs/Day01_test")
    check(part1(testInput) == 7)
    check(part2(testInput) == 5)

    val input = readInput("./Inputs/Day01")
    println(part1(input))
    println(part2(input))
}
