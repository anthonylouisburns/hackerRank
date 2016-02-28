package algorithms

import hackerRank.HRTest
import org.scalatest.FreeSpec


class Algorithms extends FreeSpec with HRTest {
  "Algorithms https://www.hackerrank.com/domains/algorithms" - {
    "Solve Me First https://www.hackerrank.com/challenges/solve-me-first/submissions/code/17889169" in {
      testSolution("3\n2\n",
        "5\n",
        SolveMeFirst.Solution.main)
    }
  }
}
