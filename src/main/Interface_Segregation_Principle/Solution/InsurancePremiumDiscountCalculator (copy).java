public class InsurancePremiumDiscountCalculator{

  public int calculateDiscountHealthInsurance(CustimerProfile customer){
    if(customer.isLoyalCustomer()){
      return 20;
    }
    return 0;
  }

  
}