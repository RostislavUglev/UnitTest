public class Main {
    public static void main(String[] args) {
        long[] sales = {70, 35, 10, 60, 25};
        SalesManager salesManager = new SalesManager(sales);
        long maxSales = salesManager.max();
        System.out.println(maxSales);
        long averageSales = salesManager.average();
        System.out.println(averageSales);
    }

}
