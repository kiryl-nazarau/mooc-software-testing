package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.util.ArrayList;

public class TwoNumbersSumTest {

  TwoNumbersSum sum = new TwoNumbersSum();

  @Test
  public void test1() {
    ArrayList<Integer> first = new ArrayList<>();
    ArrayList<Integer> second = new ArrayList<>();
    first.add(0, 5);
    first.add(1, 5);
    second.add(0, 9);
    second.add(1, 9);
    ArrayList<Integer> result = sum.addTwoNumbers(first, second);
    ArrayList<Integer> expecedResult = new ArrayList<>();
    expecedResult.add(0, 1);
    expecedResult.add(1, 5);
    expecedResult.add(2, 4);

    Assertions.assertEquals(expecedResult, result);
  }
}
