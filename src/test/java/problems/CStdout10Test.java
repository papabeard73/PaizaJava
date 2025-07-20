package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class CStdout10Test {
  @Test
  public void testExec() throws IOException {
    // 入力と期待される出力を定義
    String input = "2 3 7 8\n";
    String expected = "(        7,         8) | (        7,         8) | (        7,         8)\n========================================================================\n(        7,         8) | (        7,         8) | (        7,         8)\n";

    InputStream in = new ByteArrayInputStream(input.getBytes());

    // E2Sevenクラスのexecメソッドを呼び出す
    String actual = CStdout10.exec(in);

    assertEquals(expected, actual);
  }
}