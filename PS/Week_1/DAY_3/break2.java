class break2 {
	public static void main(String[] args) {
		char a;
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				if (i==3 && j==4) {
					break a;
				}
				System.out.println("i = "+i+", "+"j = "+j);
			}
		}
	}
} 