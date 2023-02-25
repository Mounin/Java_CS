package java230107;

import java.util.Arrays;

/**
 * @ClassName: Test
 * @Date: 2023/1/7 19:07
 * @Author: MOUNIN
 * @Description:
 **/
public class Test {
    public static void main(String[] args) {

        int[] arr = {3,9,8};
        System.out.println(arr[0] + arr[1] + arr[2]);

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        System.out.println(Arrays.equals(arr1, arr2));

        int[] arr3;
        arr3 = new int[5];
        int[] arr4;
        arr4 = new int[5];
        System.out.println(arr3 == arr4);
    }
}
