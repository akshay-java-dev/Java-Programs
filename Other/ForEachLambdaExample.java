
import java.util.Arrays;
import java.util.List;

public class ForEachLambdaExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
            "Akshay", "Rahul", "Amit", "Sneha"
        );

        names.forEach(name -> System.out.println(name));
    }
}
