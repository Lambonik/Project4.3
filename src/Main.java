public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int creditRub = 1_000_000;
        double percent = 9.99;
        double termYears1 = 1;
        double termYears2 = 2;
        double termYears3 = 3;

        System.out.println("Сумма кредита: " + creditRub + " ₽");
        System.out.println("Процентная ставка: " + percent + " %");
        System.out.println();
        System.out.println("На " + (int) termYears1 + " год:");
        System.out.println((int) service.calculate(creditRub, percent, termYears1) + " ₽");
        System.out.println();
        System.out.println("На " + (int) termYears2 + " года:");
        System.out.println((int) service.calculate(creditRub, percent, termYears2) + " ₽");
        System.out.println();
        System.out.println("На " + (int) termYears3 + " года:");
        System.out.println((int) service.calculate(creditRub, percent, termYears3) + " ₽");
    }
}
