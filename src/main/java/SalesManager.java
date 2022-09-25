public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = 2147483647;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long average() {
        long allSales = 0;
        for (long sale : sales) {
            allSales = allSales + sale;
        }
        int salesQuantity = sales.length;
        long max = max();
        long min = min();
        long average = (allSales - max - min) / (salesQuantity - 2);

        return average;
    }

}
