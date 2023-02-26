public class CreditPaymentService {
    public double calculate(double creditRub, double percent, double termYears) {

        double monthlyPayment = creditRub * percent / 12 / 100 / (1 - Math.pow(1 + percent / 12 / 100, -termYears * 12));

        return monthlyPayment;

    }
}
