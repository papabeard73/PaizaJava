public class TestCaseGenerator {
  public static void main(String[] args) {
    String txtInput = """
        10 3
        24
        35
        3
        """;
    String txtOutput = """
        20
        40
        10
        """;
    System.out.printf("String input = %s;\nString expected = %s;\n", convertToSingleLine(txtInput), convertToSingleLine(txtOutput));
  }

  public static String convertToSingleLine(String text) {
    String trimmed = text.trim();
    String singleLine = trimmed.replace("\r\n", "\n").replace("\n", "\\n");
    return "\"" + singleLine + "\\n\"";
  }
}
