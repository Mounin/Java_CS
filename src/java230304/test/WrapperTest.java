package java230304.test;

import org.junit.Test;

/**
 * @ClassName: WrapperTest
 * @Date: 2023/3/2 21:05
 * @Author: Honvin
 * @Description:
 **/
public class WrapperTest {

    // 基本数据类型 ==》 包装类：调用包装类的构造器
    @Test
    public void test1() {

        int num1 = 10;
//        System.out.println(num1.toString());  // 报错
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());  // 10

        Integer in2 = new Integer("123");
        System.out.println(in2.toString());  // 123

        // 报异常
//        Integer in3 = new Integer("123abc");
//        System.out.println(in2.toString());

        Boolean b1 = new Boolean(true);
        System.out.println(b1.toString());  // true

        Boolean b2 = new Boolean("TrUe");  // (忽略大小写,只要是true就会返回true)
        System.out.println(b2.toString());  // true

        Boolean b3 = new Boolean("true123");
        System.out.println(b3.toString());  // false
    }

    // 包装类 ==> 基本数据类型:调用包装类的xxxValue()
    @Test
    public void test2() {
        Integer in1 = new Integer(12);
        System.out.println(in1.toString());  // 12
        int i1 = in1.intValue();
//        System.out.println(i1.toString());  // 报错
    }

    public void method(Object obj) {
        System.out.println(obj);
    }

    // 自动装箱和自动拆箱
    @Test
    public void test3() {
        int num1 = 1;
        // 基本数据类型-->包装类型
        method(num1);

        // 自动装箱:基本数据类型 ==》 包装类
        int num2 = 11;
        Integer in2 = num2;  // 自动装箱


        // 自动拆箱:包装类 ==> 基本数据类型
        int num3 = in2; // 自动拆箱

    }

}
