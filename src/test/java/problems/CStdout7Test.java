package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class CStdout7Test {
  @Test
  public void testExec() throws IOException {
    // 入力と期待される出力を定義
    String input = "10 4\n1 2 3 4 5 6 7 8 9 10\n2 6 1 1\n";
    String expected = "1 2\n3 4 5 6 7 8\n9\n10\n";

    InputStream in = new ByteArrayInputStream(input.getBytes());

    // E2Sevenクラスのexecメソッドを呼び出す
    String actual = CStdout7.exec(in);

    assertEquals(expected, actual);
  }
}