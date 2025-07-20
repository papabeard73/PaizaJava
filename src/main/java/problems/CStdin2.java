package problems;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CStdin2 {
  public static String exec(InputStream in) throws IOException {
    Scanner sc = new Scanner(in);
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < 5; i++) {
      String word = sc.next();
      result.append(word).append("\n");
    }
    return result.toString();
  }
}
