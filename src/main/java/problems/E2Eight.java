package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class E2Eight {
  public static String exec(InputStream in) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
    int num = Integer.parseInt(reader.readLine());
    String[] words = reader.readLine().split(",");

    String result = "";
    for (int i = 0; i < num; i++) {
      result +=  words[i] + "\n";
    }
    return result;
  }
}
