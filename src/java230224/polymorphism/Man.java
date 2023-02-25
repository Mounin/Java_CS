package java230224.polymorphism;

/**
 * @ClassName: Man
 * @Date: 2023/2/24 20:58
 * @Author: MOUNIN
 * @Description:
 **/
public class Man extends Person{

    boolean isSmoking;

    public void earnMoney() {
        System.out.println("Man earnMoney....");
    }

    public void eat() {
        System.out.println("Man eat....");
    }

    public void walk() {
        System.out.println("Man walk...");
    }
}
