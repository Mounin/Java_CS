package java230107;

/**
 * @ClassName: Teach3
 * @Date: 2023/1/7 20:29
 * @Author: MOUNIN
 * @Description: 实现输出一 个3行4列且所有元素都为0的矩阵。
 **/
public class Teach3 {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1},
                                {2, 3},
                                {4, 5, 6}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
