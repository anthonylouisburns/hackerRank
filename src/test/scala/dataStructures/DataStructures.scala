package dataStructures

import java.io.ByteArrayInputStream

import hackerRank.HRTest
import org.scalatest.FreeSpec

class DataStructures extends FreeSpec with HRTest {

  "Arrays https://www.hackerrank.com/domains/data-structures/arrays" - {
    "Arrays- DS https://www.hackerrank.com/challenges/arrays-ds" in {
      testSolution("4\n1 45 3 2\n","2 3 45 1 ",
        ArraysDS.Solution.main)
    }

    "2D Array - DS https://www.hackerrank.com/challenges/2d-array" in {
      testSolution("1 1 1 0 0 0\n0 1 0 0 0 0\n1 1 1 0 0 0\n0 0 2 4 4 0\n0 0 0 2 0 0\n0 0 1 2 4 0\n",
        "19",
        TwoDArray.Solution.main)
    }


    "2D Array - DS https://www.hackerrank.com/challenges/2d-array failed test case" in {
      testSolution("-1 -1 0 -9 -2 -2\n-2 -1 -6 -8 -2 -5\n-1 -1 -1 -2 -3 -4\n-1 -9 -2 -4 -4 -5\n-7 -3 -3 -2 -9 -9\n-1 -3 -1 -2 -4 -5\n",
        "-6",
        TwoDArray.Solution.main)
    }
  }
}
