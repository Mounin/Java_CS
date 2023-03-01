package java230304.test;

/**
 * @ClassName: ObjectTest
 * @Date: 2023/3/1 19:31
 * @Author: MOUNIN
 * @Description:
 **/
public class ObjectTest {

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());
    }
}

class Order {

}
