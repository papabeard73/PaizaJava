package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class CStdin2Test {
  @Test
  public void testExec() throws IOException {
    // 入力と期待される出力を定義
    String input = "one two three four five\n";
    String expected = "one\ntwo\nthree\nfour\nfive\n";
    InputStream in = new ByteArrayInputStream(input.getBytes());

    // E2Sevenクラスのexecメソッドを呼び出す
    String actual = CStdin2.exec(in);

    assertEquals(expected, actual);
  }
}