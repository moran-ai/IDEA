package JAVA接口.作为参数或返回值;

import java.util.ArrayList;
import java.util.List;

/*
java.util.List是ArrayList所实现的接口
 */
public class DemoInterface {
    public static void main(String[] args) {
        // 左边是接口名称，右边是实现类名称，多态
        List<String> list = new ArrayList<>();
        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

    public static List<String> addNames(List<String> list){
        list.add("赵琳");
        list.add("1");
        list.add("2");
        return list;
    }
}
