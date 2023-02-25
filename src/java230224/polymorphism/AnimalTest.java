package java230224.polymorphism;

/**
 * @ClassName: AnimalTest
 * @Date: 2023/2/24 21:24
 * @Author: MOUNIN
 * @Description:
 **/
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest at = new AnimalTest();
        at.func(new Dog());
        System.out.println("*****************");
        at.func(new Cat());
    }

    public void func(Animal animal) {
        animal.eat();
        animal.shout();
    }

    // 如果没有多态的话，就需要多写好多方法
    public void func(Dog dog) {
        dog.eat();
        dog.shout();
    }

    public void func(Cat cat) {
        cat.eat();
        cat.shout();
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal eat....");
    }

    public void shout() {
        System.out.println("Animal shout....");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("狗吃骨头！");
    }

    public void shout() {
        System.out.println("汪！汪！汪！");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃小鱼！");
    }

    public void shout() {
        System.out.println("喵！喵！喵！");
    }
}
