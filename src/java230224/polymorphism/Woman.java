package java230224.polymorphism;

/**
 * @ClassName: Woman
 * @Date: 2023/2/24 21:00
 * @Author: MOUNIN
 * @Description:
 **/
public class Woman extends Person{
    boolean isBeauty;

    public void goShopping() {
        System.out.println("Woman goShopping....");
    }

    public void eat() {
        System.out.println("Woman eat....");
    }

    public void walk() {
        System.out.println("Woman walk...");
    }
}
