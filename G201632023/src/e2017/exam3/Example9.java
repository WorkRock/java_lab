package e2017.exam3;

import java.util.Date;

public class Example9 {

    static boolean sameClass(Object o1, Object o2) {
    	return false;
    }

    static boolean sameClass(Object o1, Class cls) {
    	return true;
    }

    public static void main(String[] args) {
        String s1 = "hello", s2 = "world";
        Date d = new Date();
        System.out.println(sameClass(s1, d));
        System.out.println(sameClass(s1, s2));
        System.out.println(sameClass(s1, String.class));
    }
}
