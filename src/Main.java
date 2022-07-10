public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double mYear1 = 9.99; // годовая процентная ставка
        double m1 = (mYear1 / 12) / 100; // процентная ставка в месяц
        int n1 = 12; // кол-во ежемесячных платежей
        int amount1 = 1000000; // сумма кредита

        int monthlyPayment = service.calculate((double) m1, n1, amount1);
        System.out.println(monthlyPayment);


        double mYear2 = 9.99; // годовая процентная ставка
        double m2 = ((mYear2 / 12) / 100); // процентная ставка в месяц
        int n2 = 24; // кол-во ежемесячных платежей
        int amount2 = 1000000; // сумма кредита

        int monthlyPayment2 = service.calculate2((double) m2, n2, amount2);
        System.out.println(monthlyPayment2);

        double mYear3 = 9.99; // годовая процентная ставка
        double m3 = (mYear3 / 12) / 100; // процентная ставка в месяц
        int n3 = 36; // кол-во ежемесячных платежей
        int amount3 = 1000000; // сумма кредита

        int monthlyPayment3 = service.calculate3((double) m3, n3, amount3);
        System.out.println(monthlyPayment3);
    }
}

