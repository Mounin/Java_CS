package java230318.test;

/**
 * @ClassName: RecursionTest1
 * @Date: 2023/3/15 21:18
 * @Author: Honvin
 * @Description: 递归方法的定义
 * 需求： 求一个数据区间的累加和。
 **/
public class RecursionTest1 {
    public static void main(String[] args) {

        // 调用sum
        int n = sum(1, 10);
        System.out.println("for循环：" + n);

        // 调用sum_recursion
        int nn = sum_recursion(1, 10);
        System.out.println("递归方法：" + nn);

    }

    /**
     *
     * @param start 开始下标
     * @param end 截止下标
     * @return 累加和
     */
    public static int sum_recursion(int start, int end) {

        // 当start == end时结束
        if (start == end) {
            return end;
        }
        // 递归调用
        return start + sum_recursion(start + 1, end);
    }

    /**
     * 先用循环来实现累加和
     * @param start
     * @param end
     * @return 累加和；-1表示执行失败
     */
    public static int sum(int start, int end) {
        // 参数合法性校验
        if (start > end) {
            return -1;
        }

        // 定义一个变量存储累加
        int sum = 0;
        // 从start循环到end
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}


