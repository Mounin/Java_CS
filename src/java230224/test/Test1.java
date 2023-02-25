package java230224.test;

/**
 * @ClassName: Test1
 * @Date: 2023/2/24 19:11
 * @Author: MOUNIN
 * @Description:
 **/
public class Test1 {

    public static void main(String[] args) {
//        Person1 p = new Person1("zhangsan", 18);
//        System.out.println(p.name + p.age);
//        System.out.println(Person1.weight);
        Person1.add();
    }
}

class Person1 {
    String name;
    int age = 18;
    static int weight = 60;

    // 无参构造器(若不写构造器，则默认有一个无参构造器)
    public Person1() {

    }

    // 有参构造器
    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void add() {
        System.out.println("static add....");
        System.out.println(weight);
    }

    static {
        weight = 70;
        System.out.println("static block....");
    }
}
