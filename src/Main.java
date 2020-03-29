public class Main {
    public static void main(String[] args) {
        CreditCalculatorService service = new CreditCalculatorService(); //создание экземпляра класса
        int monthlyPaymentForYear = (int) service.calculate(1_000_000, 9.99, 12);
        int monthlyPaymentForTwoYears = (int) service.calculate(1_000_000, 9.99, 24);
        int mounthlyPaymentFotThreeYears = (int) service.calculate(1_000_000,9.99, 36);
        System.out.println(monthlyPaymentForYear);
        System.out.println(monthlyPaymentForTwoYears);
        System.out.println(mounthlyPaymentFotThreeYears);
    }
}
