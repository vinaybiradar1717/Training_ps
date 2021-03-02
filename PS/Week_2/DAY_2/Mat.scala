object Mat {
    def main(args: Array[String]) {
        println(testing(1));
    }

    def testing(a: Int): String = a match {
        case 0 => "this is zero";
        case 1 => "this is one";
        case _ => "this is default";
    }
}