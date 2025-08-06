package problems;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CskillCheck03 {
  public static String exec(InputStream in) throws IOException {
    Scanner sc = new Scanner(in);
    int winNumber = sc.nextInt();
    int sheetsNum = sc.nextInt();

    int adjacent01 = winNumber + 1;
    int adjacent02 = winNumber - 1;

    int second = winNumber % 10000;
    int third = winNumber % 1000;

    StringBuilder result = new StringBuilder();

    for (int i = 0; i < sheetsNum; i++){
      int currentNum = sc.nextInt();
      if(currentNum == winNumber){
        result.append("first").append("\n");
      } else if (currentNum == adjacent01 || currentNum == adjacent02){
        result.append("adjacent").append("\n");
      } else if (currentNum % 10000 == second ){
        result.append("second").append("\n");
      } else if (currentNum % 1000 == third ) {
        result.append("third").append("\n");
      } else {
        result.append("blank").append("\n");
      }
    }

    return result.toString();
  }
}
