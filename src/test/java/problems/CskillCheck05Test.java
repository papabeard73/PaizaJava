package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class CskillCheck05Test {
  @Test
  public void testExec() throws IOException {
    // 入力と期待される出力を定義
    String input = "10 3\n24\n35\n3\n";
    String expected = "20\n40\n10\n";

    InputStream in = new ByteArrayInputStream(input.getBytes());

    // E2Sevenクラスのexecメソッドを呼び出す
    String actual = CskillCheck05.exec(in);

    assertEquals(expected, actual);
  }
}