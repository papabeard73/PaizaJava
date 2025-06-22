package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CStdout7 {
  public static String exec(InputStream in) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
    String line01 = reader.readLine(); // 1行読み込む

    if (line01 == null) {
      throw new IOException("failed to read input");
    }

    String[] inputs01 = line01.split(" "); // スペースで分割

    int numN = Integer.parseInt(inputs01[0]); // 最初の数値を取得
    int numM = Integer.parseInt(inputs01[1]); // 2番目の数値を取得

    String line02 = reader.readLine(); // 1行読み込む
    String[] inputs02 = line02.split(" "); // スペースで分割
    ArrayList<Integer> list02 = new ArrayList<>();
    // inputs02の各要素をリストに追加
    for (int i = 0; i < inputs02.length; i++) {
      list02.add(Integer.parseInt(inputs02[i])); // 2番目の行の数値を取得
    }

    // デバッグ用
//    System.out.println(list02); // リストの内容を出力

    String line03 = reader.readLine(); // 1行読み込む
    String[] inputs03 = line03.split(" "); // スペースで分割

    String result = "";

    for (int i = 0; i < inputs03.length; i++) {
      int num = Integer.parseInt(inputs03[i]); // 3番目の行の数値を取得
      List<Integer> newList = new ArrayList<>(list02.subList(0, num)); // 先頭3つを取得
      list02.subList(0, num).clear(); // 先頭3つを元リストから削除
      result += String.join(" ", newList.stream().map(String::valueOf).toArray(String[]::new)) + "\n"; // リストの内容をスペース区切りで文字列に変換
    }
    // デバッグ用
//    System.out.println(result); // リストの内容を出力

    return result;
  }
}
