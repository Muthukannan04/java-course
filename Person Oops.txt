import java.util.*;

class person{
  private String name;
  private int age;
  person(String name,int age){
    this.name=name;
    this.age=age;
  }
  void print(){
    System.out.println("Name "+this.name+" with age "+this.age);
  }
}
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    person p[]=new person[n];
    for(int i=0;i<n;i++){
      String name=sc.next();
      int age=sc.nextInt();
      p[i]=new person(name,age);
      p[i].print();
    }
  }
}