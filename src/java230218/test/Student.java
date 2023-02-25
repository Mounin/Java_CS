package java230218.test;

/**
 * @ClassName: Student
 * @Date: 2023/2/16 16:03
 * @Author: MOUNIN
 * @Description:
 **/
public class Student {
    // 属性
    public String name;
    int age;
    String major;
    String interests;
    static boolean isStatic = true;

    // 方法
    public String say() {
        return "姓名：" + name + "\n年龄：" + age + "\n专业：" + major + "\n兴趣：" + interests;
    }
}
