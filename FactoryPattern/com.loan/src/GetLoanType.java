public class GetLoanType {
    //use getPlan method to get object of type Plan
    public Loan getLoan(String loanType){
        if(loanType == null){
            return null;
        }
        if(loanType.equalsIgnoreCase("HOMELOAN")) {
            return new HomeLoan();
        }
        else if(loanType.equalsIgnoreCase("CARLOAN")){
            return new CarLoan();
        }
        else if(loanType.equalsIgnoreCase("PERSONALLOAN")) {
            return new PersonalLoan();
        }
        else if(loanType.equalsIgnoreCase("BUSINEESLOAN")){
            return new BusinessLoan();
        }
        return null;
    }
}