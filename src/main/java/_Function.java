import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        System.out.println(incrementByOne(2));
        System.out.println(incrementByOneFunction.apply(2));
    }


    static Function<Integer,Integer> incrementByOneFunction = number -> number+1;
    //normal function
    public static int incrementByOne(int number){
        return number+1;
    }
}
