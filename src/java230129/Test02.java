package java230129;

/**
 * @ClassName: Test02
 * @Date: 2023/1/29 21:05
 * @Author: MOUNIN
 * @Description: 编写Java程序，将二维数组中的行列互调显示出来。
 * 例如：
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * 显示出的结果是：
 * 1 4 7
 * 2 5 8
 * 3 6 9
 **/
public class Test02 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("原数组");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("倒置数组");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}
