package java230224.test;

/**
 * @ClassName: Student
 * @Date: 2023/2/24 19:25
 * @Author: MOUNIN
 * @Description:
 **/
public class Student extends Person {
    // 属性
    String major;
    int id = 1002;

    // 构造器
    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }

    // 方法
    @Override
    public void eat() {
        System.out.println("Student eat....");
    }

    public void study() {
        System.out.println("Student study....");
    }

    public void show() {
        System.out.println("name = " + name + ", age = " + age);
        System.out.println("默认情况下：id = " + id);
        System.out.println("使用super关键字：id = " + super.id);
        System.out.println("#########################3");
        eat();
        super.eat();
    }
}
