package tests

/**
 * Created by julien on 25/08/15.
 */
object Bench {

  def test(gogogo: () => String): Unit = {
    val begin = System.currentTimeMillis
    var fakeString = ""
    for (i <- 1 to 500000)
      fakeString = gogogo()
    println("Time taken : " + (System.currentTimeMillis - begin) + "\tResult : " + fakeString)
  }

}
