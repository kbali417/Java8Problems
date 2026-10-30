import java.util.*;

public class findTheFirstRepeatedCharacter {
  public static void main(String[] args) {
    String input = " Krishna is a good boy";
    Set<Character> seen = new HashSet<>();
    Optional<Character> firstRepeatedCharacter =
        input
            .toLowerCase()
            .replace(" ", "")
            .chars()
            .mapToObj(c -> (char) c)
            .filter(c -> !seen.add(c))
            .findFirst();
    System.out.println("The first repeating character is : " + firstRepeatedCharacter.orElse(null));
  }
}
