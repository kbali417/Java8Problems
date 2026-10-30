import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateCharacaters {
  public static void main(String[] args) {
    String inputString = "Java is a programming language";
    Set<Character> result =
        inputString
            .toLowerCase()
            .replace(" ", "")
            .chars()
            .mapToObj(c -> (char) c)
            .collect(
                Collectors.groupingBy(
                    Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(e -> e.getValue() > 1)
            .map(Map.Entry::getKey)
            .collect(Collectors.toSet());
    System.out.println("Duplicate characters in the given String are :  " + result);
  }
}
