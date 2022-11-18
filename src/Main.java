public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService ();

        System.out.println("Срок кредита 1 год");
        System.out.println ("Ежемесячный платеж: " + (int) service.calculate (1_000_000, 9.99, 12) + " руб");
        System.out.println();
        System.out.println("Срок кредита 2 года");
        System.out.println ("Ежемесячный платеж: " + (int) service.calculate (1_000_000, 9.99, 24) + " руб");
        System.out.println();
        System.out.println("Срок кредита 3 года");
        System.out.println ("Ежемесячный платеж: " + (int) service.calculate (1_000_000, 9.99, 36) + " руб");
        System.out.println();

    }
}