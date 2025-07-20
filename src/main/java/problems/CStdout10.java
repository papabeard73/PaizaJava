package problems;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CStdout10 {
  public static String exec(InputStream in) throws IOException {
    Scanner sc = new Scanner(in);
    int numH = sc.nextInt();
    int numW = sc.nextInt();
    int numA = sc.nextInt();
    int numB = sc.nextInt();

    String result = "";

    for (int i = 0; i < numH; i++) {
      for (int j = 0; j < numW; j++) {
        String outputA = String.format("%9d", numA);
        String outputB = String.format("%9d", numB);
        // numH行、numW列の入力を受け取る
        if (j == numW -1) {
          result += " | (" + outputA + ", " + outputB + ")" + "\n";
        } else if (j > 0) {
          result += " | (" + outputA + ", " + outputB + ")";
        } else if (j == 0) {
          result += "(" + outputA + ", " + outputB + ")";
        }
      }
      if (i < numH - 1) {
        int resultLength = result.length();
        String equal = "";
        for (int k = 0; k < resultLength - 1; k++) {
          equal += "=";
        }
        result += equal + "\n";
      }
    }
    sc.close();

    return result;
  }
}
