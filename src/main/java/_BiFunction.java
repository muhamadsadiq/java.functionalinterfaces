import java.util.function.BiFunction;


public class _BiFunction {

    public static void main(String[] args) {

        System.out.println(incrementByOneAndMultiply(2,50));

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(2,50));
    }

    //BiFunction means it takes two parameter
    static BiFunction<Integer,Integer,Integer> incrementByOneAndMultiplyBiFunction = (number, numToMultiplyBy)
            -> (number+1)*numToMultiplyBy ;
    //normal 2 parameter function
    public static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number+1)*numToMultiplyBy;
    }


}
