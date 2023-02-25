package java230218.test;

/**
 * @ClassName: Zoo
 * @Date: 2023/2/15 20:58
 * @Author: MOUNIN
 * @Description:
 **/
public class Zoo {
    public static void main(String[] args) {
        //创建对象
        Animal xb=new Animal();
        xb.legs=4;//访问属性
        System.out.println(xb.legs);
        xb.eat();//访问方法
        xb.move();//访问方法

    }
}
