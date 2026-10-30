import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findTheNonRepeatedCharacter {
  public static void main(String[] args) {
    String input = "Krishna is a good boy";
    Optional<Character> nonRepeatedCharacter =
        input
            .toLowerCase()
            .replace(" ", "")
            .chars()
            .mapToObj(c -> (char) c)
            .collect(
                Collectors.groupingBy(
                    Function.identity(), LinkedHashMap::new, Collectors.counting()))
            .entrySet()
            .stream()
            .filter(e -> e.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst();
    System.out.println(
        "The first non repeating character is : " + nonRepeatedCharacter.orElse(null));
  }
}
