import scala.io.StdIn
object activity8_2 {

  def main(args: Array[String]): Unit = {
    println("enter the number which you want to catagorize : ")
    var number = StdIn.readLine().toInt

    val categorize: Int => String = n =>
      if (n % 3 == 0 && n % 5 == 0) "multiple of three and five"
      else if (n % 3 == 0) "multiple of three"
      else if (n % 5 == 0) "multiple of five"
      else "not a multiple of three or five"

    var result = categorize(number)
    println(result)
  }

}
