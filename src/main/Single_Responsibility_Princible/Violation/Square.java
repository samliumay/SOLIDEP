//Square class creates a square, rotates and draws. Interesting
public class Square{

  private int side = 5;
  private boolean isHighResolutionMonitor = false;

  public int calculateArea(){
    return side*side;
  }
  public void draw(){
    if(isHighResolutionMonitor){
      // Does somethink
    }else{
      // Does somethink
    }
  }

  public void rotate(int degree){
    //Does Somethink. 
  }
  
  
}