import java.io.ByteArrayInputStream
import java.util.Scanner

import org.scalatest.FreeSpec

class GeneralTest extends FreeSpec  {

  "Arrays https://www.hackerrank.com/domains/data-structures/arrays" - {
    "Arrays- DS https://www.hackerrank.com/challenges/arrays-ds" in {
      val input = new ByteArrayInputStream("4\n1 45 3 2\n".getBytes)
      System.setIn(input)
      ArraysDS.Solution.main(Array())
    }

    "2D Array - DS https://www.hackerrank.com/challenges/2d-array" in {
      val input = new ByteArrayInputStream("1 1 1 0 0 0\n0 1 0 0 0 0\n1 1 1 0 0 0\n0 0 2 4 4 0\n0 0 0 2 0 0\n0 0 1 2 4 0\n".getBytes)
      System.setIn(input)
      TwoDArray.Solution.main(Array())
    }


    "2D Array - DS https://www.hackerrank.com/challenges/2d-array failed test case" in {
      val input = new ByteArrayInputStream("-1 -1 0 -9 -2 -2\n-2 -1 -6 -8 -2 -5\n-1 -1 -1 -2 -3 -4\n-1 -9 -2 -4 -4 -5\n-7 -3 -3 -2 -9 -9\n-1 -3 -1 -2 -4 -5\n".getBytes)
      System.setIn(input)
      TwoDArray.Solution.main(Array())
    }
  }
}
