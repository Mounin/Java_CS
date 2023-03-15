package test;

/**
 * @ClassName: A
 * @Date: 2023/3/11 11:03
 * @Author: Honvin
 * @Description:
 **/
class A {
    public void show() {
        show2();
    }
    public void show2() {
        System.out.println("我");
    }
}
class B extends A {
    /*
     //子类中没有父类中出现过的方法，则说明父类的方法被子类继承过来了。
    public void show() {
         show2();
    }
    */
    //子类中有和父类中一样的方法，叫方法重写。
    public void show2() {
        System.out.println("爱");
    }
}
class C extends B {
    public void show() {
        super.show();
    }
    public void show2() {
        System.out.println("你");
    }
}
public class DuoTaiTest4 {
    public static void main(String[] args) {
        A a = new B();
        a.show();

        B b = new C();
        b.show();
    }
}