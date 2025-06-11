package problems;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.junit.jupiter.api.Test;

class practiceTest {
  @Test
  public void testExec() throws IOException {
    String input = "hello\n";
    String expected = "hello\n";

    InputStream in = new ByteArrayInputStream(input.getBytes());
    String actual = practice.exec(in);

    assertEquals(expected, actual);
  }

  @Test
  public void testWorld() throws IOException {
    String input = "world\n";
    String expected = "world\n";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    String actual = practice.exec(in);
    assertEquals(expected, actual);
  }
}