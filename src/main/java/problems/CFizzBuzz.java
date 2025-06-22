package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CFizzBuzz {
  public static String exec(InputStream in) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
    int num = Integer.parseInt(reader.readLine());

    String result = "";
    for (int i = 0; i < num; i++) {
      int n = i + 1; // 1から始まるため、iに1を足す
      if (n % 3 == 0 && n % 5 == 0) {
        result += "Fizz Buzz\n";
      } else if (n % 3 == 0) {
        result += "Fizz\n";
      } else if (n % 5 == 0) {
        result += "Buzz\n";
      } else {
        result += n + "\n";
      }
    }
    return result;
  }

}
