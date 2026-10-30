import java.util.List;
import java.util.Optional;

public class findTheMaximumNumber {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(20, 1, 34, 56, 12, 3, 5, 7);
    Optional<Integer> maxNumber = numbers.stream().max(Integer::compareTo);
    System.out.println("Maximum number is : " + maxNumber.orElse(null));
  }
}
