// class ListFiles {
//     public static void main(String[] args) {
//         File file = new File("Assighment_Solution");
//         String[] k;
//         k = file.list();
//         System.out.println(k.length());

//     }
// }


import java.io.File;

class ListFiles {
	public static void main(String[] args){
		//create a file object for the current location
		File filee = new File("Ja"); //selecting directory named "output"
		
		String contents [] = filee.list(); //array to store file names
		
		for(int i = 0; i < contents.length; i++) // printing the file names
			System.out.println(contents[i]);
		}
}