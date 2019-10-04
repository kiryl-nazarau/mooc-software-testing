package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

  @ParameterizedTest
  @CsvSource({"gg","gga", "agg", "xxggxx", "xxggyyggxx", "ggg", "gggg"})
  public void gHappyTrueTest(String str) {
    GHappy gHappy = new GHappy();
    boolean result = gHappy.gHappy(str);
    Assertions.assertTrue(result);
  }

  @ParameterizedTest
  @CsvSource({"g", "gd", "dg", "fgf", "xxgxx", "xxgyyggxx", "gsdgg"})
  public void gHappyFalseTest(String str) {
    GHappy gHappy = new GHappy();
    boolean result = gHappy.gHappy(str);
    Assertions.assertFalse(result);
  }
}
