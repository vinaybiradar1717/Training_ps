object Annoni {
    def main(args: Array[String]) {

        val func1 = (a: String, b: String) => a+b;
        val func2 = (_: String) + (_: String);

        println("From func 1: "+func1("Hello", "World!!"));
        println("From func 2: "+func2("cool", "hot"));
    }
}