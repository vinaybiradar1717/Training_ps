import java.io.File;

class CreateDirectory {
    public static void main(String[] args) {
        File file = new File("Ja");
        try {
            boolean val = file.mkdir();
            if (val) {
                System.out.println("Directory created");
            } else {
                System.out.println("this directory already exists");
            }
        }
        catch(Exception e) {
            System.out.println("Exception");
        }
    }
}

