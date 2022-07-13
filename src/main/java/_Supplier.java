import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getStudentsName());
        System.out.println(getStudentsNameFunction.get());
    }

    //functional style
    static Supplier<List<String>> getStudentsNameFunction = ()
            -> List.of("muhammad","musab","ariana","aisha");

    //normal function
    static List<String> getStudentsName(){
        return List.of("muhammad","musab","ariana","aisha");
    }
}
