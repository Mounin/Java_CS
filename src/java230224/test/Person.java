package java230224.test;

/**
 * @ClassName: Person
 * @Date: 2023/2/24 19:23
 * @Author: MOUNIN
 * @Description:
 **/
public class Person {
    // 属性
    String name;
    int age;
    int id = 1001;

    // 构造器
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 方法
    public void eat() {
        System.out.println("Person eat....");
    }

    public void walk() {
        System.out.println("Person walk....");
    }
}
