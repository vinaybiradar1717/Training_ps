object Add {
    def main(args: Array[String]) {
        println("Returned value is: "+ Adding(3, 4));
    }

    def Adding(a: Int, b: Int): Int = {
        var sum: Int = 0;
        sum = a + b;
        return sum;
    }
}