package problems;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CskillCheck01 {
  public static String exec(InputStream in) throws IOException {
    Scanner sc = new Scanner(in);
    int num = sc.nextInt();

    ArrayList<String> words = new ArrayList<String>();

    for (int i = 0; i < num; i++){
      String word = sc.next();
      if (words.contains(word)) {
        words.remove(word);
        words.addFirst(word);
      } else {
        words.addFirst(word);
      }
    }

    StringBuilder result = new StringBuilder();
    for(String wordout: words){
      result.append(wordout).append("\n");
    }
    return result.toString();
  }
}
