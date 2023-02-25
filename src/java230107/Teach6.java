package java230107;

/**
 * @ClassName: Teach6
 * @Date: 2023/1/7 20:58
 * @Author: MOUNIN
 * @Description:
 **/
public class Teach6 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 0, 9, 3, 12, 7, 8, 3, 4, 65, 22};

        for (int i = 0; i < arr.length; i++) { // arr.lengh次排序过程
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j -1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
