package java230218.test;

/**
 * @ClassName: CustomerTest
 * @Date: 2023/2/16 18:53
 * @Author: MOUNIN
 * @Description:
 **/
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer();

        cust1.eat();
        cust1.sleep(8);
    }
}

// 客户类
class Customer {
    // 属性
    String name;
    int age;
    boolean isMale;

    // 方法
    public void eat() {
        System.out.println("客户吃饭");
    }

    public void sleep(int hour) {
        System.out.println("休息了" + hour + "个小时");
        eat();
    }

    public String getName() {
        return name;
    }

    public String getNation(String nation) {
        String info = "我的国籍是：" + nation;
        return info;
    }
}
