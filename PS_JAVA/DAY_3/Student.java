class Student {
	int id = 7;
	String v = "Awesome";
}

class MainClass {
	public static void main(String[] args) {
		Student st = new Student();
		System.out.println("id: "+st.id);
		System.out.println("word: "+st.v);
	}
}