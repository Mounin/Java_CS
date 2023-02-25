package java230211.demo;

/**
 * @ClassName: SelectSort
 * @Date: 2023/2/11 20:52
 * @Author: MOUNIN
 * @Description:
 **/
public class SelectSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, -16, 21, 23, -30, -49, 21, 40, 30};
        System.out.println("初始数组：" + java.util.Arrays.toString(arr));
        System.out.println("开始选择排序");

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        System.out.println(java.util.Arrays.toString(arr));
    }
}
