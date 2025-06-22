package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CStdout6 {
  public static String exec(InputStream in) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
    int num = Integer.parseInt(reader.readLine());

    String result = "";

    for (int i = 0; i < num; i++) {
      String resultJ = ""; // 各行の結果を初期化
      for (int j = 0; j < num; j++) {
        int numi = i + 1; // 1から始まるため、iに1を足す
        int numj = j + 1; // 1から始まるため、jに1を足す
        int calc = numi * numj; // iとjの積を計算
        if (j == 0) {
          resultJ += calc;
        } else {
          resultJ += " " + calc; // 結果の前にスペースを追加
        }
      }
      result += resultJ + "\n"; // 各行の終わりに改行を追加
    }

    return result;
  }

}
