package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class CskillCheck01Test {
  @Test
  public void testExec() throws IOException {
    // 入力と期待される出力を定義
    String input = "5\nbook\ncandy\napple\nbook\ncandy\n";
    String expected = "candy\nbook\napple\n";

    InputStream in = new ByteArrayInputStream(input.getBytes());

    // E2Sevenクラスのexecメソッドを呼び出す
    String actual = CskillCheck01.exec(in);

    assertEquals(expected, actual);
  }

  @Test
  public void testExec02() throws IOException {
    // 入力と期待される出力を定義
    String input = "6\napple\nbook\ninformation\nnote\npen\npineapple\n";
    String expected = "pineapple\npen\nnote\ninformation\nbook\napple\n";

    InputStream in = new ByteArrayInputStream(input.getBytes());

    // E2Sevenクラスのexecメソッドを呼び出す
    String actual = CskillCheck01.exec(in);

    assertEquals(expected, actual);
  }
}