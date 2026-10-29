import java.util.List;
import java.util.stream.Collectors;

public class FindNumbersGreaterThan10 {
    public static void main(String[] args){
        List<Integer> numbers = List.of(5, 10, 15, 20, 25, 30);
        List<Integer> numbersGreaterThan10 = numbers.stream().filter(i -> i>10).collect(Collectors.toList());
        System.out.println("Numbers greater than 10 from the list are : " + numbersGreaterThan10);
    }
}
