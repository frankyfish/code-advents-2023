package first

import java.nio.file.Files
import java.nio.file.Path

fun main() {
    val calibrationDocument = Files.readAllLines(Path.of("src/main/resources/one.txt"))
    println(calibrationDocument.map { it.filter { it.isDigit() } }
        .map {
            println("line: $it; code0: ${it.first().toString().toInt()}, code1:${it.last().toString().toInt()}; " +
                    "sum=${it.first().toString().plus(it.last().toString()).toInt()}")

            it.first().toString().plus(it.last().toString()).toInt()
        }
        .sum())
}