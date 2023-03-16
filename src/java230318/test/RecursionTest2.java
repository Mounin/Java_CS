package java230318.test;

/**
 * @ClassName: RecursionTest2
 * @Date: 2023/3/15 21:44
 * @Author: Honvin
 * @Description: 使用递归方法实现：输出一定数量的斐波那契数列（从第三个数开始，每一项是前两项之和）
 **/
public class RecursionTest2 {

    public static void main(String[] args) {
//        fibonacci_loop(8);
        fibonacci_recursion(8);
    }

    /**
     * 分析递归调用方法：
     *  1. 出口
     *      控制输出数列数据的个数作为出口条件
     *      设一个变量为index表示序号，从1开始，每次递归调用让index自增1，当index大于数列的总数时达到出口（终止递归调用）
     *  2. 每次调用必须缩小范围
     *      可以从控制数列的数据个数入手，每次调用序号的值都自增1，序号和数列的总数之间的距离在缩小。
     */

    /**
     * 为了有利于其他用户使用方法，定义如下方法，此方法为公开方法public
     * @param num 数列中数据的个数，
     *            当num为1时，输出0、1、1；
     *            当num为2时输出0、1、1、2
     */
    public static void fibonacci_recursion(int num) {
        if (num < 1) {
            // 执行失败,return后面只加一个分号表示方法终止
            return ;
        }
        // 调用递归方法
        fibonacci_recursion_opera(1, num, 0, 1);
    }

    /**
     * 由于递归方法不利于用户使用，定为私有private
     * @param index 执行次数
     * @param num 输出的数据数量
     * @param one 第一个数
     * @param two 第二个数
     */
    private static void fibonacci_recursion_opera(int index, int num, int one, int two) {
//        // 出口
//        if (index > num) {
//            return ;
//        } else {
//            if (index == 1) {
//                System.out.println(0);
//                System.out.println(1);
//            }
//            // 第三个数是前两个数之和
//            System.out.println(one + two);
//
//            // 原来的第二个数变为第一个数,原来的第三个数变为第二个数
//            fibonacci_recursion_opera(++index, num, two, one + two);
//        }

        // 出口不一定必须是return
        // 当index大于num时此方法即结束，不再递归调用，达到出口条件
        if (index <= num) {
            if (index == 1) {
                System.out.println(0);
                System.out.println(1);
            }
            // 第三个数是前两个数之和
            System.out.println(one + two);

            // 原来的第二个数变为第一个数,原来的第三个数变为第二个数
            fibonacci_recursion_opera(++index, num, two, one + two);
        }

    }

    /**
     * 先用循环实现斐波那契数列
     * @param num 数列中数据的个数，
     *            当num为1时，输出0、1、1；
     *            当num为2时输出0、1、1、2
     */
    public static void fibonacci_loop(int num) {
        if (num < 1) {
            // 执行失败,return后面只加一个分号表示方法终止
            return ;
        }

        // 第一个数
        int a = 0;
        // 第二个数
        int b = 1;

        // 设置一个变量标记输出数据的个数
        int n = 0;
        do {
            n++;

            if (n==1) {
                System.out.println(0);
                System.out.println(1);
            }
            // 第三个数是前两个数之和
            int c = a + b;
            System.out.println(c);

            // 原来的第二个数变为第一个数
            a = b;
            b = c;
            // 原来的第三个数变为第二个数

        } while (n < num);
    }
}
