package java230218.test;

/**
 * @ClassName: Test1
 * @Date: 2023/2/15 20:45
 * @Author: MOUNIN
 * @Description:
 **/
public class Persion {
    // 属性，或成员变量
    String name;
    int age;
    boolean isMarried;

    // 构造器
    public Persion(){}
    public Persion(String n, int a, boolean im) {
        name = n;
        age = a;
        isMarried = im;
    }

    // 方法，或函数
    public void walk() {
        System.out.println("人走路。。。。");
    }
    public String display() {
        return "名字是：" + name + "，年龄是：" + age + "，Married：" + isMarried;
    }

    // 代码块
    {
        name = "MaDongmei";
        age = 23;
        isMarried = true;
    }

    // 内部类
    class pet {
        String name;
        float weight;
    }
}
