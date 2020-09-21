public class CreditPaymentService {
    public int calculate(float creditSum, float yearlyPercentageRate, float creditTerm) {
        float monthlyPercentageRate = yearlyPercentageRate / 100 / 12;
        int monthlyPayment = (int) (creditSum * (monthlyPercentageRate +
                (monthlyPercentageRate / (Math.pow((1 + monthlyPercentageRate), creditTerm) - 1))));

        return monthlyPayment;
    }
}
