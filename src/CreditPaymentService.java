public class CreditPaymentService {

    public int calculate(int amount, int time) {
        double rate = 9.99;
        double monthRate = rate / 12 / 100;
        int months = time * 12;
        double result = 1 + monthRate;

        double coefficient = (monthRate * Math.pow(result, months) / (Math.pow(result, months) - 1));
        int payment = (int) (coefficient * amount);
        return payment;
    }

}
