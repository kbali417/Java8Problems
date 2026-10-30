import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringsToUpperCase {
  public static void main(String[] args) {
    List<String> numbers = List.of("one", "two", "three", "four");
    List<String> upperCaseNumbers =
        numbers.stream().map(String::toUpperCase).collect(Collectors.toList());
    System.out.println("upper case of the given Strings : " + upperCaseNumbers);
  }
}
