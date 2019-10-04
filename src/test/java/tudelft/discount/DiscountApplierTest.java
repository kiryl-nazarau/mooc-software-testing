package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {

  @Test
  public void discountApplierForBusinessTest() {
    ProductDao dao = Mockito.mock(ProductDao.class);

    Product businessProduct = new Product("B", 100.00, "BUSINESS");
    Product homeProduct = new Product("H", 100.00, "HOME");
    List<Product> products = Arrays.asList(businessProduct, homeProduct);

    Mockito.when(dao.all()).thenReturn(products);

    DiscountApplier discountApplier = new DiscountApplier(dao);
    discountApplier.setNewPrices();

    Assertions.assertEquals(100.00 * 1.1, businessProduct.getPrice());
    Assertions.assertEquals(100.00 * 0.9, homeProduct.getPrice());
  }
}
