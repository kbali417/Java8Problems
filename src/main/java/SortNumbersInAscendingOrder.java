import java.util.List;

public class SortNumbersInAscendingOrder {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(20, 1, 34, 56, 12, 3, 5, 7);
    List<Integer> sortedNumbers = numbers.stream().sorted().toList();
    System.out.println("Sorted numbers in ascending order are : " + sortedNumbers);
  }
}
