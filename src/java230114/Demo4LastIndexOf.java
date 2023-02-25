package java230114;

import java.util.ArrayList;

/**
 * @ClassName: Demo2Get
 * @Date: 2023/1/12 22:06
 * @Author: MOUNIN
 * @Description:
 **/
public class Demo4LastIndexOf {

    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("JD");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites.lastIndexOf("JD"));
    }
}
