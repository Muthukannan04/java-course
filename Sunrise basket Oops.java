import java.util.*;

class Sun{
  String name;
  double deposit;
  double costPerDay;

  public void setDeposit(double deposit){
    this.deposit=deposit;
  }
  public void Cost(double costPerDay){
    this.costPerDay=costPerDay;
  }
  void print(){
    System.out.println("Name : "+this.name);
    System.out.println("Deposit Amount : "+this.deposit);
    System.out.println("Cost per day : "+this.costPerDay);
  }
}
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String name;
    double deposit,costPerDay;
    name=sc.nextLine();
    deposit=sc.nextDouble();
    costPerDay=sc.nextDouble();
    Sun s=new Sun();
    s.name=name;
    s.setDeposit(deposit);
    s.Cost(costPerDay);
    s.print();
  }
}
