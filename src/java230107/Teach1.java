package java230107;

/**
 * @ClassName: Teach1
 * @Date: 2023/1/7 20:00
 * @Author: MOUNIN
 * @Description: 使用 一维数组将1～12月各月的天数输出。
 **/
public class Teach1 {
    public static void main(String[] args) {
        int[] month = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        for (int i = 0; i < month.length; i++) {
            System.out.println(month[i]);
        }

        System.out.println("foreach*******************");
        for (int i:month) {
            System.out.println(i);
        }
    }
}
