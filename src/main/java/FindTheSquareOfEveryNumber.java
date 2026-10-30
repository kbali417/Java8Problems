import java.util.List;
import java.util.stream.Collectors;

public class FindTheSquareOfEveryNumber {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5);
    List<Integer> squareOfNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
    System.out.println("Square of the given numbers : " + squareOfNumbers);
  }
}
