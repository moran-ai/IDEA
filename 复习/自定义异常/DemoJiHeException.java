package 复习.自定义异常;

public class DemoJiHeException {
    private static int sum;
    public static void main(String[] args) {
        try{
            add(7,9);
        }catch (JiHeException e){
            e.printStackTrace();
        }
    }

    public static void add(int x, int y) throws JiHeException{
        if(x > 10 || x < 0){
            throw new JiHeException("数字x不在指定范围内");
        } else if(y > 10 || y < 0){
            throw new JiHeException("数字y不在指定的范围内");
        }else {
            sum = x + y;
            System.out.println(sum);
        }
    }
}
