package java230107;

/**
 * @ClassName: Demo3
 * @Date: 2023/1/7 15:55
 * @Author: MOUNIN
 * @Description:
 **/
public class Demo3 {

    public static void main(String[] args) {

        // 一维数组：
        int[] a = new int[]{1, 2, 3};
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // foreach
        for (int j : a) {
            System.out.print(j + " ");
        }
        System.out.println();

        // 二维数组：
        int[][] b = new int[][]{{1}, {2, 3}, {4, 5, 6}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        // foreach
        for (int[] i : b) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
