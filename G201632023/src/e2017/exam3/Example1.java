package e2017.exam3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
public class Example1 {

    static List<String> solution(String[] a1, String[] a2, String[] a3) {
    	Collection<String>A1 = new ArrayList<String>();
    	Collection<String>A2 = new ArrayList<String>();
    	Collection<String>A3 = new ArrayList<String>();
    	for(int i = 0; i<a1.length; ++i) {
    		A1.add(a1[i]);
    		A2.add(a2[i]);
    		A3.add(a3[i]);
    	}
    	A1.retainAll(A2);
    	A1.retainAll(A3);
    	return (List<String>) A1;
    }

    public static void main(String[] args) {
        String[] a1 = { "A", "B", "D", "F", "G" };
        String[] a2 = { "B", "C", "F", "H", "I" };
        String[] a3 = { "B", "F", "G", "H", "I" };

        System.out.println(solution(a1, a2, a3));
    }
}
