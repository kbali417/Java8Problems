import java.util.List;
import java.util.Optional;

public class calculateTheSumOfNumbers {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(20, 1, 34, 56, 12, 3, 5, 7);
    Optional<Integer> sumOfNumbers = numbers.stream().reduce(Integer::sum);
    System.out.println("Sum of the given numbers is : " + sumOfNumbers.orElse(null));
  }
}
