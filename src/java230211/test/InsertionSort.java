package java230211.test;

/**
 * @ClassName: InsertionSort
 * @Date: 2023/2/7 20:08
 * @Author: MOUNIN
 * @Description:
 **/
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{9, -16, 21, 23, -30, -49, 21, 40, 30};
        System.out.println("排序之前：" + java.util.Arrays.toString(arr));
        // 直接插入排序
        insertSort(arr);
        // 希尔排序
//        shellSort(arr);
        System.out.println("排序之后：" + java.util.Arrays.toString(arr));
    }

    private static void insertSort(int[] arr) {
        System.out.println("直接插入排序....");
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];  // 待比较的元素

            if (arr[i] < arr[i - 1]) {  // 如果要比较的元素小于已排好序的最后一个元素
                int j = i - 1;
                for(; j >= 0 && arr[j] > temp; j--) {  // 在已排好序的数组中将大于temp的元素以此后移
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;  // 在已排好序的数组中找到合适位置插入temp
            }
            System.out.println("##########第" + i + "趟：" + java.util.Arrays.toString(arr));
        }
    }

    private static void shellSort(int[] arr) {
        System.out.println("希尔排序....");
        int h = 1;
        while (h <= arr.length / 3) {  // 设置初始步长
            h = h * 3 + 1;
        }

        while (h > 0) {
            System.out.println("===h的值：" + h + "===");
            // 对每一组进行直接插入排序
            for (int i = h; i < arr.length; i++) {
                int temp = arr[i];
                if (arr[i] < arr[i - h]) {
                    int j = i - h;
                    for (; j >= 0 && arr[j] > temp; j -= h) {
                        arr[j + h] = arr[j];
                    }
                    arr[j + h] = temp;
                }
                System.out.println(java.util.Arrays.toString(arr));
            }
            h = (h - 1) / 3;
        }
    }
}

