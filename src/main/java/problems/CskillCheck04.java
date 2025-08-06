package problems;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CskillCheck04 {

  public static String exec(InputStream in) throws IOException {

    Scanner sc = new Scanner(in);
    int num = sc.nextInt();
    ArrayList<String> ballKinds = new ArrayList<String>();
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < num; i++) {
      String kind = sc.next();
      ballKinds.add(kind);
      switch (kind) {
        case "ball":
          int countBall = 0;
          for (String s : ballKinds) {
            if ("ball".equals(s)) {
              countBall++;
            }
          }
          if (countBall == 4) {
            result.append("fourball!").append("\n");
          } else {
            result.append("ball!").append("\n");
          }
          break;
        case "strike":
          int countStrike = 0;
          for (String s : ballKinds) {
            if ("strike".equals(s)) {
              countStrike++;
            }
          }
          if (countStrike == 3) {
            result.append("out!").append("\n");
          } else {
            result.append("strike!").append("\n");
          }
          break;
        default:
          break;
      }
    }
    return result.toString();
  }
}
