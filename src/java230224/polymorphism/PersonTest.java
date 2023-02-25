package java230224.polymorphism;

/**
 * @ClassName: PersonTest
 * @Date: 2023/2/24 21:01
 * @Author: MOUNIN
 * @Description:
 **/
public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 18;
        man.earnMoney();

        //********************************************
        System.out.println("*******************");
        // 对象的多态性：父类的引用指向子类的对象。
        Person p2 = new Man();
        // 多态的使用：当调用子父类同名同参数的方法时，实际执行的时子类重写父类的方法-----虚拟方法调用。
        p2.eat();  // Man eat....
        p2.walk();  // Man walk...
        // p2中只能调用Person中声明的方法
        // 编译看左，执行看右。
//        p2.earnMoney();  // Cannot resolve method 'earnMoney' in 'Person'
    }
}
