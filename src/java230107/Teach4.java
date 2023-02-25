package java230107;

import java.util.Arrays;
import java.util.Collections;

/**
 * @ClassName: Teach4
 * @Date: 2023/1/7 20:41
 * @Author: MOUNIN
 * @Description:
 **/
public class Teach4 {
    public static void main(String[] args) {
        String[] a = new String[]{"?", ".", "!", "1"};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        Integer[] b = {12, 8, 21, 2}; // 数组类型为Integer
        Arrays.sort(b, Collections.reverseOrder());
        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}
