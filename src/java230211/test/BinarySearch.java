package java230211.test;

/**
 * @ClassName: BinarySearch
 * @Date: 2023/2/6 21:02
 * @Author: MOUNIN
 * @Description:
 **/
public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 5, 7, 8, 10, 15, 18, 20, 22, 25, 28};

        int key = 18;
//        key = 3;

        int head = 0;  // 初始的首索引
        int end = arr.length - 1;  // 初始的尾索引

        boolean isFlag = true;

        while(head <= end) {
            int middle = (head + end) / 2;  // 中间位置索引

            if (key == arr[middle]) {
                System.out.println("找到了，索引位置为：" + middle);
                isFlag = false;
                break;
            } else if (arr[middle] > key) {
                end = middle - 1;
            } else {  // arr[middle] < key
                head = middle + 1;
            }
        }

        if(isFlag) {
            System.out.println("很遗憾，没有找到。");
        }
    }
}
