package java230107;

import java.util.Arrays;

/**
 * @ClassName: Demo5
 * @Date: 2023/1/7 16:22
 * @Author: MOUNIN
 * @Description:
 **/
public class Demo5 {

    public static void main(String[] args) {
        // copyOf
        int[] arr = new int[]{23, 42, 12};
        int[] newArr = Arrays.copyOf(arr, 5);
        for (int i : newArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // copyOfRange
        int[] arr2 = new int[]{23, 42, 12, 36, 58, 1};
        int[] newArr2 = Arrays.copyOfRange(arr2, 1, 4);
        for (int i : newArr2) {
            System.out.print(i + " ");
        }
    }
}
