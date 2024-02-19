import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int Acc_id = sc.nextInt();
    String name = sc.next();
    int balance = sc.nextInt();
    int deposit = sc.nextInt();
    int neg_Value = sc.nextInt();
    
    
    VIPAccount vip = new VIPAccount(Acc_id,name,balance,deposit,neg_Value);
    vip.print();
    vip.setAccountBalance();
    vip.Credit();
    vip.setAccountBalance(neg_Value,balance);
  }
}

class Account{
  int Acc_id;
  String name;
  int balance;
  int deposit;
  int neg;
  
  Account(int Acc_id,String name, int balance,int deposit,int neg_Value){
    this.Acc_id = Acc_id;
    this.name = name;
    this.balance = balance;
    this.deposit = deposit;
    this.neg = neg_Value;
  }
  void print(){
    System.out.print(Acc_id+" "+name+" ");
  }
  void setAccountBalance(){
    if(balance <=0){
      balance=0;
    }
    if(Acc_id>=100 && Acc_id<=999){
      Acc_id = Acc_id;
    }else{
      Acc_id = -1;
    }
    
    System.out.println(balance);
    
  }
  void Credit(){
    balance+=deposit;
    System.out.println(balance);
  }
  
}
class VIPAccount extends Account{
  VIPAccount(int Acc_id,String name, int balance,int deposit,int neg_Value){
    super(Acc_id,name,balance,deposit,neg_Value);
  }

  void setAccountBalance(int neg,int balance){
    if(super.neg<=-10000){
      System.out.println(super.balance);
      System.out.println("The balance can be negative but no less than -10000");
    }
  }
}