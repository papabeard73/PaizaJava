package problems;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class CskillCheck02 {
  public static String exec(InputStream in) throws IOException {
    Scanner sc = new Scanner(in);
    String data = sc.nextLine();
    String[] array = data.split(" ");

    LinkedHashMap<String, Integer> words = new LinkedHashMap<String, Integer>();

    for(int i = 0; i < array.length; i++) {
      if (!words.containsKey(array[i])) {
        words.put(array[i], 1);
      } else {
        words.put(array[i], words.get(array[i]) + 1);
      }
    }

    StringBuilder result = new StringBuilder();
    for(Entry<String, Integer> entry: words.entrySet()){
      result.append(entry.getKey() + " " + entry.getValue()).append("\n");
    }
    return result.toString();
  }
}
