import scala.io.StdIn.readLine

object Main extends App {
  val input: String = readLine("Enter a number: ")
  val token = input.split(" ")

  if (token.length == 3) {
    val num1 = token(0).toInt
    val operator = token(1)
    val num2 = token(2).toInt

    val result = operator match {
      case "+" => num1 + num2
      case "-" => num1 - num2
      case "*" => num1 * num2
      case "/" => num1 / num2
      case _   => throw new IllegalArgumentException("Invalid operator")
    }

    println(s"Result: $result")
  }
}
