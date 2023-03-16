package java230318.test;

import java.util.Arrays;

/**
 * @ClassName: MergeTest
 * @Date: 2023/3/16 13:41
 * @Author: Honvin
 * @Description:
 **/
public class MergeTest {

    public static void main(String[] args) {
        int[] array = {50, 10, 90, 30, 70, 40, 80, 60, 20};
        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));

    }

    public static void mergeSort(int[] array, int low, int high) {
        // 递归出口
        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;
        // 对左右两侧进行递归
        mergeSort(array, low, mid);
        mergeSort(array, mid+1, high);

        // 合并
        merge(array, low, mid, high);
    }

    public static void merge(int[] array, int low, int mid, int high) {
        int s1 = low;  // 第一个归并段的开始
        int s2 = mid + 1; // 第二个归并段的开始

        // 创建临时数组存放合并后的数据
        int[] temp = new int[high - low + 1];
        int i = 0; // 临时数组temp的下标

        while (s1 <= mid && s2 <= high) {
            if (array[s1] <= array[s2]) {
                temp[i++] = array[s1++];
            } else {
                temp[i++] = array[s2++];
            }
        }

        // 如果有一个归并段没有元素了，则将另一个归并段的元素复制下来
        while (s1 <= mid) {
            temp[i++] = array[s1++];
        }
        while (s2 <= high) {
            temp[i++] = array[s2++];
        }

        // 将temp中的有序数据放入到array中
        for (int j = 0; j < temp.length; j++) {
            array[j + low] = temp[j];
        }
    }

}
