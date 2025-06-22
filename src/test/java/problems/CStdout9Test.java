package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class CStdout9Test {
  @Test
  public void testExec() throws IOException {
    // 入力と期待される出力を定義
    String input = "4 3\n0\n8\n81\n813\n";
    String expected = "  0\n  8\n 81\n813\n";

    InputStream in = new ByteArrayInputStream(input.getBytes());

    // E2Sevenクラスのexecメソッドを呼び出す
    String actual = CStdout9.exec(in);

    assertEquals(expected, actual);
  }
}