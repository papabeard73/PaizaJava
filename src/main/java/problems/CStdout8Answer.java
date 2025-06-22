package problems;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CStdout8Answer {
  public static String exec(InputStream in) throws IOException {
    Scanner sc = new Scanner(in);

    int q = sc.nextInt();
    String result = "";
    for (int i = 0; i < q; i++) {
      double n = sc.nextDouble();
      int m = sc.nextInt();

      result += String.format("%." + m + "f\n", n);
    }

    sc.close();
    return result;
  }
}
