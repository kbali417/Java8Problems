public class checkIfStringIsPalindromeOrNot {
  public static void main(String[] args) {
    String inputString = "Madam";
    String normalizedString = inputString.toLowerCase();
    boolean result =
        normalizedString.equals(new StringBuilder(normalizedString).reverse().toString());
    if (result) {
      System.out.println("Given string is a palindrome");
    } else {
      System.out.println("Given String is not a palindrome");
    }
  }
}
