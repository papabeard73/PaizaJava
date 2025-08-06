package problems;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CskillCheck05 {
  public static String exec(InputStream in) throws IOException {
    Scanner sc = new Scanner(in);
    int numN = sc.nextInt();
    int numM = sc.nextInt();

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < numM; i++){
      double orange = sc.nextInt();
      long calcOrange = Math.round( orange / numN ); // 四捨五入

      if ( orange <= numN ) {
        result.append(numN).append("\n");
      } else {
        result.append((int)(calcOrange * numN)).append("\n");
      }
    }

    return result.toString();
  }
}
