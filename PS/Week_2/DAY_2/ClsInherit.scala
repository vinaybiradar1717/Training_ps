import java.io._

class Point(val a: Int, val b: Int) {
    var x: Int = a;
    var y: Int = b;

    def move(m: Int, n: Int) {
        x = x + m;
        y = y + n;

        println("This is from class: POINT");
        println("========================");
        println("var x has the value: "+x);
        println("var y has the value: "+y);
        println();
    }
}

class Location(override val a: Int, override val b: Int, val c: Int) extends Point(a, b) {
    var z: Int = c;

    def move(m: Int, n: Int, o: Int) {
        x = x + m;
        y = y + n;
        z = z + o;

        println("This is from class: LOCATION");
        println("===========================");
        println("var x has the value: "+x);
        println("var y has the value: "+y);
        println("var z has the value: "+z);
    }
}



object ClsInherit {
    def main(args: Array[String]) {
        val pt1 = new Point(100, 200);
        pt1.move(1, 2);

        val pt2 = new Location(10, 20, 30);
        pt2.move(1, 2, 3);
    }
}