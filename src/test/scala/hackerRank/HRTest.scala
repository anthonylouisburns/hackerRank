package hackerRank

import java.io.{ByteArrayInputStream, ByteArrayOutputStream, PrintStream}

import org.scalatest
import org.scalatest.FreeSpec

trait HRTest extends FreeSpec {
  def testSolution(in: String, out: String, solution: (Array[String]) => Unit): scalatest.Assertion = {
    val input = new ByteArrayInputStream(in.getBytes)
    val output = new ByteArrayOutputStream()
    System.setIn(input)

    Console.withOut(new PrintStream(output))(
      solution(Array())
    )
    println(output)
    assert(output.toString() === out)
  }

}
