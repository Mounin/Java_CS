package java230114;

import java.util.ArrayList;

/**
 * @ClassName: Demo2Get
 * @Date: 2023/1/12 22:06
 * @Author: MOUNIN
 * @Description:
 **/
public class Demo6Set {

    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("JD");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.set(1, "Baidu");  // 修改第1个元素
        System.out.println(sites);
    }
}
