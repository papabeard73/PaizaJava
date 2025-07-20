public class TestCaseGenerator {
  public static void main(String[] args) {
    String txtInput = """
        6
        apple
        book
        information
        note
        pen
        pineapple
        """;
    String txtOutput = """
        pineapple
        pen
        note
        information
        book
        apple
        """;
    System.out.printf("{%s, %s},\n", convertToSingleLine(txtInput), convertToSingleLine(txtOutput));
  }

  public static String convertToSingleLine(String text) {
    String trimmed = text.trim();
    String singleLine = trimmed.replace("\r\n", "\n").replace("\n", "\\n");
    return "\"" + singleLine + "\\n\"";
  }
}
