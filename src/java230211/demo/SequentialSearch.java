package java230211.demo;

/**
 * @ClassName: SequentialSearch
 * @Date: 2023/2/11 20:03
 * @Author: MOUNIN
 * @Description:
 **/
public class SequentialSearch {


    public static void main(String[] args) {
        String[] str = new String[]{"JJ", "NN", "BB", "AA", "CC", "ZZ"};

        String dest = "BB";
        boolean isFlag = true;

        for (int i = 0; i < str.length; i++) {
            if(dest.equals(str[i])) {
                System.out.println("查到了！" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.println("没找到！");
        }
    }
}
