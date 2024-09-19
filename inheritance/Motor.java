public class Motor extends Vehicle {

  @Override
 public void go(){
    System.out.println("The"+this.getPrice()+"Pesos"+ this.getYear()+""+this.getBrand()+"is moving");
}
public void stop(){
   System.out.println("The"+this.getPrice()+"Pesos"+ this.getYear()+""+this.getBrand()+"has stopped");
  }
  
}//end of the class