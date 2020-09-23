public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditSum = 1_000_000;
        float yearlyPercentageRate = 9.99F;
        int creditTerm = 12;
        int creditPaymentServiceOneYear = service.calculate(creditSum, yearlyPercentageRate, creditTerm);
        System.out.println(creditPaymentServiceOneYear);

        creditSum = 1_000_000;
        yearlyPercentageRate = 9.99F;
        creditTerm = 24;
        int creditPaymentServiceTwoYears = service.calculate(creditSum, yearlyPercentageRate, creditTerm);
        System.out.println(creditPaymentServiceTwoYears);

        creditSum = 1_000_000;
        yearlyPercentageRate = 9.99F;
        creditTerm = 36;
        int creditPaymentServiceThreeYears = service.calculate(creditSum, yearlyPercentageRate, creditTerm);
        System.out.println(creditPaymentServiceThreeYears);
    }
}
