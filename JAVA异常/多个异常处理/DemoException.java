package JAVA异常.多个异常处理;

import java.util.List;

public class DemoException {
    public static void main(String[] args) {
        /*
        多个异常使用捕获该如何处理
        1.多个异常分别处理
        2.多个异常一次捕获，多次处理
        3.多个异常一次捕获一次处理
         */

        // 1.多个异常分别处理
        /*
        try{
            int [] array = {1, 2, 3};
            System.out.println(array[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        try{
            List <Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        */

        // 2.多个异常一次捕获，多次处理
        /*
        try{
            int [] array = {1, 2, 3};
            System.out.println(array[3]);
            List <Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException b){
            System.out.println(b.getMessage());
        }
         */
        /*
        一个try多个catch的注意事项：
        catch里边定义异常变量，如果有子父类关系，子类异常变量必须写在上边，否则报错
        ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
         */

        // 3.一次捕获，一次处理
        try{
            int [] array = {1, 2, 3};
            System.out.println(array[4]);
            List <Integer> list = List.of(1, 2, 3);
            System.out.println(list.get(3));
        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
