package java230107;

import java.util.Arrays;

/**
 * @ClassName: Teach5
 * @Date: 2023/1/7 20:50
 * @Author: MOUNIN
 * @Description:
 **/
public class Teach5 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 25, 10};
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 30);
        System.out.println(index);


        String[] strs = new String[]{"cd", "ef", "ab", "gh", "ij"};
        Arrays.sort(strs);
        int indexOfStr = Arrays.binarySearch(strs, 2, 4, "gh");
        System.out.println(indexOfStr);
    }
}
