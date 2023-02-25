package java230129;

/**
 * @ClassName: Test01
 * @Date: 2023/1/29 20:57
 * @Author: MOUNIN
 * @Description: 编写Java程序，将数组中最小的数输出。
 **/
public class Test01 {

    public static void main(String[] args) {
        int[] a = new int[]{5, 9, 6, 3, 45, 2, 100};
        // return: 程序结束。
        int b = 999;
        for (int i = 0; i < a.length; i++) {
            if(b > a[i]) {
                b = a[i];
            }
        }
        System.out.println(b);
    }
}
