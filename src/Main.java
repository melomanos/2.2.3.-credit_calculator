public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        float creditSum = 1_000_000;
        float yearlyPercentageRate = (float) 9.99;
        float creditTerm = 12;
        int creditPaymentServiceOneYear = service.calculate(creditSum, yearlyPercentageRate, creditTerm);
        System.out.println(creditPaymentServiceOneYear);

        creditSum = 1_000_000;
        yearlyPercentageRate = (float) 9.99;
        creditTerm = 24;
        int creditPaymentServiceTwoYears = service.calculate(creditSum, yearlyPercentageRate, creditTerm);
        System.out.println(creditPaymentServiceTwoYears);

        creditSum = 1_000_000;
        yearlyPercentageRate = (float) 9.99;
        creditTerm = 36;
        int creditPaymentServiceThreeYears = service.calculate(creditSum, yearlyPercentageRate, creditTerm);
        System.out.println(creditPaymentServiceThreeYears);
    }
}
