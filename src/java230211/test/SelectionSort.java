package java230211.test;

import java.util.Arrays;

/**
 * @ClassName: SelectionSort
 * @Date: 2023/2/6 21:44
 * @Author: MOUNIN
 * @Description:
 **/
public class SelectionSort {

    private static void selectSort(int[] arr) {
        System.out.println("开始排序....");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println("第" + i + "趟：" + java.util.Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9, -16, 21, 23, -30, -49, 21, 40, 30};
        System.out.println("排序之前：" + java.util.Arrays.toString(arr));
        selectSort(arr);
        System.out.println("排序之后：" + java.util.Arrays.toString(arr));

    }
}
