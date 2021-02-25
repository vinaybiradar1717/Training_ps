import java.io.File;

class RenameFile {
    public static void main(String[] args) {
        File oldfile = new File("hot");
        try {
            oldfile.createNewFile();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
        File newfile = new File("cool");
        boolean val = oldfile.renameTo(newfile);
        if (val) {
            System.out.println("renamed");
        } else {
            System.out.println("no");
        }
    }
}

