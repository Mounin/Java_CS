package java230218.test;

/**
 * @ClassName: OverloadTest
 * @Date: 2023/2/16 19:29
 * @Author: MOUNIN
 * @Description:
 **/
public class OverloadTest {

    // 如下的四个方法构成重载
    public void getSum(int i, int j) {
        System.out.println(i + j);
    }
    public void getSum(double i, double j) {
        System.out.println(i + j);
    }
    public void getSum(String s, int i) {
        System.out.println(s + i);
    }
    public void getSum(int i, String s) {
        System.out.println(i + s);
    }

    // 以下不算重载
//    public int getSum(int i, int j) {}
//    public void getSum(int m, int n) {}
//    private void getSum(int i, int j) {}
}
