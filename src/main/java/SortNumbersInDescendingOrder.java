import java.util.Comparator;
import java.util.List;

public class SortNumbersInDescendingOrder {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(20, 1, 34, 56, 12, 3, 5, 7);
    List<Integer> sortedNumbers = numbers.stream().sorted(Comparator.reverseOrder()).toList();
    System.out.println("Sorted numbers in descending order are : " + sortedNumbers);
  }
}
