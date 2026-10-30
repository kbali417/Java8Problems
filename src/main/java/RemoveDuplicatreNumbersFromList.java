import java.util.List;

public class RemoveDuplicatreNumbersFromList {
  public static void main(String[] args) {
    List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35, 10, 15);
    List<Integer> distinctNumbers = numbers.stream().distinct().toList();
    System.out.println("Distinct numbers in the list: " + distinctNumbers);
  }
}
