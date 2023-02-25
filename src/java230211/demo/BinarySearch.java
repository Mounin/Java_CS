package java230211.demo;

/**
 * @ClassName: BinarySearch
 * @Date: 2023/2/11 20:20
 * @Author: MOUNIN
 * @Description:
 **/
public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 5, 7, 8, 10, 15, 18, 20, 22, 25, 28};

        int dest = 22;

        int head = 0;
        int end = arr.length - 1;
        boolean isFlag = true;

        while(head <= end) {
            int middle = (head + end) / 2;

            if (dest == arr[middle]) {
                System.out.println("查到了！" + middle);
                isFlag = false;
                break;
            } else if (arr[middle] > dest) {
                end = middle - 1;
            } else {
                head = middle + 1;
            }
        }
        if (isFlag) {
            System.out.println("没找到！");
        }
    }
}
