import java.io._
import scala.io.Source

object ReadFile {
    def main(args: Array[String]) {

        val filename = "Simple.txt";
        val source = Source.fromFile(filename);
        // while(source.hasNext) {
        //     print(source.next)
        // }
        for(line<-source.getLines)
        {
            println(line)
        }
        source.close();
    }
}