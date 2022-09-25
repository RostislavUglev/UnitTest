import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tasting: SalesManager")
class SalesManagerTest {

    private SalesManager salesManager;

    @Test
    @DisplayName("Tasting MAX")
    void max() {
        long[] sales = {70, 35, 10, 60, 25};
        SalesManager salesManager = new SalesManager(sales);
        Assertions.assertEquals(70, salesManager.max());

    }

    @Test
    @DisplayName("Tasting MIN")
    void min() {
        long[] sales = {70, 35, 10, 60, 25};
        SalesManager salesManager = new SalesManager(sales);
        Assertions.assertEquals(10, salesManager.min());
    }

    @Test
    @DisplayName("Tasting AVG")
    void average() {
        long[] sales = {70, 35, 10, 60, 25};
        SalesManager salesManager = new SalesManager(sales);
        Assertions.assertEquals(40, salesManager.average());

    }
}

