package java230304.test;

import org.junit.Test;

/**
 * @ClassName: MathTest
 * @Date: 2023/3/11 9:58
 * @Author: Honvin
 * @Description:
 **/
public class MathTest {
    @Test
    public void mathTest() {
        // 绝对值
        double a = -1.5;
        System.out.println(Math.abs(a));
        // 平方根
        int b = 9;
        System.out.println(Math.sqrt(b));
        // 幂次方
        double c = 2;
        double d = 10;
        System.out.println(Math.pow(c, d));
        // 随机数
        System.out.println(Math.random());
    }
}
