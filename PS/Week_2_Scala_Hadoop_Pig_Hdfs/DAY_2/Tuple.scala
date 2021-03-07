object Tuple {
    def main(args: Array[String]) {
        val tup = (1, 2, 3, 4, 5);
        var sum = tup._1 + tup._2 + tup._3 + tup._4 + tup._5; 
        println("Sum of tuple elements is: "+sum);
    }
}