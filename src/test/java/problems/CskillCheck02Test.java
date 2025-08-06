package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class CskillCheck02Test {
  @Test
  public void testExec() throws IOException {
    // 入力と期待される出力を定義
    String input = "red green blue blue green blue\n";
    String expected = "red 1\ngreen 2\nblue 3\n";

    InputStream in = new ByteArrayInputStream(input.getBytes());

    // E2Sevenクラスのexecメソッドを呼び出す
    String actual = CskillCheck02.exec(in);

    assertEquals(expected, actual);
  }

  @Test
  public void testExec02() throws IOException {
    // 入力と期待される出力を定義
    String input = "Apple Apricot Orange Cherry Apple Orange Cherry Orange\n";
    String expected = "Apple 2\nApricot 1\nOrange 3\nCherry 2\n";

    InputStream in = new ByteArrayInputStream(input.getBytes());

    // E2Sevenクラスのexecメソッドを呼び出す
    String actual = CskillCheck02.exec(in);

    assertEquals(expected, actual);
  }
}