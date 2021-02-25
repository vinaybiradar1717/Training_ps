import java.io.FileInputStream;
import java.io.FileOutputStream;

class CopyFile {
	public static void main(String[] args){
		byte [] arr = new byte[300];
		try {
			FileInputStream sourcefile = new FileInputStream("source.txt");
			FileOutputStream destfile = new FileOutputStream("destination.txt");
			
			sourcefile.read(arr);
			destfile.write(arr);
			
			System.out.println("Data is copied from source to destination file");
			
			sourcefile.close();
			destfile.close();
		}
		catch(Exception e) { // We do catch to catch the exceptions so that system does not crash if there are any errors
			e.getStackTrace();
		}
		
	}
		
}