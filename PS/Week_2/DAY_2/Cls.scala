import java.io._

class Point(val a: Int, val b: Int) {
    var x: Int = a;
    var y: Int = b;

    def move(m: Int, n: Int) {
        x = x + m;
        y = y + n;
        println("var x has value: "+x);
        println("var y has value: "+y);
    }
 }

object Cls {
    def main(args: Array[String]) {
        val pt = new Point(10, 20);
        pt.move(1, 2);
    }
}