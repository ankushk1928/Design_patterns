abstract class Loan {
    protected double intrestRate;

    abstract void getRate();

    public void calculateEMI(int amount,int years)
    {
        int numberOfMonths = years * 12;
        double monthlyInterestRate = intrestRate / 12 / 100;

        double emi = (amount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfMonths))
                / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1);

        System.out.println("EMI amount for Home Loan: " + emi);
    }
}
