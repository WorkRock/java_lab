package e2017.exam3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Example8 {

    static int solution(List<Integer> a) {


    	return 0;










    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 20; ++i)
            a.add(random.nextInt(10) + 1);
        System.out.println(a.toString());
        int maxValue = solution(a);
        System.out.println(maxValue);
    }
}
