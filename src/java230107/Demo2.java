package java230107;

import java.util.Arrays;

/**
 * @ClassName: Demo2
 * @Date: 2023/1/3 22:42
 * @Author: MOUNIN
 * @Description:
 **/
public class Demo2 {

    public static void main(String[] args) {
        int[][] a = new int[3][4];
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                a[i][j] = 1;
            }
        }

        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
