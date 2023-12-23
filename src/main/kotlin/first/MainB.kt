package first

import java.nio.file.Files
import java.nio.file.Path

fun main() {
    val calibrationDocument = Files.readAllLines(Path.of("src/main/resources/one.txt"))
    
}