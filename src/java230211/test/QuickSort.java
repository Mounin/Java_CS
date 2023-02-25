package java230211.test;

/**
 * @ClassName: QuickSOrt
 * @Date: 2023/2/8 20:56
 * @Author: MOUNIN
 * @Description:
 **/
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, -16, 21, 23, -30, -49, 21, 40, 30};
        System.out.println("排序之前：" + java.util.Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("排序之后：" + java.util.Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start > end) {
            return;
        } else {
            int base = arr[start];  // 定义基准数
            int left = start;  // 定义变量left，指向最左边
            int right = end;  // 定义变量right，指向最右边

            // 当left和right不相遇的时候，在循环中检索
            while (left != right) {
                // 先由right从右往左检索比基准数小的数，如果检索到比基准数小的就停下
                // 如果检索到比基准数大的或者与基准数相等的就继续检索
                while (arr[right] >= base && left < right) {
                    right--;  // right从右往左移动
                }

                // left从左往右检索
                while (arr[left] <= base && left < right) {
                    left++;  // left从左往右移动
                }

                // 代码走到这里，left停下了，right也停下了，交换left和right位置的元素
                swap(arr, left, right);
            }
            // 如果上面while循环条件不成立，会跳出这个循环，往下执行
            // 如果上面的条件不成立，说明left和right相遇了
            // 如果left和right相遇了，则交换基准数和相遇位置的元素
            // 把相遇位置的元素赋值给基准数这个位置的元素
            arr[start] = arr[left];
            // 把基准数赋值给相遇的这个位置的元素
            arr[left] = base;
            // 此时基准数归位，左边的都比基准数小，右边的都比基准数大。

            // 排基准数左边
            quickSort(arr, start, left - 1);
            // 排基准数右边
            quickSort(arr, right + 1, end);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
