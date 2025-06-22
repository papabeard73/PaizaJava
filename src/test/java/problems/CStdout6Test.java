package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class CStdout6Test {
  @Test
  public void testExec() throws IOException {
    // 入力と期待される出力を定義
    String input = "3\n";
    String expected = "1 2 3\n2 4 6\n3 6 9\n";

    InputStream in = new ByteArrayInputStream(input.getBytes());

    // E2Sevenクラスのexecメソッドを呼び出す
    String actual = CStdout6.exec(in);

    assertEquals(expected, actual);
  }

}