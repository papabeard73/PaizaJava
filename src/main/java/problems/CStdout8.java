package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CStdout8 {
  public static String exec(InputStream in) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
    String line = reader.readLine(); // 1行読み込む
    int num = Integer.parseInt(line);

    String result = "";

    for (int i = 0; i < num; i++) {
      String line02 = reader.readLine(); // 1行読み込む
      String[] inputs = line02.split(" "); // スペースで分割

      double value = Double.parseDouble(inputs[0]);
      int places = Integer.parseInt(inputs[1]);

      BigDecimal bd = new BigDecimal(value);
      bd = bd.setScale(places, RoundingMode.HALF_UP); // 小数点以下を指定した桁数に丸める
      String roundedStr = bd.toPlainString();

//      System.out.println(roundedStr);

      result += roundedStr + "\n";
    }

    return result;
// あなたのコードを Scanner 版に書き換えると
//    Scanner sc = new Scanner(in);
//    int num = sc.nextInt();
//
//    StringBuilder sb = new StringBuilder();
//    for (int i = 0; i < num; i++) {
//      double value = sc.nextDouble();
//      int places   = sc.nextInt();
//      sb.append(String.format("%." + places + "f%n", value));
//    }
//    sc.close();
//    return sb.toString();
  }
}
