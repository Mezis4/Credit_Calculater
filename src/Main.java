public class Main {

    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        /* я добавила rate (процентная ставка) в Main и в CreditPaymentService, т.к. в кредитном калькуляторе
            мы не выставляем процентную ставку, а получаем ее в выходных данных, значит
            она либо фиксированная, либо выставляется каким-то образом, который я не совсем понимаю.
            Если rate нужно выставлять один раз, то можете ли намекнуть,
            в каком ключе думать,чтобы rate использовался один раз?
         */
        double rate = 9.99;

        System.out.println();
        System.out.println("Ежемесячный платеж: " + service.calculate (1_000_000, 1));
        System.out.println("Процентная ставка " + rate);

        System.out.println();
        System.out.println("Ежемесячный платеж: " + service.calculate (1_000_000, 2));
        System.out.println("Процентная ставка " + rate);

        System.out.println();
        System.out.println("Ежемесячный платеж: " + service.calculate (1_000_000, 3));
        System.out.println("Процентная ставка " + rate);
    }
}
