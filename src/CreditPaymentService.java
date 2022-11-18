public class CreditPaymentService {
    public double calculate(int amount, double interestRate, int period) {
        double annuityPayment;
        double interestRateMonth; // месячная процентная ставка
        double pm1m; // (месячная процентная ставка + 1) возведенная в степень m
        interestRateMonth = interestRate / (100 * 12);
        pm1m = Math.pow((1 + interestRateMonth), period);
        annuityPayment = amount * ((interestRateMonth * pm1m)/(pm1m - 1));
        return annuityPayment;
    }
}
