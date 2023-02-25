package java230107;

import java.util.Arrays;

/**
 * @ClassName: Demo6
 * @Date: 2023/1/7 16:43
 * @Author: MOUNIN
 * @Description:
 **/
public class Demo6 {

    public static void main(String[] args) {
        int[] arr = new int[]{4, 25, 10};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 25);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(index);

        String[] strs = new String[]{"cd", "ef", "ab", "gh", "ij"};
        Arrays.sort(strs);
        int indexOfStr = Arrays.binarySearch(strs, 2, 4, "gh");
        for (String str : strs) {
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println(indexOfStr);
    }
}
