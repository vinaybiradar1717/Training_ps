class Add {
    static int add(int a, int b) {
        return a+b;
    }

    static double add(double a, double b) {
        return a+b;
    }
}

class Addition {
    public static void main(String[] args) {
        // System.out.println(Add.add(2, 4));
        Add ob = new Add();
        System.out.println(ob.add(2, 4));
        System.out.println(ob.add(2.4, 4));
    }
}