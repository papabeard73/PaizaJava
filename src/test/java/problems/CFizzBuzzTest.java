package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class CFizzBuzzTest {
  @Test
  public void testExec() throws IOException {
    // 入力と期待される出力を定義
    String input = "5\n";
    String expected = "1\n2\nFizz\n4\nBuzz\n";

    InputStream in = new ByteArrayInputStream(input.getBytes());

    // E2Sevenクラスのexecメソッドを呼び出す
    String actual = CFizzBuzz.exec(in);

    assertEquals(expected, actual);
  }
}