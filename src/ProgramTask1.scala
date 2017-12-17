

object ProgramTask1 {
  def main(args: Array[String]) {
    val lst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("Sum of all numbers in list: " + lst.sum)
    println("Total number of elements in list: " + lst.size)
    println("Average of numbers in the list: " + (lst.sum) / (lst.size))
    println("Sum of all the even numbers in the list: " + lst.filter(_ % 2 == 0).sum)
    println("Total number of elements in the list divisible by both 5 and 3: " + lst.filter(i => i % 3 == 0 && i % 5 == 0).size)
  }
}