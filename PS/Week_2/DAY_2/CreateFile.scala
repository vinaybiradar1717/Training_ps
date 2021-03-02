import java.io._

object Createfile {
    def main(args: Array[String]) {

        val newFile = new File("SampleFile2.txt");
        val writeFile = new PrintWriter(newFile);
        writeFile.write("This text will be written in newfile.")
        writeFile.write("I have created this file. training file object name is pgm");
        writeFile.close();
    }
}