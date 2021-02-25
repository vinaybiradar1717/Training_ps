import java.io.File;

class CreateFile {
    public static void main(String[] args) {
        File file = new File("newfile.txt");
        try {
            boolean val = file.createNewFile();
            if (val) {
                System.out.println("New file created");
            } else {
                System.out.println("File already exists");
            }
        } 
        catch(Exception e) {
            e.getStackTrace();
        }
    }
}