import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyBankEMICalculation {

	public static void main(String[] args) throws IOException
	{
		GetLoanType loanFactory = new GetLoanType();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the type of loan for which the EMI amount will be generated (Home/Car): ");
		String loanType = br.readLine();

		System.out.print("Enter the loan amount: ");
		int Amount = Integer.parseInt(br.readLine());

		System.out.print("Enter the number of years for loan repayment: ");
		int Years = Integer.parseInt(br.readLine());

		Loan loan = loanFactory.getLoan(loanType);
		loan.getRate();
		loan.calculateEMI(Amount, Years);
	}
}






