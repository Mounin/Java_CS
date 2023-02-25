package java230107;

/**
 * @ClassName: BubbleSort
 * @Date: 2023/1/7 17:40
 * @Author: MOUNIN
 * @Description:
 **/
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 0, 9, 3, 12, 7, 8, 3, 4, 65, 22};

        for(int i=0; i<arr.length; i++) {  // arr.lengh次排序过程
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j-1] > arr[j]) { //前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
