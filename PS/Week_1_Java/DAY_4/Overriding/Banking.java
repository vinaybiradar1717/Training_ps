class Banking {
public static void main(String[] args) {
       Sbi s = new Sbi();
	   Icici i = new Icici();
    	s.roi("SBI", 5);
	    i.roi("ICICI", 7);
    }
void roi(String a, int b) {
            System.out.println(a+" gives "+b+" return of investment.");
        }
}

class Sbi extends Banking{    
}

class Icici extends Banking {
}
