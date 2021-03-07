object LisConcat {
    def main(args: Array[String]) {
        val l1 = "ab" :: ("cd" :: ("ef" :: Nil));
        val l2 = "mn" :: ("xy" :: Nil);
        var l3 = l1 ::: l2
        println("l1: "+l1);
        println("l2: "+l2);
        println("After concatenation l1 and l2: "+l3);
    }
}