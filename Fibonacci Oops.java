import java.util.Scanner;
public class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    double a=2.3;
    Math.ceil(a);
    Math.floor(a);
    for(int i=2;i<=n;i++)
      {
        Fibonacci(i);
      }
  
  }
  static void Fibonacci(int n)
  {
    int n1=-1,n2=1,temp=0;
    while(temp<=n)
      {
        temp=n1+n2;
        n1=n2;
        n2=temp;
    if(temp==n)
    {
      System.out.println(n+" is a fibonacci number ");
      powerOfTwo(n);
      break;
    }
    }
  }
    
  static void powerOfTwo(int n)
  {
    int temp=2,j=0;
    while(temp<=n)
      {
        if(n==temp){
          System.out.println(n+" is a power of two");
          break;
        }
      
    temp*=2;
  }
  }
}