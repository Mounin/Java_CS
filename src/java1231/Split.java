package java1231;

public class Split {

    public static void main(String[] args) {
        String string = "http://192.168.0.1:8080";
        // 按照“.”进行分割，使用转义字符"\\."
        String[] firstArray = string.split(":|\\.");
        // 按照“.”进行两次分割，使用转义字符"\\."
        String[] secondArray = string.split("\\.", 2);
        // 输出str原值
        System.out.println("str的原值是：【" + string + "】");
        // 输出firstArray
        System.out.print("firstArray为：");
        for (String a : firstArray) {
            System.out.print("【" + a + "】");
        }
        System.out.println();
        // 输出secondArray
        System.out.print("secondArray为：\\");
        for (String a : secondArray) {
            System.out.print("【" + a + "】");
        }
    }
}
