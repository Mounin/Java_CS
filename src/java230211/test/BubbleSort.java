package java230211.test;

/**
 * @ClassName: BubbleSort
 * @Date: 2023/2/6 21:31
 * @Author: MOUNIN
 * @Description:
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{12, 45, 3, 58, 11, 9, 333, 226, 56, 97};

        // 冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
