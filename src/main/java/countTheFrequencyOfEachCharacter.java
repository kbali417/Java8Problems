import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countTheFrequencyOfEachCharacter {
  public static void main(String[] args) {
    String inputString = "Hi this is Krishna";
    Map<Character, Long> frequencyCount =
        inputString
            .toLowerCase()
            .replace(" ", "")
            .chars()
            .mapToObj(c -> (char) c)
            .collect(
                Collectors.groupingBy(
                    Function.identity(), LinkedHashMap::new, Collectors.counting()));
    System.out.println("Frequency of each character in the given string is : " + frequencyCount);
  }
}

// • inputString.chars(): "First, since Java doesn't have a direct Stream<Character> method, chars()
// is used to break the string down into an IntStream of Unicode/ASCII values."
//        • .mapToObj(c -> (char) c): "Next, we use mapToObj to cast those primitive integers back
// into object Character instances, giving us a Stream<Character>."
//        • .collect(...): "Then, we terminal-operate on the stream to collect the elements into a
// data structure using Collectors.groupingBy, which takes three parameters:"
//        1. Function.identity(): "This acts as the classifier, meaning the character itself becomes
// the key in our map."
//        2. LinkedHashMap::new: "This is a map factory. We explicitly pass a LinkedHashMap to
// ensure the final output preserves the chronological order in which the characters first appeared
// in the string."
//        3. Collectors.counting(): "This is the downstream collector that counts the occurrences of
// each character, mapping the character key to a Long value."
//
