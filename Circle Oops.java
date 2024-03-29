import java.util.*;

class Circle{
  double rad;
  int n;
  Circle(int n,int r){
    this.n=n;
    this.rad=r;
  }
  void print(){
    System.out.println("Radius of the circle is "+(int)rad);
    System.out.println("The area of the circle is "+Math.PI*rad*rad);
    System.out.println("The circumference of the circle is "+2*Math.PI*rad);
  }
}
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Circle c[]=new Circle[n];
    for(int i=0;i<n;i++){
      int r=sc.nextInt();
      c[i]=new Circle(n,r);
      c[i].print();
    } 
  }
}