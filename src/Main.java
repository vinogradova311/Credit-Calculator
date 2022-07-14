public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double mYear = 9.99; // годовая процентная ставка
        double m = (mYear / 12) / 100; // процентная ставка в месяц
        int n = 12; // кол-во ежемесячных платежей
        int amount = 1000000; // сумма кредита

        int monthlyPayment1 = service.calculate((double) m, n, amount);
        System.out.println(monthlyPayment1);

        int monthlyPayment2 = service.calculate((double) m, n * 2, amount);
        System.out.println(monthlyPayment2);

        int monthlyPayment3 = service.calculate((double) m, n * 3, amount);
        System.out.println(monthlyPayment3);
    }
}

