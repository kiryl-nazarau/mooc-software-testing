package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {

  @ParameterizedTest
  @CsvSource({ "abba, abba", "abca, a", "aa, aa", "e, e", "eeeteee, eeeteee", "ttggtt, ttggtt"})
  public void totalIsTooBig(String text, String expectedResult) {
    Mirror mirror = new Mirror();
    String result = mirror.mirrorEnds(text);
    Assertions.assertEquals(expectedResult, result);
  }
}
