package java230218.demo;

/**
 * @ClassName: QuickSort
 * @Date: 2023/2/18 11:25
 * @Author: MOUNIN
 * @Description:
 **/
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, -16, 21, 23, -30, -49, 21, 40, 30};
        System.out.println("排序之前：" + java.util.Arrays.toString(arr));
        QuickSortMethod(arr, 0, arr.length - 1);
        System.out.println("排序之后：" + java.util.Arrays.toString(arr));
    }

    private static void QuickSortMethod(int[] arr, int start, int end) {
        if (start > end) {
            return;
        } else {
            int base = arr[start];
            int left = start;
            int right = end;

            while(left != right) {
                while(left < right && base <= arr[right]){
                    right--;
                }

                while(left < right && base >= arr[left]) {
                    left++;
                }

                swap(arr, left, right);
            }

            arr[start] = arr[left];
            arr[left] = base;

            QuickSortMethod(arr, start, left - 1);
            QuickSortMethod(arr, right + 1, end);
        }
    }

    private static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }


}
