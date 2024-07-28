public class InsurancePremiumDiscountCalculator{

  public int calculateDiscountHealthInsurance(HealthInsuranceCustomerProfile customer){
    if(customer.isLoyalCustomer()){
      return 20;
    }
    return 0;
  }

  public int calculateDiscountVechicleInsurance(VechileInsuranceCustomerProfile customer){
    if(customer.isLoyalCustomer()){
      return 20;
    }
    return 0;
  }
  
}