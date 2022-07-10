public class CreditPaymentService {
    public int calculate(double m1, int n1, int amount1) {
        // m - процентная ставка в месяц
        // n - кол-во платежей
        // amount - сумма кредита

        int monthlyPayment;

        monthlyPayment = (int) (((m1 * (Math.pow(1 + m1, n1))) / ((Math.pow(1 + m1, n1)) - 1)) * amount1);
        return monthlyPayment;
    }

    public int calculate2(double m2, int n2, int amount2) {
        // m2 - процентная ставка в месяц
        // n2 - кол-во платежей
        // amount2 - сумма кредита

        int monthlyPayment2;

        monthlyPayment2 = (int) (((m2 * (Math.pow(1 + m2, n2))) / ((Math.pow(1 + m2, n2)) - 1)) * amount2);
        return monthlyPayment2;
    }

    public int calculate3(double m3, int n3, int amount3) {
        // m3 - процентная ставка в месяц
        // n3 - кол-во платежей
        // amount3 - сумма кредита

        int monthlyPayment3;

        monthlyPayment3 = (int) (((m3 * (Math.pow(1 + m3, n3))) / ((Math.pow(1 + m3, n3)) - 1)) * amount3);
        return monthlyPayment3;
    }
}

