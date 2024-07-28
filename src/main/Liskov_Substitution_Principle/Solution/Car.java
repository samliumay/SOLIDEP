public class Car extends Vehicle{
  @Override
  public double getInteriorWidth(){
    return getCabinWidth();
  }

  public double getCabindWidth(){
    return 10;
  }
}