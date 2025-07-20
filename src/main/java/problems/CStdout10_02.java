package problems;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CStdout10_02 {
  public static String exec(InputStream in) throws IOException {
    Scanner sc = new Scanner(in);
    int numH = sc.nextInt();
    int numW = sc.nextInt();
    int numA = sc.nextInt();
    int numB = sc.nextInt();

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < numH; i++) {
      StringBuilder resultOneLine = new StringBuilder();
      for (int j = 0; j < numW; j++) {
        String outputA = String.format("%9d", numA);
        String outputB = String.format("%9d", numB);
        // numH行、numW列の入力を受け取る
        if (j == numW - 1) {
          resultOneLine.append(" | (").append(outputA).append(", ").append(outputB).append(")\n");
        } else if (j > 0) {
          resultOneLine.append(" | (").append(outputA).append(", ").append(outputB).append(")");
        } else if (j == 0) {
          resultOneLine.append("(").append(outputA).append(", ").append(outputB).append(")");
        }
      }
      result.append(resultOneLine);
      if (i < numH - 1) {
        int resultLength = resultOneLine.length();
        StringBuilder equal = new StringBuilder();
        for (int k = 0; k < resultLength - 1; k++) {
          equal.append("=");
        }
        result.append(equal).append("\n");
      }
    }
    sc.close();

    return result.toString();
  }
}
