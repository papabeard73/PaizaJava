package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class CStdout10_02Test {
  @Test
  public void testExec() throws IOException {
    // 入力と期待される出力を定義
    String input = "3 2 999999999 0\n";
    String expected = "(999999999,         0) | (999999999,         0)\n===============================================\n(999999999,         0) | (999999999,         0)\n===============================================\n(999999999,         0) | (999999999,         0)\n";

    InputStream in = new ByteArrayInputStream(input.getBytes());

    // E2Sevenクラスのexecメソッドを呼び出す
    String actual = CStdout10_02.exec(in);

    assertEquals(expected, actual);
  }
}