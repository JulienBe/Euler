/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Created by JulienBe on 25/08/15.
 */
object MultiplesOf3and5 {

  def main (args: Array[String]) {
    println(sumOfMultiples(3) + sumOfMultiples(5) - sumOfMultiples(15))
  }

  def sumOfMultiples(toBeAdded: Int) = {
    var i = toBeAdded
    var sum = 0
    while (i < 1000) {
      sum += i
      i += toBeAdded
    }
    sum
  }
}
