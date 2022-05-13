package avic_tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckPriceOfTheGoods extends BaseTest {

    @Test
    private void checkPriceOfTheGoodsIsEqualToPriceTotal() {
        getHomePage().productsСatalog();
        Assert.assertEquals(getHomePage().getPrice(), getHomePage().getTotalPrice());
    }
}
