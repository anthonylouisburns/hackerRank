package TwoDArray

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var arr = Array.ofDim[Int](6,6);

    for(arr_i <- 0 to 6-1) {
      for(arr_j <- 0 to 6-1){
        arr(arr_i)(arr_j) = sc.nextInt();
      }
    }
    var max = -63
    for(arr_i <- 0 to 4-1) {
      for(arr_j <- 0 to 4-1){
        val current = getCurrent(arr_i, arr_j, arr)
        max = Math.max(current, max)
      }
    }
    print(max)
  }

  def getCurrent(i: Int, j: Int, arr: Array[Array[Int]]):Int={
    val line1 = arr(i)(j) + arr(i)(j+1) + arr(i)(j+2)
    val line2 = arr(i+1)(j+1)
    val line3 = arr(i+2)(j) + arr(i+2)(j+1) + arr(i+2)(j+2)
    line1 + line2 + line3
  }
}