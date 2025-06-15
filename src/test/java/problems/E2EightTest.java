package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class E2EightTest {
  @Test
  public void testExec() throws IOException {
    // 入力と期待される出力を定義
    String input = "3\naaaaa,bbbbbb,cccc\n";
    String expected = "aaaaa\nbbbbbb\ncccc\n";

    InputStream in = new ByteArrayInputStream(input.getBytes());
    // E2Sevenクラスのexecメソッドを呼び出す
    String actual = E2Eight.exec(in);

    assertEquals(expected, actual);
  }
}