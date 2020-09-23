public class CreditPaymentService {
    public int calculate(int creditSum, float yearlyPercentageRate, int creditTerm) {
        float monthlyPercentageRate = yearlyPercentageRate / 100 / 12;
        int monthlyPayment = (int) (creditSum * (monthlyPercentageRate +
                (monthlyPercentageRate / (Math.pow((1 + monthlyPercentageRate), creditTerm) - 1))));

        return monthlyPayment;
    }
}
