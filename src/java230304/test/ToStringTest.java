package java230304.test;

import java.util.Date;

/**
 * @ClassName: ToStringTest
 * @Date: 2023/3/1 19:49
 * @Author: Honvin
 * @Description:
 **/
public class ToStringTest {

    public static void main(String[] args) {
        Customer cust  = new Customer();
        System.out.println(cust.toString());  // java230304.test.Customer@27973e9b
        System.out.println(cust);  // java230304.test.Customer@27973e9b

        String str = new String("MM");
        System.out.println(str);  // MM

        Date date = new Date();
        System.out.println(date.toString());  // Wed Mar 01 20:02:33 CST 2023

        Customer cust1  = new Customer("Tom", 18);
        System.out.println(cust1.toString());  // Customer{name='Tom', age=18}
        System.out.println(cust1);  // Customer{name='Tom', age=18}
    }
}

class Customer {
    String name;
    int age;

    public Customer() {
    }

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("eat....");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
