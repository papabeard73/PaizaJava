package problems;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CStdout9 {
  public static String exec(InputStream in) throws IOException {
    Scanner sc = new Scanner(in);
    int numN = sc.nextInt();
    int numM = sc.nextInt();

    String result = "";
    for (int i = 0; i < numN; i++) {
      int inputNum = sc.nextInt();
      result += String.format("%" + numM + "d%n", inputNum);
    }
    sc.close();

    return result;
  }

}
