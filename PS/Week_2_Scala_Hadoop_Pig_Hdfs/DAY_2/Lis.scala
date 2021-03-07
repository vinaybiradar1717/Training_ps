object Lis {
    def main(args: Array[String]) {
        val cars = "tata" :: ("totota" :: ("honda" :: Nil));
        val model = Nil;

        println("cars head is: "+cars.head);
        println("cars tail is: "+cars.tail);
        println("is model val empty? "+model.isEmpty);
    }
}