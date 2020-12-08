class Gen<T, U, V> {
    T ob1;
    U ob2;
    V ob3;

 
    Gen(T o1, U o2, V o3) {
        ob1 = o1;
        ob2 = o2;
        ob3 = o3;
    }

    
    void showTypes() {
        System.out.println("Type of T object is " + ob1.getClass().getName());
        System.out.println("Type of U object is " + ob2.getClass().getName());
        System.out.println("Type of V object is " + ob3.getClass().getName());
    }

    T getob1() {
        return ob1;
    }

    U getob2() {
        return ob2;
    }

    V getob3() {
        return ob3;
    }
}


class Generics {
    public static void main(String args[]) {
        Gen<Integer, Double, String> genOb = new Gen<Integer, Double, String>(15, 99.457, "Aman Taiyab");
        
        genOb.showTypes();
        
        int t = genOb.getob1();
        System.out.println("value in T: " + t);
        Double u = genOb.getob2();
        System.out.println("value in U: " + u);
        String v = genOb.getob3();
        System.out.println("value in V: " + v);
    }
}