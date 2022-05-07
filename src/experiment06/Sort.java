package experiment06;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        String[] str={"aa","dc","ab","cc","ba"};
        for (String s:str) {
            System.out.println(s);
        }
        System.out.println("降序排序后------------------");
        Arrays.sort(str,(o1,o2) -> o1.equals(o2)?0:o2.compareTo(o1)); //lambda表达式
        for (String s:str) {
            System.out.println(s);
        }
    }
}
