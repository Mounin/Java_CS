package java230107;

import org.testng.annotations.Test;

/**
 * @ClassName: Demo1
 * @Date: 2023/1/2 21:59
 * @Author: MOUNIN
 * @Description:
 **/
public class Demo1 {

    public static void main(String[] args) {
        // 创建并初始化一维数组
        int[] day = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};;
        for(int i = 0; i < 12; i++) {  // 利用循环将信息输出
            System.out.println((i + 1) + "月有" + day[i] + "天");
        }
    }
}
