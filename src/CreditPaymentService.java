public class CreditPaymentService {
    public double calculate(int s, double p, int m) {
        double ann;
        double pm; // месячная процентная ставка
        double pm1;
        double pm1m; // (месячная процентная ставка + 1) возведенная в степень m
        pm = p / (100 * 12);
        pm1 = (1 + pm);
        pm1m = Math.pow(pm1, m);
        ann = s * ((pm * pm1m)/(pm1m - 1));
        return ann;
    }
}
