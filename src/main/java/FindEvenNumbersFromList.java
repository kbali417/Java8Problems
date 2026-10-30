import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumbersFromList {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35);
    List<Integer> evenNumbers =
        numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
    System.out.println("Even numbers from the list are : " + evenNumbers);
  }
}
