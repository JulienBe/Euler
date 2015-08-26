import tests.Bench

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * Created by JulienBe on 25/08/15.
 */
object MultiplesOf3and5 {

  def main (args: Array[String]) {
    Bench test firstApproach
    Bench test secondApproach
    Bench test thirdApproach
  }

  def firstApproach() = (sumOfMultiples(3) + sumOfMultiples(5) - sumOfMultiples(15)).toString
  def secondApproach() = addThenMultiply(sumAll).toString
  def thirdApproach() = addThenMultiply(fib).toString

  def addThenMultiply(getAddition: (Int, Int)=> Int): Int = {
    var base = getAddition(0, 999 / 15)
    var sum = -base * 15

    base += getAddition((999 / 15) + 1, 999 / 5)
    sum += base * 5

    base += getAddition((999 / 5) + 1, 999 / 3)
    sum += base * 3
    sum
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
  def sumAll(from: Int, goal: Int) = {
    var sum = 0
    for (i <- from to goal)
      sum += i
    sum
  }
  def fib(from: Int, to: Int) : Int = {
    def fib_tail(total: Int, limit: Int): Int = {
      if (limit < from)
        return total
      fib_tail(total + limit, limit - 1)
    }
    fib_tail(0, to)
  }

}
