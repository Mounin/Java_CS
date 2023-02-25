package java230107;


import java.util.Arrays;
import java.util.Collections;

/**
 * @ClassName: Demo4
 * @Date: 2023/1/7 16:09
 * @Author: MOUNIN
 * @Description:
 **/
public class Demo4 {

    public static void main(String[] args) {
        int[] a = new int[]{12, 8, 21, 2};
        Arrays.sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        Integer[] b = {12, 8, 21, 2}; // 数组类型为Integer
        Arrays.sort(b, Collections.reverseOrder());  //利用 Collections.reverseOrder() 方法（Collections 是一个包装类。）
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
