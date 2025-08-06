package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class CskillCheck03Test {
  @Test
  public void testExec() throws IOException {
    // 入力と期待される出力を定義
    String input = "142358\n3\n195283\n167358\n142359\n";
    String expected = "blank\nthird\nadjacent\n";

    InputStream in = new ByteArrayInputStream(input.getBytes());

    // E2Sevenクラスのexecメソッドを呼び出す
    String actual = CskillCheck03.exec(in);

    assertEquals(expected, actual);
  }
}