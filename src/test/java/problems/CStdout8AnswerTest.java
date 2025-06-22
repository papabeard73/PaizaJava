package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class CStdout8AnswerTest {
  @Test
  public void testExec() throws IOException {
    // 入力と期待される出力を定義
    String input = "4\n0.813 1\n0.813 2\n0.813 3\n0.813 4\n";
    String expected = "0.8\n0.81\n0.813\n0.8130\n";

    InputStream in = new ByteArrayInputStream(input.getBytes());

    // E2Sevenクラスのexecメソッドを呼び出す
    String actual = CStdout8Answer.exec(in);

    assertEquals(expected, actual);
  }
}