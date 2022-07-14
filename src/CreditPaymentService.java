public class CreditPaymentService {
    public int calculate(double m, int n, int amount) {
        // m - процентная ставка в месяц
        // n - кол-во платежей
        // amount - сумма кредита

        int monthlyPayment;

        monthlyPayment = (int) (((m * (Math.pow(1 + m, n))) / ((Math.pow(1 + m, n)) - 1)) * amount);
        return monthlyPayment;
    }
}

