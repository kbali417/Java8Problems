import java.util.List;
import java.util.Optional;

public class findTheMinimumNumber {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(20, 1, 34, 56, 12, 3, 5, 7);
    Optional<Integer> minNumber = numbers.stream().min(Integer::compareTo);
    System.out.println("Minimum number is : " + minNumber.orElse(null));
  }
}
