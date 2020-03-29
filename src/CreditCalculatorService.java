public class CreditCalculatorService {
    public double calculate(double amountOfCredit, double rate, int month)
    {
        double partOfRate = rate / 100 / 12; // 1/12 процентной ставки
        double result = amountOfCredit * (partOfRate + (partOfRate / (Math.pow(1 + partOfRate, month) - 1))); //формула вычисления ежемесечного платежа
        return  result;
    }
}
