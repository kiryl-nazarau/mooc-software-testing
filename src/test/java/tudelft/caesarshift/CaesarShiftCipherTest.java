package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {

  @ParameterizedTest
  @CsvSource({"ab, 1, bc", "xyz, 3, abc", "d, -2, b", "aaa bbb ccc ddd, 1, bbb ccc ddd eee", "f, 0, f", " F, 5, invalid"})
  public void caesarShiftTest(String message, int shift, String expectedResult) {
    CaesarShiftCipher shiftCipher = new CaesarShiftCipher();
    String result = shiftCipher.caesarShiftCipher(message, shift);
    Assertions.assertEquals(expectedResult, result);
  }


}
