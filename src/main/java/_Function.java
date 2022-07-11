import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        System.out.println(incrementByOne(2));

        //normal
        int result=incrementByOneFunction.apply(2);
        System.out.println(result);
        System.out.println(multiplyByTenFunction.apply(result));

        //using andThen method
        System.out.println(incrementByOneFunction.andThen(multiplyByTenFunction).apply(2));
    }


    static Function<Integer,Integer> incrementByOneFunction = number -> number+1;
    static Function<Integer,Integer> multiplyByTenFunction = number -> number*10;

    public static int incrementByOne(int number){
        return number+1;
    }
}
